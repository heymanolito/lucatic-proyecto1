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
	boolean altaJuegoNuevo(Juego juego);

	/**
	 * facilita la lectura del archivo CVS
	 */
	void cargarCSV(String fichero);
	
	/**
	 * Mostramos la informacion 
	 */
	int listarTodo();


}
