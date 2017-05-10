package dao.filmdao.impl;

import dao.filmdao.FilmDAO;
import entity.Film;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class FilmDAOImpl implements FilmDAO {
    private JdbcTemplate jdbcTemplate;

    public FilmDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Film> getAllFilms() {
        String sql = "SELECT * FROM FILMS";
        List<Film> films = jdbcTemplate.query(sql, new RowMapper<Film>() {
            @Override
            public Film mapRow(ResultSet resultSet, int i) throws SQLException {
                Film film = new Film();
                film.setTitle(resultSet.getString("title"));
                film.setDuration(resultSet.getInt("duration"));
                film.setFilmRating(resultSet.getInt("filmrating"));
                film.setDescription(resultSet.getString("description"));
                film.setYear(resultSet.getInt("year"));
                film.setCountry(resultSet.getString("country"));
                film.setRestriction(resultSet.getInt("restriction"));
                film.setActors(resultSet.getString("actors"));
                film.setGenres(resultSet.getString("genres"));
                return film;
            }
        });
        return films;
    }
}
