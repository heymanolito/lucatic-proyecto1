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
<<<<<<< HEAD
public class DaoJuegosImpl implements IDao{

	private Map <Integer, Juego> lista = new HashMap<>();
	
	public void altaJuego(Juego juego) {
		
	}
	public void bajaJuego(Juego juego) {
		
	}
	public void modificarJuego(Integer id) {
		
	}
	
	public void leer() {
		
	}
	
	public void listarTodo() {

	}
	
	public void borrarTodo() {
		
	}
	
	public void serializar() {
		
	}
	
	public void deserializar() {
		
=======
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

>>>>>>> 404f3fa (Añadida la clase LecturaServicio y los métodos escribeTexto() y escribeNum().)
	}
}
