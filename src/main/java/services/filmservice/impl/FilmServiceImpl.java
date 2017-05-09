package services.filmservice.impl;

import dao.filmdao.FilmDAO;
import dao.filmdao.impl.FilmDAOImpl;
import entity.Film;
import exception.TicketsException;
import services.filmservice.FilmService;

import java.util.List;

public class FilmServiceImpl implements FilmService {
    private FilmDAO filmDAO = new FilmDAOImpl();

    @Override
    public List<Film> getAllFilms() throws TicketsException {
        if(filmDAO.getAllFilms().isEmpty()){
            throw new TicketsException("Not closest sessions");
        }
        return filmDAO.getAllFilms();
    }
}
