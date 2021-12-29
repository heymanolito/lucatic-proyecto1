package dao;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import modelo.Genero;

import java.util.*;
import modelo.Juego;
import modelo.Plataforma;

/**
 * 
 * @author Grupo01: Jose Manuel Molina, Manuel Gallardo Fuentes, Natalia, Jaume
 * @inheritDoc
 */

public @Data class DaoJuegosImpl implements IDao {

	private Map<Integer, Juego> lista = new HashMap<>();

	public Integer darCodigoAleatorio() {
		int id;
		id = (int) Math.round((Math.random() * (50000 - 16601) + 16601));
		return id;
	}

	@Override
	public boolean altaJuegoNuevo(Juego juego) {
		lista.put(darCodigoAleatorio(), juego);
		return true;
	}


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

	@Override
	public int listarTodo() {

		int cont = 0;

		for ( Integer juego : lista.keySet() ) {
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

	@Override
	public void serializar(String fichero) {
		File f;
		try {
			f = new File(fichero);
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream s = new ObjectOutputStream(fos);
			s.writeObject(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void deserializar(String fichero) throws ClassNotFoundException {
		File f;
		try {
			f = new File(fichero);
			ObjectInputStream s = new ObjectInputStream(
					new FileInputStream(f));

			lista = (Map<Integer, Juego>) s.readObject();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	public Map<Integer, Juego> getLista() {
		return lista;
	}

	public List<Plataforma> listaPlataformas() {
		return new ArrayList<>(Arrays.asList(Plataforma.values()));
	}
}