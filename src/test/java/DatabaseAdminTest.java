import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaser;

    @Before
    public void before(){
        databaser = new DatabaseAdmin("Boris", "ZYXV9876", 22000);
    }

    @Test
    public void databaserHasName(){
        assertEquals("Boris", databaser.getName());
    }

    @Test
    public void databaserHasNINumber(){
        assertEquals("ZYXV9876", databaser.getNiNumber());
    }

    @Test
    public void databaserHasSalary(){
        assertEquals(22000, databaser.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaser.raiseSalary(10.0);
        assertEquals(24200, databaser.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(220, databaser.payBonus());
    }
}
