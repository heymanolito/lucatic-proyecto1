package controlador;

import gui.Menus;
import servicios.IJuegosServicio;
import servicios.JuegosServicios;
import utilidad.LecturaServicio;

/**
 * 
 * @author Grupo01 Jaume y Natalia
 *
 */

public class LucaSteamController {

	private IJuegosServicio servicios = new JuegosServicios();
	
	/**
	 * Da la bienvenida e imprime el menú
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
	 * @return 
	 */
	public boolean elegirOpcion() {
		boolean continuar = true;
		try {
			switch (utilidad.LecturaServicio.escribeNum()) {
			case 1:
			//Dar de alta un juego
				//servicios.altaJuego(null);;
				break;
			case 2:
			//Ver listado juegos
				servicios.listarTodo();
				break;
			case 3:
			//Ver listas específicas
				listaEspecifica();
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
	
	public void listaEspecifica() {
		Menus.listasEspecificas();
		try {
			switch (utilidad.LecturaServicio.escribeNum()) {
				case 1: 
				//Dar listado de juegos de género plataforma
					//listadoGeneroPlataforma();
					break;
			case 2:
				//Dar listado de juegos para consolas de Nintendo
					//listadoNintendo();
					break;
			case 3:
				//Dar listado de editores disponibles.
					//listadoEditores();
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
	 */
	
	public boolean stop() throws Exception {
		String siONo = utilidad.LecturaServicio.escribeTexto("¿Está seguro? (S/N)");
		return (siONo.toUpperCase().charAt(0) != 'S');
	}
}
