package daoTest;
import dao.DaoJuegosImpl;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

public class DaoTests {

    private static Logger logger;
    private DaoJuegosImpl dao;
    private DaoJuegosImpl dao2;

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
        dao.cargarCSV("fichero.csv");

    }

    @Test
    @DisplayName("Listar elementos del HashMap")
    void testListadoFichero() {
        dao.cargarCSV("fichero.csv");
        dao.listarTodo();
    }

    @Test
    @DisplayName("Comprobar numero de elementos imprimidos")
	public void testListarTodo() {

		assertEquals(dao.listarTodo(), dao.getLista().size());
		
	}

}
