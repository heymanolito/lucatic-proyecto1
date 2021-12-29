package gui;

/**
 * Nombre de la clase: Menus. Descripcion: Interfaz graficaº. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Jaume Subirats Martin
 */

public class Menus {

	/**
	 * Metodo que imprime el menu y todas sus opciones
	 * 
	 * @return menuEntero String para test
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
	 * Metodo que imprime el submenu de listas especificas y todas sus opciones
	 * 
	 * @return menu2 String para test
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
		System.out.println(" |             *Escoge una lista especifica:                   |");  
		System.out.println(" |      1. Dar listado de juegos de género plataforma.         |");
		System.out.println(" |      2. Dar listado de juegos para consolas de Nintendo.    |");
		System.out.println(" |      3. Dar listado de editores disponibles.                |");
		System.out.println(" |      4. Dar listado de los juegos del siglo XX.             |");
		System.out.println(" |      0. Salir.                                              |");
		System.out.println(" \\____________________________________________________________/");
		
		return menu2;
	}
	
	
	
	
	/**
	 * Metodo que imprime el mensaje de bienvenida.
	 * 
	 * @return bienvenida  
	 */

	public static String darBienvenida() {
		String bienvenida ="  ---- Bienvenido al gestor de juegos de LucaSteam ----";
		System.out.println(bienvenida  );
		return bienvenida;
	}

	/**
	 * Metodo que imprime el mensaje de despedida.
	 * 
	 * @return despedida  
	 */

	public static String darDespedida() {
		
		String despedida = "  ------------------ Hasta la proxima ------------------";
		System.out.println(despedida);
		return despedida;
	}
}
