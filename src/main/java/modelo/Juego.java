package modelo;

import java.io.Serializable;

import lombok.Data;

import utilidad.LecturaServicio;

/**
 * @author Grupo1 Natalia 
 */

public @Data class Juego implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String nombre;
	private int fechaPublicacion;
	private Plataforma plataforma;
	private Genero genero;
	private String editor;
	
	
	public Juego (String nombre, int fechaPublicacion, Plataforma plataforma, Genero genero, String editor) {
		this.nombre=nombre;
		this.fechaPublicacion=fechaPublicacion;
		this.plataforma=plataforma;
		this.genero=genero;
		this.editor=editor;
	}

/**
* Este método pregunta al usuario los atributos de un juego.
*/	
	
	public Juego crearJuego() {
		this.nombre=LecturaServicio.escribeTexto("Indique el nombre del juego.");
		this.fechaPublicacion=LecturaServicio.escribeNum("Indique el año de publicación del juego.");
		Plataforma.plataformasDisponibles();
		this.plataforma=Plataforma.dimePlataforma(LecturaServicio.escribeNum("Indique el número correspondiente a la plataforma del juego."));
		Genero.generosDisponibles();
		this.genero=Genero.dimeGenero(LecturaServicio.escribeNum("Indique el número correspondiente al género del juego."));
		this.editor=LecturaServicio.escribeTexto("Indique el editor del juego.");
		return new Juego(nombre, fechaPublicacion, plataforma, genero, editor);
	}
	
}
