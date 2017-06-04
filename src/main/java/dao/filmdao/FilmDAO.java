package dao.filmdao;

import entity.Film;

import java.util.*;

public interface FilmDAO {
    public List<Film> getAllFilms();

    public boolean addFilm(Film film);

    public boolean deleteFilm(String filmTitle);
}
