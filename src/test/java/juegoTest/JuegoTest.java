package juegoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import modelo.Genero;
import modelo.Juego;
import modelo.Plataforma;

public class JuegoTest {

	Juego juego = new Juego();
	Juego juego2 = new Juego("Zelda", "2006", Plataforma.GBA, Genero.Adventure, "Nintendo");
	Juego juego3 = new Juego("War", "1999", Plataforma.GG, Genero.Action, "Sony");
	
	//String nombre, int fechaPublicacion, Plataforma plataforma, Genero genero, String editor
	
	@Test
    @DisplayName("Prueba id")
    public void testConstructor() {

		assertEquals(new Juego("War", "1999", Plataforma.GG, Genero.Action, "Sony"), juego2);
		assertEquals(new Juego("Zelda", "2006", Plataforma.GBA, Genero.Adventure, "Sony"), juego3);
		assertEquals(new Juego(), juego);
		//assertEquals(plataforma2.getId(), 1);
	}
}
