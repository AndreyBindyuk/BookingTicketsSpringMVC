package controller;

import entity.Film;
import exception.TicketsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    @RequestMapping(value = "/addFilm/",method =RequestMethod.POST)
    public String addFilm(@RequestBody Film film){
        return filmService.addFilm(film);
    }

    @RequestMapping(value = "/deleteFilm/",method = RequestMethod.DELETE)
    public String deleteFilm(@RequestParam("title") String filmTitle){
        return filmService.deleteFilm(filmTitle);
    }
}
