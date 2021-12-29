package plataformaTest;

import modelo.Plataforma;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlataformaTest {
	
	Plataforma plataforma = Plataforma.GBA;
	Plataforma plataforma2 = Plataforma._2600;
	//assertEquals(esperado, actual);

	@Test
    @DisplayName("Prueba id")
    public void testId() {

		assertEquals(plataforma.getId(), 7);
		assertEquals(plataforma2.getId(), 1);
	}
	@Test
	public void testDimePlataforma() {

			assertEquals(Plataforma.dimePlataforma(1), plataforma2);
			assertEquals(Plataforma.dimePlataforma(7), plataforma);
	}
	
	@Test
	public void testGetSize() {

			assertEquals(Plataforma.getSize(), Plataforma.values().length);
	}
}
