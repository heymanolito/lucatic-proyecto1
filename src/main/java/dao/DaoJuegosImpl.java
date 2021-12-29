package dao;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

import modelo.DA_ERROR;
import modelo.Genero;
import modelo.Juego;
import modelo.Plataforma;

/**
 * 
 * @author Grupo01: Jose Manuel Molina, Manuel Gallardo Fuentes, Natalia, Jaume
 *
 */
public class DaoJuegosImpl implements IDao {

	private Map <Integer, Juego> lista = new HashMap<>();

	/**
	 * Genera un número aleatorio mayor que los del ficheroCSV.
	 * @return Integer id
	 */
	
	public Integer darCodigoAleatorio () {
		int id;
		id = (int) Math.round((Math.random() * (50000 - 16601) + 16601));
		return id;		
	}

	/**
	 * Da de alta el juego que el usuario quiera, generando un código aleatorio y preguntando los
	 * atributos del juego.
	 * @param juego Juego
	 *
	 */	

	@Override
	public void altaJuegoNuevo(Juego juego) {
		lista.put(darCodigoAleatorio(), juego.crearJuego());
	}

	@Override
	public void altaJuegoLista(Juego juego) {

	}

	@Override
	public void bajaJuego(Juego juego) {

	}

	@Override
	public void modificarJuego(Integer id) {

	}

	/**
	 * Lee el fichero
	 * @param fichero String
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

	@Override
	public void listarTodo() {

		for (Integer juego : lista.keySet()) {
			
	        System.out.println("Nombre: " + lista.get(juego).getNombre());
	        System.out.println("Fecha de publicación: " + lista.get(juego).getFechaPublicacion());
	        System.out.println("Plataforma: " + lista.get(juego).getPlataforma());
	        System.out.println("Género: " + lista.get(juego).getGenero());
	        System.out.println("Editor: " + lista.get(juego).getEditor()); 
	        System.out.println();
	    }

	}

	@Override
	public void borrarTodo() {

	}

	/**
	 * Serializa la lista.
	 * @param fichero String
	 */

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

	/**
	 * Deserializa la lista.
	 * @param fichero String
	 */
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


}
