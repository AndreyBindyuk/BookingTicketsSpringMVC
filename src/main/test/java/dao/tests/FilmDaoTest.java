package dao.tests;

import dao.filmdao.FilmDAO;
import dao.filmdao.impl.FilmDAOImpl;
import entity.Film;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FilmDaoTest {

    @Mock
    private Film film;
    @Mock
    private FilmDAOImpl filmDAO;


    @Test
    public void testShouldAddFilm(){
        when(filmDAO.addFilm(film)).thenReturn(true);
        assertEquals(true,filmDAO.addFilm(film));
    }

    @Test
    public void testShouldDeleteFilm(){
        when(filmDAO.deleteFilm("Title")).thenReturn(true);
        assertEquals(true,filmDAO.deleteFilm("Title"));
    }
}
