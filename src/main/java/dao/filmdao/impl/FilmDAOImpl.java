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
        try {
            entityManager.persist(film);
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
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
