package db.tests;

import db.tests.config.DBUnitConfig;
import entity.Film;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilmDBTest extends DBUnitConfig {

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
    public void testShouldCheckCountOfRows() throws DataSetException {
        IDataSet expectedData = beforeData;
        Assert.assertEquals(expectedData.getTable("FILMS").getRowCount(),
                em.createNamedQuery("get_all_films", Film.class).getResultList().size());
    }
}
