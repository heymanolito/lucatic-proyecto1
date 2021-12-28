package gui;


import org.junit.jupiter.api.Test;

import controlador.LucaSteamController;

/**
 * @author Grupo01 Jaume
 */
public class Menus {

	/**
	 * Este método imprime el menú y todas sus opciones
	 */
	
	public static void imprimirMenu() {
		
		System.out.println("   ______________________________________________");
		System.out.println(" //                                              \\");
		System.out.println(" |			   *Escoge una opcion:   			  |");  
		System.out.println(" |			 1. Dar de alta un juego.  			  |");
		System.out.println(" |			 2. Ver listado de juegos.  	      |");
		System.out.println(" |			 3. Ver listas específicas.  		  |");
		System.out.println(" |           0. Salir                             |");
		System.out.println(" \\______________________________________________//");
		LucaSteamController.elegirOpcion();

	}
	/**
	 * Este método imprime el mensaje de bienvenida
	 */
	@Test
	public static void darBienvenida() {
		System.out.println(" Bienvenido al gestor de juegos de LucaSteam "  );
	}
	
	/**
	 * Este método imprime el mensaje de despedida
	 */
	@Test
	public static void darDespedida() {
		System.out.println(" Hasta la próxima ");
	}
}
