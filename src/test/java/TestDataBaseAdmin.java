import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class TestDataBaseAdmin {
    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Steven", "HG896745U", 42000.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Steven", dataBaseAdmin.getName());
    }

    @Test
    public void canSetName(){
        dataBaseAdmin.setName("Rainbow");
        assertEquals("Rainbow", dataBaseAdmin.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("HG896745U", dataBaseAdmin.getNInumber());
    }

    @Test
    public void canSetNInumber(){
        dataBaseAdmin.setNInumber("KL876535R");
        assertEquals("KL876535R", dataBaseAdmin.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(42000.50, dataBaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canSetSalary(){
        dataBaseAdmin.setSalary(250000.00);
        assertEquals(250000.00, dataBaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(43000.50, dataBaseAdmin.raiseSalary(1000),0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(420.005, dataBaseAdmin.payBonus(), 0.0);
    }
}
