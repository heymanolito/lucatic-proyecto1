package servicios;

import java.util.HashMap;

import dao.DaoJuegosImpl;
import dao.IDao;
import modelo.Juego;

public class JuegosServicios implements IJuegosServicio{

	private IDao stock = new DaoJuegosImpl();

	public void altaJuego(Juego juego) {
		
	}
	public void bajaJuego(Juego juego) {
		
	}
	public void modificarJuego(Integer id) {
		
	}
	
	public void leer() {
		
	}
	
	public void listarTodo() {
		DaoJuegosImpl juegos = new DaoJuegosImpl();
		
		juegos.listarTodo();
	}
	
	public void borrarTodo() {
		
	}
	
	public void serializar() {
		
	}
	
	public void deserializar() {
		
	}
	/*
	public HashMap filtroGenero(Genero genero) {
		
	}
	
	public HashMap filtroPlataforma(Plataforma plataforma) {
		
	}
	
	public HashMap filtroFechaPublicacion(int fechaPublicacion) {
		
	}
	
	public HashMap filtroEditor(String editor) {
		
	}
	
	public HashMap filtroFechaPar() {
		
	}
	
	public HashMap filtroSigloXX() {
		
	}
	public HashMap filtroEditorNintendo() {
	
	}
	
	*/
	
}
