package utilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Nombre de la clase: LecturaServicio. Descripcion: Clase con metodos estaticos
 * de lectura de datos. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Manuel Gallardo Fuentes
 */

public class LecturaServicio {

	/**
	 * Le pide al usuario que introduzca un mensaje por la terminal.
	 * 
	 * @param msg String
	 * @return String
	 */

	public static String escribeTexto(String msg) {
		System.out.println(msg);
		return leeInput();
	}

	/**
	 * Para introducir texto.
	 * 
	 * @return String
	 */

	public static String escribeTexto() {
		return leeInput();
	}

	/**
	 * Le pide al usuario que introduzca un mensaje por la terminal.
	 * 
	 * @param msg String
	 * @return Integer
	 */

	public static Integer escribeNum(String msg) {
		System.out.println(msg);
		return leeInputNumero();
	}

	/**
	 * Para introducir numeros enteros.
	 * 
	 * @return Integer
	 */

	public static Integer escribeNum() {
		return leeInputNumero();
	}

	/**
	 * Lee el buffer del teclado del usuario.
	 * 
	 * @return String
	 */

	private static String leeInput() {
		BufferedReader br;
		String text = "";
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			text = br.readLine();
		} catch (IOException ex) {

			ex.printStackTrace();
		}

		return text;
	}

	/**
	 * Lee el buffer del teclado del usuario.
	 * 
	 * @return int
	 */

	private static int leeInputNumero() {
		BufferedReader br;
		int num = 0;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return num;
	}
}
