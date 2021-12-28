package utilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Grupo 01
 * @author Manuel Gallardo Fuentes
 */

public class LecturaServicio {

    /**
     * Le pide al usuario que introduzca un mensaje por la terminal.
     * @param msg String
     * @return String
     */

    public static String escribeTexto(String msg) {
        System.out.println(msg);
        return leeInput();
    }

    /**
     * Le pide al usuario que introduzca un mensaje por la terminal.
     * @param msg String
     * @return Integer
     */

    public static Integer escribeNum(String msg) {
        System.out.println(msg);
        return leeInputNumero();
    }
    /**
     * Lee el buffer del teclado del usuario.
     * @return String
     */

    private static String leeInput() {
        BufferedReader br;
        String text ="";
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
