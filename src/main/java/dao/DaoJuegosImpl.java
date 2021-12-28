package dao;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

import modelo.Juego;

/**
 * 
 * @author Grupo01: Jose Manuel Molina, Manuel Gallardo Fuentes
 *
 */
public class DaoJuegosImpl implements IDao {

	private final Map <Integer, Juego> lista = new HashMap<>();


	@Override
	public void altaJuego(Juego juego) {

	}

	@Override
	public void bajaJuego(Juego juego) {

	}

	@Override
	public void modificarJuego(Integer id) {

	}

	@Override
	public void leer(String fichero) {
		BufferedReader br;
		String linea;
		try {
			br = new BufferedReader(new FileReader((fichero)));
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

	}

	@Override
	public void borrarTodo() {

	}

	@Override
	public void serializar(String fichero) {


	}

	@Override
	public void deserializar(String fichero) {

	}
}
