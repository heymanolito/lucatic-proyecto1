package menuTest;
import gui.Menus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenusTest {


	private String testMenu = "  ______________________________________________"
			+ " //                                              \\"
			+ " |			   *Escoge una opcion:   			 |"
			+ " |			 1. Dar de alta un juego.  			 |"
			+ " |			 2. Ver listado de juegos.  	     |"
			+ " |			 3. Ver listas especificas.  		 |"
			+ " |            0. Salir                            |"
			+ " \\______________________________________________//";
	
	private String testMenu2=  "   ___________________________________________________________"
			  + " //                                                 		   \\"
			  + " |			   *Escoge una listaEspec�fica:   			  		|"
			  + " |		1. Dar listado de juegos de g�nero plataforma.   	 	|"
			  + " |		2. Dar listado de juegos para consolas de Nintendo.     |"
			  + " |		3. Dar listado de editores disponibles.  		        |"
			  + " |		4. Dar listado de los juegos del siglo XX.  		    |"
			  + " |      0. Salir  					                            |"
			  + " \\____________________________________________________________//"
		;

	@Test
	@DisplayName ("Prueba Menus")
	public void testDarBienvenida(){
		assertEquals(Menus.darBienvenida()," Bienvenido al gestor de juegos de LucaSteam ");
		
	}
	@Test
	public void testDarDespedida(){
		assertEquals(Menus.darDespedida()," Hasta la proxima ");
		
	}

	@Test
	public void testImprimirMenu() {
		assertEquals(Menus.imprimirMenu(),testMenu);
	}
	
	@Test
	public void testImprimirSubMenu() {
		assertEquals(Menus.listasEspecificas(), testMenu2);
	}
	

}
