package controlador;

import java.util.Arrays;

import gui.Menus;
import modelo.Genero;
import modelo.Plataforma;
import servicios.JuegosServicios;

import utilidad.LecturaServicio;

/**
 * 
 * @author Grupo01 Jaume y Natalia
 *
 */

public class LucaSteamController {

	private JuegosServicios servicios = new JuegosServicios();
	
	/**
	 * Da la bienvenida e imprime el menú
	 * 
	 */
	public void start() {
		boolean seguir = true;
		Menus.darBienvenida();
		do {
			Menus.imprimirMenu();
			seguir = this.elegirOpcion();
		}
		while (seguir);
		Menus.darDespedida();

	}
	
	/**
	 * Te da a elegir una opción de las del menú
	 * @return continuar boolean
	 */

	
	
		
	public boolean elegirOpcion() {
		boolean continuar = true;
		try {
			switch (utilidad.LecturaServicio.escribeNum()) {
			case 1:
			//Dar de alta un juego
				servicios.altaJuegoNuevo();;
				break;
			case 2:
			//Ver listado juegos
				servicios.listarTodo();
				
				break;
			case 3:
			//Ver listas específicas
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
		}
		catch (Exception e) {
			System.out.println("Error: " + e.toString());

			throw new IllegalArgumentException("No existe esa opción: " + utilidad.LecturaServicio.escribeNum());
		}
	return continuar;	
	}
	
	/**
	 * Te da a elegir una opción de las del submenú "3. listas especificas"
	 *
	 */
	
	public void listaEspecifica() {
		Menus.listasEspecificas();
		try {
			switch (utilidad.LecturaServicio.escribeNum()) {
				case 1: 
				//Dar listado de juegos de género plataforma
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
					//listadoSigloXX
			case 0:
				Menus.imprimirMenu();
				elegirOpcion();
			}
		}
		catch (Exception e) {
			System.out.println("Error: " +e.toString());
			throw new IllegalArgumentException("No existe esa opción: " + utilidad.LecturaServicio.escribeNum());
		}
		elegirOpcion();
	}
		
				
	/**
	 * Cierra el menú
	 * @return siONo boolean
	 */
	
	public boolean stop() throws Exception {
		String siONo = utilidad.LecturaServicio.escribeTexto("¿Está seguro? (S/N)");
		return (siONo.toUpperCase().charAt(0) != 'S');
	}
	public void elegirFiltro() {
		
		listadoFiltros();
		
		String entrada = LecturaServicio.escribeTexto(" ¿Que filtro desea elegir? ");
		String entradaMinuscula = entrada.toLowerCase();
		
		switch (entradaMinuscula) {
		case "editor": 
			//Exception si no existe editor
				servicios.filtroEditor(LecturaServicio.escribeTexto(" Elija el editor que quieras "));
			break;
		case "plataforma":
				System.out.println("Plataformas disponibles: \n" + Arrays.asList(Plataforma.values()));
				servicios.filtroPlataforma(LecturaServicio.escribeTexto(" Elija la plataforma que quieras tal y como está escrito "));
			break;
		case "fecha de publicacion":
			
				//servicios.filtroFechaPublicacion(LecturaServicio.escribeTexto(" Elija el año que quiera "));
			break;
		case "genero":
				System.out.println("Generos disponibles: \n" + Arrays.asList(Genero.values()));
				servicios.filtroGenero(LecturaServicio.escribeTexto(" Elija el genero que quieras tal y como está escrito "));
			break;
		default:
			throw new IllegalArgumentException("No existe este filtro " + entrada);
		}	
	}
	
	public void listadoFiltros() {
		System.out.println(" ¿Que filtro quieres elegir? \n "+
						   " Editor\n" + 
						   " Plataforma \n" +
						   " Fecha de Publicacion \n" +
						   " Genero");
		
	}

	/**
	 * Devuelve la lista filtrada por genero "plataforma"
	 */
	
	public void listadoGeneroPlataforma() {
		System.out.println(servicios.filtroGenero("Platform"));
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
		
	}
	
	/**
	 * Devuelve la lista filtrada por sigloXX (año<1999)
	 */
	
	public void listadoSigloXX() {
		
	}
}
	

