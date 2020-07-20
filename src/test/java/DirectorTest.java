import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Peggy", "TK87GH12", 100000, "Finance", 200000.00);
    }

    @Test
    public void directorHasName(){
        assertEquals("Peggy", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals("TK87GH12", director.getNiNumber());
    }

    @Test
    public void dirctorHasSalary(){
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void directorHasDept(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void dirctorHasBudget(){
        assertEquals(200000, director.getBudget(), 0.01);
    }



    @Test
    public void canRaiseSalary(){
        director.raiseSalary(3.0);
        assertEquals(103000, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000, director.payBonus());
    }

    @Test
    public void cannotRaiseSalaryNegative(){
        director.raiseSalary(-5.5);
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void canChangeName(){
        director.setName("Sue");
        assertEquals("Sue", director.getName());
    }

    @Test
    public void cannotChangeNameIfNull(){
        director.setName(null);
        assertEquals("Peggy", director.getName());
    }
}
