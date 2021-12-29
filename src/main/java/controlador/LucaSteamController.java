package controlador;

import gui.Menus;
import servicios.JuegosServicios;

/**
 * 
 * @author Grupo01 Jaume
 *
 */

public class LucaSteamController {

	
	/**
	 * Da la bienvenida e imprime el menú
	 */
	public static void start() {
		Menus.darBienvenida();
		Menus.imprimirMenu();
		elegirOpcion();

	}
	
	/**
	 * Te da a elegir una opción de las del menú
	 */
	public static void elegirOpcion() {
		switch (utilidad.LecturaServicio.escribeNum()) {
		case 1: {
			
			//JuegosServicio.altaJuego(new Juego().crearJuego());
			break;
		}
		case 2:{
			//Ver listado juegos
			//JuegosServicios.listarTodo();
			break;
		}
		case 3:{
			//Ver listas específicas
			Menus.listasEspecificas();
			listaEspecifica();

			break;
		}
		
		case 0:{
			stop();
			break;
		}
		

		default:
			throw new IllegalArgumentException("No existe esa opción: " + utilidad.LecturaServicio.escribeNum());
		}
	}
	
	public static void listaEspecifica() {
		switch (utilidad.LecturaServicio.escribeNum()) {
		case 1: {
			
			//Dar listado de juegos de género plataforma
			break;
		}
		case 2:{
			//Dar listado de juegos para consolas de Nintendo
			break;
		}
		case 3:{
			//Dar listado de editores disponibles.
			break;
		}
		case 4:{
			//Dar listado de los juegos del siglo XX
		}
		
		case 0:{
			Menus.imprimirMenu();
		}
		

		default:
			throw new IllegalArgumentException("No existe esa opción: " + utilidad.LecturaServicio.escribeNum());
		}
	}
	
	
	/**
	 * Cierra el menú
	 */
	public static void stop() {
		Menus.darDespedida();
	}
}
