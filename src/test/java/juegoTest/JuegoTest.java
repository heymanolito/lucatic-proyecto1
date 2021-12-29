package juegoTest;

import modelo.Genero;
import modelo.Juego;
import modelo.Plataforma;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuegoTest {

	Juego juego = new Juego();
	Juego juego2 = new Juego("Zelda", "2006", Plataforma.GBA, Genero.Adventure, "Nintendo");
	Juego juego3 = new Juego("War", "1999", Plataforma.GG, Genero.Action, "Sony");
	
	//String nombre, int fechaPublicacion, Plataforma plataforma, Genero genero, String editor
	
	@Test
    @DisplayName("Prueba constructor")
    public void testConstructor() {

		assertEquals(new Juego("War", "1999", Plataforma.GG, Genero.Action, "Sony"), juego3);
		assertEquals(new Juego("Zelda", "2006", Plataforma.GBA, Genero.Adventure, "Nintendo"), juego2);
		assertEquals(new Juego(), juego);
		//assertEquals(plataforma2.getId(), 1);
	}
}
