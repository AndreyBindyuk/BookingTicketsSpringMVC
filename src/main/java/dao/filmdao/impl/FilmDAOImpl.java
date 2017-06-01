package dao.filmdao.impl;

import dao.filmdao.FilmDAO;
import entity.Film;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
}
