import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director director;

    @Before
    public void before(){
        director = new Director("Holly", "HG896745U", 42000.50, "Being Awesome", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Holly", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Rainbow");
        assertEquals("Rainbow", director.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("HG896745U", director.getNInumber());
    }

    @Test
    public void canSetNInumber(){
        director.setNInumber("KL876535R");
        assertEquals("KL876535R", director.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(42000.50, director.getSalary(), 0.0);
    }

    @Test
    public void canSetSalary(){
        director.setSalary(250000.00);
        assertEquals(250000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(43000.50, director.raiseSalary(1000),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(420.005, director.payBonus(),0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Being Awesome", director.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        director.setDeptName("More Awesome than Holly");
        assertEquals("More Awesome than Holly", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget());
    }

    @Test
    public void canSetBudget(){
        director.setBudget(150000);
        assertEquals(150000, director.getBudget());
    }
}
