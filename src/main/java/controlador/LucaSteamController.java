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
	
	public static void elegirOpcion() {
		
	}
	
	/**
	 * Cierra el men�
	 */
	public static void stop() {
		Menus.darDespedida();
	}
}
