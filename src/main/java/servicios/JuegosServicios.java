package servicios;

import dao.DaoJuegosImpl;
import modelo.Genero;
import modelo.Juego;
import modelo.Plataforma;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Nombre de la clase: JuegosServicios. Descripcion: En esta clase con un
 * atributo de la clase DaoJuegosServicios, se generan metodos para trabajar en
 * la capa servicios con los juegos. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Manuel Gallardo Fuentes, Jose Manuel Molina Llamas y Natalia
 *         Borrego Lopez
 */

public class JuegosServicios implements IJuegosServicio {

	DaoJuegosImpl daoJuegos = new DaoJuegosImpl();

	/**
	 * Metodo que da de alta un juego.
	 * 
	 * @return boolean
	 */

	@Override
	public boolean altaJuegoNuevo() {
		Juego juego = new Juego();
		juego.crearJuego();
		return daoJuegos.altaJuegoNuevo(juego);
	}

	/**
	 * Permite la lectura del archivo CVS.
	 */

	@Override
	public void cogeCSV() {
		daoJuegos.cargarCSV("fichero.csv");
	}

	/**
	 * Metodo que muestra informacion.
	 */

	public void listarTodo() {
		daoJuegos.listarTodo();
	}

	/**
	 * Getter
	 */

	public DaoJuegosImpl getDaoJuegos() {
		return daoJuegos;
	}

	/**
	 * Metodo que devuelve un array con todas las plataformas.
	 * 
	 * @return List<Plataforma> Lista que contiene las plataformas en un array.
	 */

	public List<Plataforma> listaPlataformas1() {
		return daoJuegos.listaPlataformas();
	}

	/**
	 * Filtra la coleccion de daoJuegos por genero.
	 * 
	 * @param genero String
	 * @return List
	 */

	public List<Juego> filtroGenero(String genero) {
		return daoJuegos.getLista().values().stream()
				.filter(juego -> juego.getGenero().equals(Genero.escogeGenero(genero))).collect(Collectors.toList());
	}

	/**
	 * Filtra la coleccion de daoJuegos por plataforma.
	 * 
	 * @param plataforma String
	 * @return List
	 */

	public List<Juego> filtroPlataforma(String plataforma) {
		return daoJuegos.getLista().values().stream()
				.filter(juego -> juego.getPlataforma().equals(Plataforma.escogePlataforma(plataforma)))
				.collect(Collectors.toList());
	}

	/**
	 * Filtra la coleccion por editores.
	 * 
	 * @param editor String
	 * @return List
	 */
	public List<Juego> filtroEditor(String editor) {
		return daoJuegos.getLista().values().stream().filter(juego -> juego.getEditor().equals(editor))
				.collect(Collectors.toList());
	}

	/**
	 * Filtra la coleccion de daoJuegos por editor y por plataforma.
	 * 
	 * @param plataforma String
	 * @param editor     String
	 * @return List
	 */

	public List<Juego> filtroEditorPlataforma(String editor, String plataforma) {
		return filtroEditor(editor).stream()
				.filter(juego -> juego.getPlataforma().equals(Plataforma.escogePlataforma(plataforma)))
				.collect(Collectors.toList());
	}

	/**
	 * Filtra la coleccion por fecha de publicacion.
	 * 
	 * @param fechaPublicacion String
	 * @return List
	 */
	public List<Juego> filtroFechaPublicacion(String fechaPublicacion) {
		return daoJuegos.getLista().values().stream()
				.filter(juego -> juego.getFechaPublicacion().equals(fechaPublicacion)).collect(Collectors.toList());
	}

	/**
	 * Metodo que devuelve una lista de editores disponibles de la lista original.
	 * 
	 * @return List<String>
	 */

	public List<String> listarEditores() {
		return daoJuegos.getLista().values().stream().map(Juego::getEditor).distinct().collect(Collectors.toList());
	}

}
