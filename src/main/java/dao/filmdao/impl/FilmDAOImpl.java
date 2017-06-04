package dao.filmdao.impl;

import dao.filmdao.FilmDAO;
import entity.Film;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.*;

@Transactional
@Repository
public class FilmDAOImpl implements FilmDAO {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Film> getAllFilms() {
        return entityManager.createNamedQuery("get_all_films", Film.class).getResultList();
    }

    @Override
    public boolean addFilm(Film film) {
        String sql = "insert into Films (title,duration,filmRating,description,year,country,restriction,actors,genres)" +
                "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            Query query = entityManager.createNativeQuery(sql);
            query.setParameter(1, film.getTitle());
            query.setParameter(2, film.getDuration());
            query.setParameter(3, film.getFilmRating());
            query.setParameter(4, film.getDescription());
            query.setParameter(5, film.getYear());
            query.setParameter(6, film.getCountry());
            query.setParameter(7, film.getRestriction());
            query.setParameter(8, film.getActors());
            query.setParameter(9, film.getGenres());
            query.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteFilm(String filmTitle) {
        try {
            Film film = entityManager.find(Film.class, filmTitle);
            entityManager.remove(film);
            entityManager.flush();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
