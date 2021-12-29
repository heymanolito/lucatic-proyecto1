package servicios;

import dao.DaoJuegosImpl;
import modelo.Genero;
import modelo.Juego;
import modelo.Plataforma;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Grupo01: Manuel, Jose Manuel
 * @inheritDoc
 */

public class JuegosServicios implements IJuegosServicio {

    DaoJuegosImpl daoJuegos = new DaoJuegosImpl();

    @Override
    public void altaJuegoNuevo(Juego juego) {
        daoJuegos.altaJuegoNuevo(juego);
    }

    @Override
    public void cogeCSV() {
        daoJuegos.cargarCSV("fichero.csv");
    }

    public void listarTodo() {
        daoJuegos.listarTodo();
    }

    public Integer darCodigoAleatorio() {
        return daoJuegos.darCodigoAleatorio();
    }

    @Override
    public void serializar() {
        daoJuegos.serializar("fichero.data");
    }

    @Override
    public void deserializar() throws ClassNotFoundException {
        daoJuegos.deserializar("fichero.data");
    }

    public DaoJuegosImpl getDaoJuegos() {
        return daoJuegos;
    }

    public List<Plataforma> listaPlataformas() {
        return daoJuegos.listaPlataformas();
    }

    /**
     * Filtra la colección de daoJuegos por género
     * @param genero String
     * @return List
     */

    public List<Juego> filtroGenero(String genero) {
        return daoJuegos.getLista().values().stream()
                .filter(juego -> juego.getGenero().equals(Genero.escogeGenero(genero)))
                .collect(Collectors.toList());
    }

    /**
     * Filtra la colección de daoJuegos por plataforma
     * @param plataforma String
     * @return List
     */

    public List<Juego> filtroPlataforma(String plataforma) {
        return daoJuegos.getLista().values().stream()
                .filter(juego -> juego.getPlataforma().equals(Plataforma.escogePlataforma(plataforma)))
                .collect(Collectors.toList());
    }

    /**
     * Filtra la colección por editores
     * @param editor String
     * @return List
     */
    public List<Juego> filtroEditor(String editor) {
        return daoJuegos.getLista().values().stream()
                .filter(juego -> juego.getEditor().equals(editor))
                .collect(Collectors.toList());
    }


    /**
     * Filtra la colección de daoJuegos por editor y por plataforma
     * @param plataforma String
     * @param editor String
     * @return List
     */


    public List<Juego> filtroEditorPlataforma(String editor, String plataforma) {
        return filtroEditor(editor).stream().filter(juego -> juego.getPlataforma()
                .equals(Plataforma.escogePlataforma(plataforma)))
                .collect(Collectors.toList());
    }



}
