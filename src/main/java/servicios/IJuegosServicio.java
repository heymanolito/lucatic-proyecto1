package servicios;

/**
 * 
 * @author Grupo01: Jose Manuel Molina
 *
 */
public interface IJuegosServicio {

	/**
	 * voy a dar de alta un juego preguntando al usuario
	 * @param juego juego
	 */

	boolean altaJuegoNuevo();


	/*
	*
	 * facilita la lectura del archivo CVS
	 */
	void cogeCSV();

	/**
	 * Mostramos la informacion
	 */
	void listarTodo();

	/**
	 * Serializamos la informacion del archivo
	 */
	void serializar();

	/**
	 * Deserializamos la informacion del archivo
	 */
	void deserializar() throws ClassNotFoundException;


}
