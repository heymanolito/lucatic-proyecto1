package serviciosTest;

import dao.DaoJuegosImpl;
import daoTest.DaoTests;
import modelo.Juego;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import servicios.JuegosServicios;

import java.util.logging.Logger;

public class ServiciosTests {

    private static Logger logger;
    private JuegosServicios servicios;


    static {
        try {
            logger = (Logger) LogManager.getLogger(DaoTests.class);
        } catch (Throwable e) {
            System.out.println("Doesn't work");
        }
    }

    @BeforeEach
    void setUp() {
        servicios = new JuegosServicios();
    }

    @Test
    @DisplayName("Alta nueva de juego en lista")
    void testAltaNueva() {
        servicios.cogeCSV();
        int count = servicios.getDaoJuegos().getLista().size();
        servicios.altaJuegoNuevo(new Juego());
        Assertions.assertEquals(count + 1, servicios.getDaoJuegos().getLista().size());
    }

    @Test
    @DisplayName("Filtrar elementos mapa por género")
    void testFiltroGenero() {
        servicios.cogeCSV();
        System.out.println(servicios.filtroGenero("Racing"));
    }

    @Test
    @DisplayName("Filtrar elementos mapa por plataforma")
    void testFiltroPlataforma() {
        servicios.cogeCSV();
        System.out.println(servicios.filtroPlataforma("GBA"));
    }

    @Test
    @DisplayName("Filtrar elementos mapa por editor y luego por plataforma")
    void testFiltroEditorPlataforma() {
        servicios.cogeCSV();
        System.out.println(servicios.filtroEditorPlataforma("Nintendo", "GBA"));
    }



}
