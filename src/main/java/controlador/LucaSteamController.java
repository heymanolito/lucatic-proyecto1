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
	 * Da la bienvenida e imprime el men�
	 */
	public static void start() {
		Menus.darBienvenida();
		Menus.imprimirMenu();
		elegirOpcion();

	}
	
	/**
	 * Te da a elegir una opci�n de las del men�
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
			//Ver listas espec�ficas
			Menus.listasEspecificas();
			listaEspecifica();

			break;
		}
		
		case 0:{
			stop();
			break;
		}
		

		default:
			throw new IllegalArgumentException("No existe esa opci�n: " + utilidad.LecturaServicio.escribeNum());
		}
	}
	
	public static void listaEspecifica() {
		switch (utilidad.LecturaServicio.escribeNum()) {
		case 1: {
			
			//Dar listado de juegos de g�nero plataforma
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
			throw new IllegalArgumentException("No existe esa opci�n: " + utilidad.LecturaServicio.escribeNum());
		}
	}
	
	
	/**
	 * Cierra el men�
	 */
	public static void stop() {
		Menus.darDespedida();
	}
}
