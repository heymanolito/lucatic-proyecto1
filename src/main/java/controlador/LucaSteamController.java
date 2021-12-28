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
	
	public static void elegirOpcion() {
		
	}
	
	/**
	 * Cierra el menú
	 */
	public static void stop() {
		Menus.darDespedida();
	}
}
