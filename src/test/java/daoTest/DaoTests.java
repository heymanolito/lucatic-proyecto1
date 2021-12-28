package daoTest;

import dao.DaoJuegosImpl;
import modelo.Juego;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class DaoTests {

    private static Logger logger;
    private DaoJuegosImpl dao;


    static {
        try {
            logger = (Logger) LogManager.getLogger(DaoTests.class);
        } catch (Throwable e) {
            System.out.println("Doesn't work");
        }
    }

    @BeforeEach
    void setUp() {
        dao = new DaoJuegosImpl();
    }

    @Test
    @DisplayName("Lectura del fichero CSV")
    void testLecturaFichero() {
        dao.leer("fichero.csv");

    }

    @Test
    @DisplayName("Prueba serialización lista")
    void testSerializarLista(){
        dao.serializar("fichero.csv");
    }


}
