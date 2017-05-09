package dao.filmdao.impl;

import dao.filmdao.FilmDAO;
import entity.Actor;
import entity.Film;
import entity.Genre;

import java.util.*;

public class FilmDAOImpl implements FilmDAO {
    private static final Map<String, Film> filmMap = new HashMap<String, Film>();

    static {
        initMap();
    }

    private static void initMap() {
        Set<Actor> actors = new HashSet<Actor>();
        actors.add(new Actor("Daniel", "Radcliffe"));
        actors.add(new Actor("Rupert", "Grint"));
        actors.add(new Actor("Emma", "Watson"));
        Set<Genre> genres = new HashSet<Genre>();
        genres.add(new Genre("Fantasy"));
        Film film1 = new Film("Harry Potter and the Philosopher's Stone", 140, 5, "child film", "2001", "United Kingdom", 12, actors, genres);
        Film film2 = new Film("Harry Potter and the Chamber of Secrets", 150, 5, "child film", "2002", "United Kingdom", 12, actors, genres);
        filmMap.put(film1.getTitle(), film1);
        filmMap.put(film2.getTitle(), film2);
    }

    @Override
    public List<Film> getAllFilms() {
        Collection<Film> films = filmMap.values();
        List<Film> filmList = new ArrayList<Film>();
        filmList.addAll(films);
        return filmList;
    }
}
