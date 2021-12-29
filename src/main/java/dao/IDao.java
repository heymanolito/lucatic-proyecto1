package dao;

import modelo.Juego;

/**
 * Nombre de la interfaz: IDao. Descripcion: Interfaz que genera los metodos
 * basicos DAO. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Jose Manuel Molina Llamas
 */
public interface IDao {

	/**
	 * Metodo que da de alta un juego.
	 * 
	 * @param juego
	 * @return boolean
	 */
	boolean altaJuegoNuevo(Juego juego);

	/**
	 * Permite la lectura del archivo CVS.
	 * 
	 * @param fichero Fichero CSV
	 */
	void cargarCSV(String fichero);

	/**
	 * Metodo que muestra informacion.
	 * 
	 * @return int
	 */
	int listarTodo();

}
