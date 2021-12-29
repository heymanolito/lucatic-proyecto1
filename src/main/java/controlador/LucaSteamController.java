package controlador;

import gui.Menus;
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
			switch (LecturaServicio.escribeNum()) {
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
				//elegirFiltro();
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
	 * @return siONo boolean
	 */
	
	public boolean stop() throws Exception {
		String siONo = utilidad.LecturaServicio.escribeTexto("¿Está seguro? (S/N)");
		return (siONo.toUpperCase().charAt(0) != 'S');
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

