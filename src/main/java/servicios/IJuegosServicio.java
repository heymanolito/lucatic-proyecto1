package servicios;

/**
 * Nombre de la interfaz: IJuegosServicio. Descripcion: Interfaz que genera los
 * metodos basicos para los servicios de juegos. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Jose Manuel Molina Llamas
 */

public interface IJuegosServicio {

	/**
	 * Metodo que da de alta un juego.
	 * 
	 * @return boolean
	 */

	boolean altaJuegoNuevo();

	/**
	 * Permite la lectura del archivo CVS.
	 */

	void cogeCSV();

	/**
	 * Metodo que muestra informacion.
	 */

	void listarTodo();

}
