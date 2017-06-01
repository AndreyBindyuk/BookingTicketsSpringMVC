package services.filmservice;

import entity.Film;
import exception.TicketsException;
import org.springframework.stereotype.Component;

import java.util.List;

public interface FilmService {

    public List<Film> getAllFilms() throws TicketsException;

}
