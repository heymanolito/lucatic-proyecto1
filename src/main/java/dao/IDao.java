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
	public void alta(Juego juego);
	
	/**
	 * 
	 * @param juego juego que voy a dar de baja
	 */
	public void baja(Juego juego);
	
	/**
	 * 
	 * @param id del juego a modificar
	 */
	public void modificar(Integer id);
	
	/**
	 * facilita la lectura del archivo CVS
	 */
	public void leer();
	
	/**
	 * Mostramos la informacion 
	 */
	public void listarTodo();
	
	/**
	 * Borramos toda la informacion
	 */
	public void borrarTodo();
	
	/**
	 * Serializamos la informacion del archivo
	 */
	public void serializar();
	
	/**
	 * Deserializamos la informacion del archivo
	 */
	public void deserializar();
	
}
