package dao;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import modelo.Juego;

/**
 * 
 * @author Grupo01: Jose Manuel Molina, Manuel Gallardo Fuentes
 *
 */
public class DaoJuegosImpl implements IDao {

	private Map <Integer, Juego> lista = new HashMap<>();


	@Override
	public void altaJuego(Juego juego) {

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
	public void leer(String fichero) {
		List<String> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

				System.out.print(values[0] + " ");
				System.out.print(values[1] + " ");
				System.out.print(values[2] + " ");
				System.out.print(values[3] + " ");
				System.out.print(values[4] + " ");
				System.out.print(values[5] + " ");
				System.out.println(" ");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void listarTodo() {

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
	public void deserializar(String fichero) {
		File f;
		try {
			f = new File(fichero);
			ObjectInputStream s = new ObjectInputStream(
					new FileInputStream(f));

			lista = (Map<Integer, Juego>) s.readObject();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e2) {
			System.out.println("añadir logger");
		}

	}
}
