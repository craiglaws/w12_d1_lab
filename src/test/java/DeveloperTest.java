import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Emily", "ABCD1234", 25000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Emily", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals("ABCD1234", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2.5);
        assertEquals(25625, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, developer.payBonus());
    }
}
