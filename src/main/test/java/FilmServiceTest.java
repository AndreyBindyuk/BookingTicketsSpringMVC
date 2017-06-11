import entity.Film;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import services.filmservice.impl.FilmServiceImpl;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class FilmServiceTest {
    @Mock
    private
    FilmServiceImpl filmService;

    @Test
    public void testShouldAddFilm(){
        Film film = new Film();
        when(filmService.addFilm(film)).thenReturn("Film has been added to cinema list");
        assertEquals("Film has been added to cinema list",filmService.addFilm(film));
    }

    @Test
    public void testShouldDeleteFilm(){
        when(filmService.deleteFilm("Title")).thenReturn(" has been deleted");
        assertEquals(" has been deleted",filmService.deleteFilm("Title"));
    }
}
