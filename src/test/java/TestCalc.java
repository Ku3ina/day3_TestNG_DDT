import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCalc {
    @Test
    public void testCalc() throws Exception {
        double salary1 = 16, salary2 = 6;
        //Calculation.discount(salary1);
        Calculation.discount(salary2);
        //Assert.assertEquals( Calculation.discount(salary1), 0);
        Assert.assertEquals( Calculation.discount(salary2), 0.2);
    }

    @Test(enabled = false)
    public void testDisc() throws Exception {
        int ticketPrice = 1000;
        double discount = 0.2;
        double c = Calculation.countTicketPrice(ticketPrice, discount);
        Assert.assertEquals(c, 800);
    }

}

