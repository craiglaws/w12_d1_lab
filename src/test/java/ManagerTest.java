import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("David", "JL86134AB", 30000, "Marketing");
    }

    @Test
    public void managerHasName(){
        assertEquals("David", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals("JL86134AB", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void managerHasDept(){
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5.0);
        assertEquals(31500, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus());
    }
}
