import entity.Film;
import org.junit.Test;

import javax.persistence.Query;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JPAHibernateFilmCRUDTest extends JPAHibernateTest {

    @Test
    public void testGetFilms(){
        List<Film> film = em.createNamedQuery("get_all_films",Film.class).getResultList();
        assertEquals(2,film.size());
    }

    @Test
    public void testAddFilm(){
        String sql = "insert into Films (title,duration,filmRating,description,year,country,restriction,actors,genres)" +
                "VALUES ('great',100,4.5,'great film for ever',2017,'UK',18,'somebody','horror')";
        Query query = em.createNativeQuery(sql);
        query.executeUpdate();
        Film film = em.find(Film.class, "great");
        em.flush();
        assertNotNull(film.getTitle());
    }

    @Test
    public void testDeleteFilm(){
        Film film = em.find(Film.class, "great");
        em.remove(film);
        em.flush();
        String sql = "SELECT Film WHERE title="+"great";
        Query query = em.createNativeQuery(sql);
        assertEquals(0,query.getFirstResult());
    }
}
