package controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import controlador.LucaSteamController;
import modelo.Juego;
import servicios.JuegosServicios;

public class ControladorTest {
	
	JuegosServicios servicios = new JuegosServicios();
	List<Juego> lista= new ArrayList<>();
	LucaSteamController n= new LucaSteamController();
	
	@Test
	public void testListadoGeneroPlataforma() {
		assertEquals(lista.toString(), n.listadoGeneroPlataforma().toString());
	}
	
	
}
