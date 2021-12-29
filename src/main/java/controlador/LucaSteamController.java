package controlador;

import gui.Menus;
import modelo.Genero;
import modelo.Juego;
import modelo.Plataforma;
import servicios.JuegosServicios;
import utilidad.LecturaServicio;

import java.util.Arrays;
import java.util.List;

import excepciones.EditorException;
import excepciones.GeneroException;
import excepciones.YearException;

/**
 * @author Grupo01 Jaume y Natalia
 */

public class LucaSteamController {

    private JuegosServicios servicios = new JuegosServicios();

    /**
     * Da la bienvenida e imprime el men?
     */
    public void start() {
        boolean seguir = true;
        servicios.cogeCSV();
        Menus.darBienvenida();
        do {
            Menus.imprimirMenu();
            seguir = this.elegirOpcion();
        }
        while (seguir);
        Menus.darDespedida();

    }

    /**
     * Te da a elegir una opci?n de las del men?
     *
     * @return continuar boolean
     */


    public boolean elegirOpcion() {
        boolean continuar = true;
        try {
            switch (utilidad.LecturaServicio.escribeNum()) {
                case 1:
                    //Dar de alta un juego
                    servicios.altaJuegoNuevo();
                    ;
                    break;
                case 2:
                    //Ver listado juegos
                    servicios.listarTodo();
                    break;
                case 3:
                    //Ver listas espec?ficas
                    listaEspecifica();
                    break;
                case 4:
                    //Filtra en funcion de las preferencias del usuario
                    elegirFiltro();
                    break;
                case 0:
                    continuar = stop();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());

            throw new IllegalArgumentException("No existe esa opci?n: " + utilidad.LecturaServicio.escribeNum());
        }
        return continuar;
    }

    /**
     * Te da a elegir una opci?n de las del submen? "3. listas especificas"
     */

    public void listaEspecifica() {
        Menus.listasEspecificas();
        try {
            switch (utilidad.LecturaServicio.escribeNum()) {
                case 1:
                    //Dar listado de juegos de g?nero plataforma
                    listadoGeneroPlataforma();
                    break;
                case 2:
                    //Dar listado de juegos para consolas de Nintendo
                    listadoNintendo();
                    break;
                case 3:
                    //Dar listado de editores disponibles.
                    listadoEditores();
                    break;
                case 4:
                    //Dar listado de los juegos del siglo XX
                    listadoSigloXX();
                case 0:
                    Menus.imprimirMenu();
                    elegirOpcion();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            throw new IllegalArgumentException("No existe esa opci?n: " + utilidad.LecturaServicio.escribeNum());
        }
        Menus.imprimirMenu();
        elegirOpcion();
    }


    /**
     * Cierra el men?
     *
     * @return siONo boolean
     */

    public boolean stop() throws Exception {
        String siONo = utilidad.LecturaServicio.escribeTexto("Confirme si quiere salir. (S/N)");
        return (siONo.toUpperCase().charAt(0) != 'S');
    }

    public void elegirFiltro() throws GeneroException{
		listadoFiltros();
        String entrada = LecturaServicio.escribeTexto("Elija el filtro que desea: ");
        String entradaMinuscula = entrada.toLowerCase();

        switch (entradaMinuscula) {
            case "editor":
                //Exception si no existe editor
                System.out.println(servicios.filtroEditor(LecturaServicio.escribeTexto(" Elija el editor que quiera: ")));
                
                break;
            case "plataforma":
                System.out.println("Plataformas disponibles: \n" + Arrays.asList(Plataforma.values()));
				System.out.println(servicios.filtroPlataforma(LecturaServicio.escribeTexto(" Elija la plataforma que quiera tal y como est? escrito ")));
				break;
            case "fecha de publicacion":
                System.out.println(servicios.filtroFechaPublicacion(LecturaServicio.escribeTexto(" Elija la fecha de publicación que quiera ")));
                
                break;
            case "genero":
                System.out.println("Generos disponibles: \n" + Arrays.asList(Genero.values()));
                System.out.println(servicios.filtroGenero(LecturaServicio.escribeTexto(" Elija el genero que quieras tal y como esta escrito ")));

                break;
            default:
                throw new IllegalArgumentException("No existe este filtro " + entrada);
        }
    }


    public void listadoFiltros() {
        System.out.println(
                """
                        FILTROS DISPONIBLES:\s
                        Editor\s
                        Plataforma\s
                        Fecha de Publicacion\s
                        Genero""".indent(1));

    }

    /**
     * Devuelve la lista filtrada por genero "plataforma"
     */

    public List<Juego> listadoGeneroPlataforma() {
    	
        System.out.println(servicios.filtroGenero("Platform"));
        return servicios.filtroGenero("Platform");
    }

    /**
     * Devuelve la lista filtrada por editor "Nintendo"
     */

    public void listadoNintendo() {
        System.out.println(servicios.filtroEditor("Nintendo"));
    }

    /**
     * Devuelve la lista de editores disponibles
     */

    public void listadoEditores() {
    	for (int i = 0; i < servicios.listarEditores().size(); i++) {
    		System.out.println("*"+servicios.listarEditores().get(i));
		}
    	
    }

    /**
     * Devuelve la lista filtrada por sigloXX (a?o<1999)

    /**
     * Devuelve la lista filtrada por sigloXX (año<1999)
     */

    public void listadoSigloXX() {
        for (int i=1980;i<=1999;i++) {
            System.out.println(servicios.filtroFechaPublicacion(Integer.toString(i)));
        }
    }
}