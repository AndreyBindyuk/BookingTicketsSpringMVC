package controller;

import entity.Film;
import exception.TicketsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.filmservice.FilmService;
import services.filmservice.impl.FilmServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping(value = "/allFilms/", method = RequestMethod.GET)
    public List<Film> getAllFilms() throws TicketsException {
        return filmService.getAllFilms();
    }
}
