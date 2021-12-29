package modelo;

import lombok.Data;
import utilidad.LecturaServicio;

/**
 * Nombre de la clase: Juego. Descripcion: En esta clase se contemplan objetos
 * "Juego" con atributos nombre, fecha de publicacion, plataforma, genero y
 * editor. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Natalia Borrego Lopez
 */

public @Data class Juego {

	private String nombre;
	private String fechaPublicacion;
	private Plataforma plataforma;
	private Genero genero;
	private String editor;

	/**
	 * Constructor completo clase juego
	 * 
	 * @param nombre           nombre del juego
	 * @param fechaPublicacion fecha de publicacion del juego
	 * @param genero           genero o tipo de juego
	 * @param plataforma       plataforma o consola donde se juega el juego
	 * @param editor           editor o compañia que desarrolla el juego
	 */

	public Juego(String nombre, String fechaPublicacion, Plataforma plataforma, Genero genero, String editor) {
		this.nombre = nombre;
		this.fechaPublicacion = fechaPublicacion;
		this.plataforma = plataforma;
		this.genero = genero;
		this.editor = editor;
	}

	/**
	 * Constructor vacio clase juego
	 */

	public Juego() {

	}

	/**
	 * Método que pregunta al usuario los atributos del juego para crearlo.
	 */

	public Juego crearJuego() {
		this.nombre = LecturaServicio.escribeTexto("Indique el nombre del juego.");
		this.fechaPublicacion = LecturaServicio.escribeTexto("Indique el año de publicación del juego.");
		Plataforma.plataformasDisponibles();
		this.plataforma = Plataforma.dimePlataforma(
				LecturaServicio.escribeNum("Indique el número correspondiente a la plataforma del juego."));
		Genero.generosDisponibles();
		this.genero = Genero
				.dimeGenero(LecturaServicio.escribeNum("Indique el número correspondiente al género del juego."));
		this.editor = LecturaServicio.escribeTexto("Indique el editor del juego.");
		return new Juego(nombre, fechaPublicacion, plataforma, genero, editor);
	}

	/**
	 * ToString sobreescrito para la Juego. Devuelve el formato: 
	 * Nombre: null 
	 * Fecha de publicacion: null 
	 * Plataforma: null 
	 * Genero: null 
	 * Editor: null
	 * -------------------------------------------------
	 */

	@Override
	public String toString() {
		return "\n" + "Nombre: " + nombre + '\n' + "Fecha de publicacion: " + fechaPublicacion + '\n' + "Plataforma: "
				+ plataforma + '\n' + "Genero: " + genero + '\n' + "Editor: " + editor + '\n'
				+ "-------------------------------------------------";
	}
}
