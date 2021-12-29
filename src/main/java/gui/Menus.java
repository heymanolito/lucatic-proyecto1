package gui;

import controlador.LucaSteamController;

/**
 * @author Grupo01 Jaume
 */
public class Menus {

	/**
	 * Este metodo imprime el menu y todas sus opciones
	 * @return el menu en string para poder hacerle el test
	 */
	
	public static String imprimirMenu() {
		String menuEntero= "  ______________________________________________"
						+ " //                                              \\"
						+ " |			   *Escoge una opcion:   			 |"
						+ " |			 1. Dar de alta un juego.  			 |"
						+ " |			 2. Ver listado de juegos.  	     |"
						+ " |			 3. Ver listas especificas.  		 |"
						+ " |            0. Salir                            |"
						+ " \\______________________________________________//";
				
				
		 	System.out.println("   ___________________________________________________");
	        System.out.println("  /  ________________________________________________ \\");
	        System.out.println(" / /                                                 \\ \\");
			System.out.println(" | |             *Escoge una opcion:                 | |");  
			System.out.println(" | |         1. Dar de alta un juego.                | |");
			System.out.println(" | |         2. Ver listado de juegos.               | |");
			System.out.println(" | |         3. Ver listas especificas.              | |");
			System.out.println(" | |         4. Filtrar juegos.                      | |");
			System.out.println(" | |         0. Salir.                               | |");
			System.out.println(" \\ \\_________________________________________________/ /");
			System.out.println("  \\___________________________________________________/");
		return menuEntero;

	}
	
	/**
	 * Este metodo imprime el submenu de listas especificas y todas sus opciones
	 * @return el menu en string para poder hacer el test
	 */
	
	public static String listasEspecificas() {
	
		String menu2=   "   ___________________________________________________________"
					  + " //                                                 		   \\"
					  + " |			   *Escoge una listaEspecífica:   			  		|"
					  + " |		1. Dar listado de juegos de género plataforma.   	 	|"
					  + " |		2. Dar listado de juegos para consolas de Nintendo.     |"
					  + " |		3. Dar listado de editores disponibles.  		        |"
					  + " |		4. Dar listado de los juegos del siglo XX.  		    |"
					  + " |      0. Salir  					                            |"
					  + " \\____________________________________________________________//"
				;
		System.out.println("   ___________________________________________________________");
		System.out.println(" /                                                             \\");
		System.out.println(" |             *Escoge una listaEspecífica:                    |");  
		System.out.println(" |      1. Dar listado de juegos de género plataforma.         |");
		System.out.println(" |      2. Dar listado de juegos para consolas de Nintendo.    |");
		System.out.println(" |      3. Dar listado de editores disponibles.                |");
		System.out.println(" |      4. Dar listado de los juegos del siglo XX.             |");
		System.out.println(" |      0. Salir.                                              |");
		System.out.println(" \\____________________________________________________________ /");
		
		return menu2;
	}
	
	
	
	
	/**
	 * Este mï¿½todo imprime el mensaje de bienvenida
	 * @return 
	 */

	public static String darBienvenida() {
		String bienvenida =" Bienvenido al gestor de juegos de LucaSteam ";
		System.out.println(bienvenida  );
		return bienvenida;
	}

	/**
	 * Este mï¿½todo imprime el mensaje de despedida
	 */

	public static String darDespedida() {
		String despedida = " Hasta la proxima ";
		System.out.println(despedida);
		return despedida;
	}
}
