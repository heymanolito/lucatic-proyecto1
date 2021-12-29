package dao;

import modelo.Juego;

/**
 * 
 * @author Grupo01: Jose Manuel Molina
 *
 */
	public interface IDao {
	
	/**
	 * voy a dar de alta un juego preguntando al usuario
	 * @param juego juego 
	 */
	void altaJuegoNuevo(Juego juego);
	
	/**
	 * voy a dar de alta un juego que est� en el ficheroCSV
	 * @param juego juego   
	 */
	void altaJuegoLista(Juego juego);
	
	
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
	void cargarCSV(String fichero);
	
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
	void deserializar(String fichero) throws ClassNotFoundException;


}
