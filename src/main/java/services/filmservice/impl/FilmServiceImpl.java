package services.filmservice.impl;

import dao.filmdao.FilmDAO;
import entity.Film;
import exception.TicketsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.filmservice.FilmService;

import java.util.List;

@Component
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDAO filmDAO;

    @Override
    public List<Film> getAllFilms() throws TicketsException {
        if (filmDAO.getAllFilms().isEmpty()) {
            throw new TicketsException("closest sessions does not exist");
        }
        return filmDAO.getAllFilms();
    }

    @Override
    public String addFilm(Film film) {
        if(filmDAO.addFilm(film)){
            return "Film has been added to cinema list";
        } else
        return "Film has not been added";
    }

    @Override
    public String deleteFilm(String filmTitle) {
        if(filmDAO.deleteFilm(filmTitle)){
            return filmTitle+" has been deleted";
        }else
            return filmTitle+" has not been deleted";
    }
}
