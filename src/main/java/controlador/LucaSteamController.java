package controlador;

import gui.Menus;

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
	}
	
	/**
	 * Te da a elegir una opci�n de las del men�
	 */
	public static void elegirOpcion() {
		switch (utilidad.LecturaServicio.escribeNum()) {
		case 1: {
			//Dar de alta juego
			//JuegosServicio.altaJuego();
			break;
		}
		case 2:{
			//Ver listado juegos
			//JuegosServicio.listadoJuegos();
		}
		case 3:{
			//Ver listas espec�ficas
			//listaEspecifica();
		}
		case 0:{
			stop();
		}
		

		default:
			throw new IllegalArgumentException("Unexpected value: " + utilidad.LecturaServicio.escribeNum());
		}
	}
	
	
	/**
	 * Cierra el men�
	 */
	public static void stop() {
		Menus.darDespedida();
	}
}
