package gui;


import controlador.LucaSteamController;

/**
 * @author Grupo01 Jaume
 */
public class Menus {

	/**
	 * Este metodo imprime el menï¿½ y todas sus opciones
	 */
	
	public static void imprimirMenu() {
		
		System.out.println("   ______________________________________________");
		System.out.println(" //                                              \\");
		System.out.println(" |			   *Escoge una opcion:   			  |");  
		System.out.println(" |			 1. Dar de alta un juego.  			  |");
		System.out.println(" |			 2. Ver listado de juegos.  	      |");
		System.out.println(" |			 3. Ver listas especificas.  		  |");
		System.out.println(" |           0. Salir                             |");
		System.out.println(" \\______________________________________________//");

	}
	
public static void listasEspecificas() {
		
		System.out.println("   ___________________________________________________________");
		System.out.println(" //                                                 		   \\");
		System.out.println(" |			   *Escoge una listaEspecífica:   			  		|");  
		System.out.println(" |		1. Dar listado de juegos de género plataforma.   	 	|");
		System.out.println(" |		2. Dar listado de juegos para consolas de Nintendo.     |");
		System.out.println(" |		3. Dar listado de editores disponibles.  		        |");
		System.out.println(" |		4. Dar listado de los juegos del siglo XX.  		    |");
		System.out.println(" |      0. Salir  					                            |");
		System.out.println(" \\____________________________________________________________//");

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
