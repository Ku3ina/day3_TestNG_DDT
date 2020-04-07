import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCalc {

    @DataProvider
    public Object[][] discDataProvider() {
        return new Object[][]{ //вместо Object тут может использоваться любой файл с тестовыми данными
                (new Double[]{16.0, 0.0}),// зп 16, скидка 0
                (new Double[]{14.0, 0.15}),// зп 16, скидка 0.15
                (new Double[]{12.0, 0.2}),// зп 16, скидка 0.2
                (new Double[]{7.0, 0.2}),// зп 16, скидка 0.2
                (new Double[]{4.0, 0.3}),// зп 16, скидка 0.3
                (new Double[]{4.0, 0.1})// зп 16, скидка 0.3 тест не пройдет
        };
    }

    @Test(dataProvider = "discDataProvider")
    public void testCalc(double salary, double discoun) {
        System.out.println("При зарплате " + salary + " скидка составляет " + Calculation.discount(salary));
        Assert.assertEquals(Calculation.discount(salary), discoun);
        System.out.println("Тест пройден:\n" + "Ожидаемый результат " + discoun + ", Фактический результат " + Calculation.discount(salary));

/* Без использования dataProvider
        double salary1 = 16;
        Calculation.discount(salary1);
        Assert.assertEquals( Calculation.discount(salary1), 0);
 */
    }

    @Test
    public void testDisc() throws Exception {
        int ticketPrice = 1000;
        double discount = 0.2;
        double c = Calculation.countTicketPrice(ticketPrice, discount);
        Assert.assertEquals(c, 800);
    }

}

