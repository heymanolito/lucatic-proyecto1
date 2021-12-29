package menuTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import gui.Menus;

public class MenusTest {

	
	
	@Test
	@DisplayName ("Prueba Menus")
	public void testDarBienvenida(){
		assertEquals(Menus.darBienvenida()," Bienvenido al gestor de juegos de LucaSteam ");
		
	}
	@Test
	public void testDarDespedida(){
		assertEquals(Menus.darDespedida()," Hasta la proxima ");
		
	}
	
	public void testImprimirMenu();
}
