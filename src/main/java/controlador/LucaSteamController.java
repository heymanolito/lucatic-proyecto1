package controlador;

import gui.Menus;

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
	}
	
	/**
	 * Te da a elegir una opción de las del menú
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
			//Ver listas específicas
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
	 * Cierra el menú
	 */
	public static void stop() {
		Menus.darDespedida();
	}
}
