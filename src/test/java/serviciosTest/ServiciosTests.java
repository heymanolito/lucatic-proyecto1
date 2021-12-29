package serviciosTest;

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
        servicios.altaJuegoNuevo();
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
    @DisplayName("Filtrar elementos mapa por editor")
    void testFiltroEditor() {
        servicios.cogeCSV();
        System.out.println(servicios.filtroEditor("Nintendo"));
    }

    @Test
    @DisplayName("Filtrar elementos mapa por editor y luego por plataforma")
    void testFiltroEditorPlataforma() {
        servicios.cogeCSV();
        System.out.println(servicios.filtroEditorPlataforma("Nintendo", "GBA"));
    }

    @Test
    @DisplayName("La suma de los juegos de la plataforma Nintendo")
    void  testSumaJuegosNintendo() {
        servicios.cogeCSV();
        long juegosNintendo = servicios.filtroEditor("Nintendo").size();

        long juegosGBA = servicios.filtroEditorPlataforma("Nintendo", "GBA").size();
        long juegosWII= servicios.filtroEditorPlataforma("Nintendo", "Wii").size();
        long juegosNES= servicios.filtroEditorPlataforma("Nintendo", "NES").size();
        long juegosDS= servicios.filtroEditorPlataforma("Nintendo", "DS").size();
        long juegos3DS = servicios.filtroEditorPlataforma("Nintendo", "3DS").size();
        long juegosSNES= servicios.filtroEditorPlataforma("Nintendo", "SNES").size();
        long juegosN64= servicios.filtroEditorPlataforma("Nintendo", "N64").size();
        long juegosGC= servicios.filtroEditorPlataforma("Nintendo", "GC").size();
        long juegosGB= servicios.filtroEditorPlataforma("Nintendo", "GB").size();
        long juegosWiiU= servicios.filtroEditorPlataforma("Nintendo", "WiiU").size();

        int count = (int) (juegosGBA + juegosWII + juegosNES + juegosDS + juegos3DS + juegosSNES +
                        juegosN64 + juegosGC + juegosGB + juegosWiiU);

        Assertions.assertEquals(juegosNintendo, count);
    }
}
