package generoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import modelo.Genero;

public class GeneroTest {

	Genero genero = Genero.Action;
	Genero genero2 = Genero.Puzzle;
	Genero genero3 = Genero.Simulation;
	
	@Test
	@DisplayName("Prueba Genero")
	public void testGetId() {

			assertEquals(genero.getId(), 1);
			assertEquals(genero2.getId(), 6);
			assertEquals(genero3.getId(), 10);
	}
	@Test
	public void testGetSize() {

		assertEquals(Genero.getSize(), Genero.values().length);
		
	}
	@Test
	public void testDimeGenero() {

			assertEquals(genero.dimeGenero(1), genero);
			assertEquals(genero.dimeGenero(4), Genero.Misc);
	}
	
}
