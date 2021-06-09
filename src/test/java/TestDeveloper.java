import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steven", "HG896745U", 42000.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Steven", developer.getName());
    }

    @Test
    public void canSetName(){
        developer.setName("Rainbow");
        assertEquals("Rainbow", developer.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("HG896745U", developer.getNInumber());
    }

    @Test
    public void canSetNInumber(){
        developer.setNInumber("KL876535R");
        assertEquals("KL876535R", developer.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(42000.50, developer.getSalary(), 0.0);
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(250000.00);
        assertEquals(250000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(43000.50, developer.raiseSalary(1000),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(420.005, developer.payBonus(),0.0);
    }
}
