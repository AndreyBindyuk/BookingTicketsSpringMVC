import org.dbunit.Assertion;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Before;
import org.junit.Test;

public class DBTest extends DBUnitConfig {

    @Before
    public void setUp() throws Exception {
        super.setUp();
        beforeData = new FlatXmlDataSetBuilder().build(
                Thread.currentThread().getContextClassLoader()
                        .getResourceAsStream("film-data.xml"));

        tester.setDataSet(beforeData);
        tester.onSetup();
    }

    public DBTest(String name) {
        super(name);
    }

    @Test
    public void testShouldCheckCountOfTables() throws Exception {

        IDataSet expectedData = beforeData;
        IDataSet actualData = tester.getConnection().createDataSet();
        Assertion.assertEquals(expectedData, actualData);
    }

}
