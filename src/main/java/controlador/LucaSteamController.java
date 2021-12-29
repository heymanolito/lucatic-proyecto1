package controlador;

import gui.Menus;
import modelo.Genero;
import modelo.Juego;
import modelo.Plataforma;
import servicios.JuegosServicios;
import utilidad.LecturaServicio;
import java.util.Arrays;
import java.util.List;
import excepciones.GeneroException;

/**
 * Nombre de la clase: LucaSteamController. Descripcion: Esta clase permite la
 * implementacion de los servicion y las interfaces gráficas. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Natalia Borrego Lopez, Jose Manuel Molina Llamas y Jaume Subirats Martin
 */

public class LucaSteamController {

	private JuegosServicios servicios = new JuegosServicios();

	/**
	 * Metodo que inicia el programa, da la bienvenida e imprime el menu principal.
	 */

	public void start() {
		boolean seguir = true;
		servicios.cogeCSV();
		Menus.darBienvenida();
		do {
			Menus.imprimirMenu();
			seguir = this.elegirOpcion();
		} while (seguir);
		Menus.darDespedida();

	}

	/**
	 * Da a elegir una opcion de las del menu y las ejecuta.
	 *
	 * @return continuar devuelve un booleano que determina si el programa continua
	 *         o no.
	 */

	public boolean elegirOpcion() {
		boolean continuar = true;
		try {
			switch (utilidad.LecturaServicio.escribeNum()) {
			case 1:
				// Dar de alta un juego
				servicios.altaJuegoNuevo();
				;
				break;
			case 2:
				// Ver listado juegos
				servicios.listarTodo();
				break;
			case 3:
				// Ver listas espec?ficas
				listaEspecifica();
				break;
			case 4:
				// Filtra en funcion de las preferencias del usuario
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
	 * Da a elegir una opcion de las del submenu "3. listas especificas" y las
	 * ejecuta.
	 */

	public void listaEspecifica() {
		Menus.listasEspecificas();
		try {
			switch (utilidad.LecturaServicio.escribeNum()) {
			case 1:
				// Dar listado de juegos de g?nero plataforma
				listadoGeneroPlataforma();
				break;
			case 2:
				// Dar listado de juegos para consolas de Nintendo
				listadoNintendo();
				break;
			case 3:
				// Dar listado de editores disponibles.
				listadoEditores();
				break;
			case 4:
				// Dar listado de los juegos del siglo XX
				listadoSigloXX();
			case 0:
				Menus.imprimirMenu();
				elegirOpcion();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
			throw new IllegalArgumentException("No existe esa opcion: " + utilidad.LecturaServicio.escribeNum());
		}
		Menus.imprimirMenu();
		elegirOpcion();
	}

	/**
	 * Cierra el menu principal
	 *
	 * @return siONo devuelve un boolean que determina si el programa continua o no.
	 */

	public boolean stop() throws Exception {
		String siONo = utilidad.LecturaServicio.escribeTexto("Confirme si quiere salir. (S/N)");
		return (siONo.toUpperCase().charAt(0) != 'S');
	}

	/**
	 * Pregunta al usuario como quiere filtrar la lista cargada previamente. Primero
	 * pregunta por el filtro, y luego la categoria dentro del filtro.
	 */

	public void elegirFiltro() throws GeneroException {
		listadoFiltros();
		String entrada = LecturaServicio.escribeTexto("Elija el filtro que desea: ");
		String entradaMinuscula = entrada.toLowerCase();

		switch (entradaMinuscula) {
		case "editor":
			// Exception si no existe editor
			System.out.println(servicios.filtroEditor(LecturaServicio.escribeTexto(" Elija el editor que quiera: ")));

			break;
		case "plataforma":
			System.out.println("Plataformas disponibles: \n" + Arrays.asList(Plataforma.values()));
			System.out.println(servicios.filtroPlataforma(
					LecturaServicio.escribeTexto(" Elija la plataforma que quiera tal y como est? escrito ")));
			break;
		case "fecha de publicacion":
			System.out.println(servicios.filtroFechaPublicacion(
					LecturaServicio.escribeTexto(" Elija la fecha de publicación que quiera ")));

			break;
		case "genero":
			System.out.println("Generos disponibles: \n" + Arrays.asList(Genero.values()));
			System.out.println(servicios.filtroGenero(
					LecturaServicio.escribeTexto(" Elija el genero que quieras tal y como esta escrito ")));

			break;
		default:
			throw new IllegalArgumentException("No existe este filtro " + entrada);
		}
	}

	/**
	 * Devuelve una lista con todas las opciones para poder filtrar una lista.
	 * 
	 */

	public void listadoFiltros() {
		System.out.println("""
				FILTROS DISPONIBLES:\s
				Editor\s
				Plataforma\s
				Fecha de Publicacion\s
				Genero""".indent(1));

	}

	/**
	 * Devuelve la lista filtrada por genero "plataforma"
	 * 
	 * @return Una lista filtrada por genero "plataforma"
	 */

	public List<Juego> listadoGeneroPlataforma() {

		System.out.println(servicios.filtroGenero("Platform"));
		return servicios.filtroGenero("Platform");
	}

	/**
	 * Devuelve la lista filtrada por editor "Nintendo".
	 * 
	 * @return Una lista filtrada por editor "Nintendo".
	 */

	public void listadoNintendo() {
		System.out.println(servicios.filtroEditor("Nintendo"));
	}

	/**
	 * Devuelve la lista de editores disponibles.
	 * 
	 * @return Una lista con todos los editores disponibles.
	 */

	public void listadoEditores() {
		for (int i = 0; i < servicios.listarEditores().size(); i++) {
			System.out.println("*" + servicios.listarEditores().get(i));
		}

	}

	/**
	 * Devuelve la lista filtrada donde aparecen todos los juegos del siglo XX
	 * (Fecha de publicacion <= 1999)
	 * 
	 * @return Una lista filtrada donde aparecen todos los juegos del siglo XX
	 *         (Fecha de publicacion <= 1999)
	 */

	public void listadoSigloXX() {
		for (int i = 1980; i <= 1999; i++) {
			System.out.println(servicios.filtroFechaPublicacion(Integer.toString(i)));
		}
	}
}