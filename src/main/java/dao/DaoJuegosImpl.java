package dao;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import lombok.Data;
import modelo.Juego;

/**
 * 
 * @author Grupo01: Jose Manuel Molina, Manuel Gallardo Fuentes
 *
 */
public @Data class DaoJuegosImpl implements IDao {

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
		BufferedReader br;
		String linea;
		File f;
		try {
			f = new File(fichero);
			br = new BufferedReader(new FileReader(f));
			while((linea = br.readLine())!=null) {
				String[] valores;
				if(linea.equals("&#34;")) {
					valores = linea.split("&#34;");
				} else {
					valores = linea.split(",");
				}
				System.out.println(valores[0]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void listarTodo() {

		for(int i=0; i<lista.size()-1; i++) {
			
			System.out.println(lista);
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
