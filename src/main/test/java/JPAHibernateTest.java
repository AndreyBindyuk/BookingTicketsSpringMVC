import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class JPAHibernateTest {
    protected static EntityManager em;


    @BeforeClass
    public static void init() throws FileNotFoundException, SQLException {
        if (em == null) {
            em = Persistence.createEntityManagerFactory("item-manager-pu").createEntityManager();
            em.getTransaction().begin();
        }
    }

    @Before
    public void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        em.clear();
        em.close();
    }

}
