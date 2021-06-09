import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steven", "HG896745U", 42000.50, "Being Awesome");
    }

    @Test
    public void canGetName(){
        assertEquals("Steven", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Rainbow");
        assertEquals("Rainbow", manager.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("HG896745U", manager.getNInumber());
    }

    @Test
    public void canSetNInumber(){
        manager.setNInumber("KL876535R");
        assertEquals("KL876535R", manager.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(42000.50, manager.getSalary(), 0.0);
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(250000.00);
        assertEquals(250000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(43000.50, manager.raiseSalary(1000),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(420.005, manager.payBonus(),0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Being Awesome", manager.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        manager.setDeptName("More Awesome than Holly");
        assertEquals("More Awesome than Holly", manager.getDeptName());
    }
}
