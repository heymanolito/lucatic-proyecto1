package controlador;

import gui.Menus;
import servicios.IJuegosServicio;
import servicios.JuegosServicios;

/**
 * 
 * @author Grupo01 Jaume
 *
 */

public class LucaSteamController {

	private IJuegosServicio servicios = new JuegosServicios();
	
	/**
	 * Da la bienvenida e imprime el menú
	 */
	
	public static void start() {
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
	 */
	public static void elegirOpcion() {
		switch (utilidad.LecturaServicio.escribeNum()) {
		case 1: {
			
			//JuegosServicio.altaJuego(new Juego().crearJuego());
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
		
	}
}
