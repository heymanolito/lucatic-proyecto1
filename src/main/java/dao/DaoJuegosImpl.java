package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import modelo.Genero;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import modelo.Juego;
import modelo.Plataforma;

/**
 * Nombre de la clase: DaoJuegoImpl. Descripcion: En esta clase se genera y
 * trabaja con HashMap con un código y un juego. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Natalia Borrego Lopez, Jose Manuel Molina Llamas, Manuel Gallardo
 *         Fuentes y Jaume Subirats Martin
 */

public @Data class DaoJuegosImpl implements IDao {

	private Map<Integer, Juego> lista = new HashMap<>();

	/**
	 * Genera un ID aleatorio superior a 16600 (código máximo en el CSV aportado).
	 * 
	 * @return id Corresponde a un ID aleatorio para un nuevo juego.
	 */

	public Integer darCodigoAleatorio() {
		int id;
		id = (int) Math.round((Math.random() * (50000 - 16601) + 16601));
		return id;
	}

	/**
	 * Pregunta al usuario para crear un juego con los atributos que elija.
	 * 
	 * @return boolean
	 */

	@Override
	public boolean altaJuegoNuevo(Juego juego) {
		lista.put(darCodigoAleatorio(), juego);
		return true;
	}

	/**
	 * Este metodo genera un mapa a partir de un fichero CSV.
	 */

	@Override
	public void cargarCSV(String fichero) {
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
				Juego juego = new Juego();
				juego.setNombre(values[1]);
				juego.setPlataforma(Plataforma.escogePlataforma(values[2]));
				juego.setFechaPublicacion(values[3]);
				juego.setGenero(Genero.escogeGenero(values[4]));
				juego.setEditor(values[5]);
				lista.put(Integer.parseInt(values[0]), juego);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo imprime los juegos dentro de un mapa.
	 * 
	 * @return cont contador para comprobar el numero de juegos de la lista.
	 */

	@Override
	public int listarTodo() {

		int cont = 0;

		for (Integer juego : lista.keySet()) {
			System.out.println("Nombre: " + lista.get(juego).getNombre());
			System.out.println("Fecha de publicación: " + lista.get(juego).getFechaPublicacion());
			System.out.println("Plataforma: " + lista.get(juego).getPlataforma());
			System.out.println("Género: " + lista.get(juego).getGenero());
			System.out.println("Editor: " + lista.get(juego).getEditor());
			System.out.println();
			cont++;
		}

		return cont;

	}

	/**
	 * Constructor vacio de la clase DaoJuegosImpl.
	 * 
	 */

	public Map<Integer, Juego> getLista() {
		return lista;
	}

	/**
	 * Metodo que devuelve un array con todas las plataformas.
	 * 
	 * @return List<Plataforma> Lista que contiene las plataformas en un array.
	 */

	public List<Plataforma> listaPlataformas() {
		return new ArrayList<>(Arrays.asList(Plataforma.values()));
	}
}