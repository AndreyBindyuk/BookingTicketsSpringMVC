import entity.Film;
import exception.TicketsException;
import org.dbunit.Assertion;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.filmservice.FilmService;
import services.filmservice.impl.FilmServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class FilmDBTest extends DBUnitConfig {
    private FilmService filmService = new FilmServiceImpl();
//    private EntityManager em = Persistence.createEntityManagerFactory("item-manager-pu").createEntityManager();

    @Before
    public void setUp() throws Exception {
        super.setUp();
        beforeData = new FlatXmlDataSetBuilder().build(
                Thread.currentThread().getContextClassLoader()
                        .getResourceAsStream("film-data.xml"));

        tester.setDataSet(beforeData);
        tester.onSetup();
    }

    public FilmDBTest(String name) {
        super(name);
    }

    @Test
    public void testShouldGetAllFilms() throws Exception {

        IDataSet expectedData = new FlatXmlDataSetBuilder().build(
                Thread.currentThread().getContextClassLoader()
                        .getResourceAsStream("film-data.xml"));
        IDataSet actualData = tester.getConnection().createDataSet();
        Assertion.assertEquals(expectedData, actualData);
        List<Film> films = filmService.getAllFilms();
        Assert.assertEquals(expectedData.getTable("FILMS").getRowCount(),films.size());
    }

}
