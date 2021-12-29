package generoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import modelo.Genero;
import modelo.Plataforma;

public class GeneroTest {

	Genero genero = Genero.Action;
	Genero genero2 = Genero.Puzzle;
	Genero genero3 = Genero.Simulation;
	
	@Test
	@DisplayName("Prueba Genero")
	public void testGetId() {

			assertEquals(genero.getInt(), 1);
			assertEquals(genero2.getInt(), 6);
			assertEquals(genero3.getInt(), 10);
	}
	@Test
	public void testGetSize() {

		assertEquals(Plataforma.getSize(), Genero.values().length);
		
	}
	@Test
	public void testDimeGenero() {

			assertEquals(genero.dimeGenero(1), genero);
			assertEquals(genero.dimeGenero(4), Genero.Misc);
	}
	
}
