package dao;

import modelo.Juego;

/**
 * 
 * @author Grupo01: Jose Manuel Molina
 *
 */
	public interface IDao {
	
	/**
	 * 
	 * @param juego juego que voy a dar de alta
	 */
	void altaJuego(Juego juego);
	
	/**
	 * 
	 * @param juego juego que voy a dar de baja
	 */
	void bajaJuego(Juego juego);
	
	/**
	 * 
	 * @param id del juego a modificar
	 */
	void modificarJuego(Integer id);
	
	/**
	 * facilita la lectura del archivo CVS
	 */
	void leer(String fichero);
	
	/**
	 * Mostramos la informacion 
	 */
	void listarTodo();
	
	/**
	 * Borramos toda la informacion
	 */
	void borrarTodo();
	
	/**
	 * Serializamos la informacion del archivo
	 */
	void serializar(String fichero);
	
	/**
	 * Deserializamos la informacion del archivo
	 */
	void deserializar(String fichero);
	
}
