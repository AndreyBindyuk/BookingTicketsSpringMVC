package services.filmservice.impl;

import dao.filmdao.FilmDAO;
import dao.filmdao.impl.FilmDAOImpl;
import entity.Film;
import exception.TicketsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.filmservice.FilmService;

import javax.sql.DataSource;
import java.util.List;
@Component
public class FilmServiceImpl implements FilmService {
//    private FilmDAO filmDAO = new FilmDAOImpl();

    @Autowired
    private FilmDAO filmDAO;

    @Override
    public List<Film> getAllFilms() throws TicketsException {
        if(filmDAO.getAllFilms().isEmpty()){
            throw new TicketsException("Not closest sessions");
        }
        return filmDAO.getAllFilms();
    }
}
