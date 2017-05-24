package dao.filmdao.impl;

import configuration.HibernateUtil;
import dao.filmdao.FilmDAO;
import entity.Film;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.*;

public class FilmDAOImpl implements FilmDAO {

    @Override
    public List<Film> getAllFilms() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Film");
            return query.list();
        } finally {
            session.close();
        }
    }
}
