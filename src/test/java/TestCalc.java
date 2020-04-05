import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCalc {
    @Test(enabled = false)
    public void testCalc() throws Exception {
        double a = 1.1, b = 6;
        Calculation.discount(a);
        Calculation.discount(b);
      //  String a1 = Calculation.discount(a);
      //  String b1 = Calculation.discount(b);
        System.out.println("(при значении salary " + a + ")");
        System.out.println("(при значении salary " + b + ")");

        //Assert.assertEquals("Скидка составляет - 15%", Calculation.discount(a));
        //Assert.assertEquals("Скидка составляет - 15%", Calculation.discount(b));

    }

    @Test
    public void testDisc() throws Exception {
        int ticketPrice = 1000;
        double discount = 13;
        double c = Calculation.countTicketPrice(ticketPrice, discount);
        Assert.assertEquals(870, c);
    }

}

