import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TestCalc {
/*
    @DataProvider
    public Object[][] discDataProvider() {
        return new Object[][]{ //вместо Object тут может использоваться любой файл с тестовыми данными
                (new Double[]{16.0, 0.0}),// зп 16, скидка 0
                (new Double[]{14.0, 0.15}),// зп 16, скидка 0.15
                (new Double[]{12.0, 0.2}),// зп 16, скидка 0.2
                (new Double[]{7.0, 0.2}),// зп 16, скидка 0.2
                (new Double[]{4.0, 0.3}),// зп 16, скидка 0.3
//                (new Double[]{4.0, 0.1})// зп 16, скидка 0.3 тест не пройдет
        };

 */

//    @DataProvider
//    public Object[][] dataCSVReader() {
//        CSVReader
//        for (int i = 0; i < salary.length; i++) {
//                    System.out.println(salary[i]);
//               }
//        return new Object[0][];
//    } }
//
//    @DataProvider(name = "CSVReader")
//    public Iterator<Object[]> testData() throws IOException {
//        return CSVReader.parseTestData("/Users/tersi/Documents/data.csv");
//    }
/*
    @DataProvider
    public Object[][] csvData() {
        String csvFile = "target/data.csv";
        String line = null;
        String csvSplitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] salary = line.split(csvSplitBy);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         return salary[][]
    }
        return new Object[][]{ //вместо Object тут может использоваться любой файл с тестовыми данными
                (new Double[]{16.0, 0.0}),// зп 16, скидка 0
                (new Double[]{14.0, 0.15}),// зп 16, скидка 0.15
                (new Double[]{12.0, 0.2}),// зп 16, скидка 0.2
                (new Double[]{7.0, 0.2}),// зп 16, скидка 0.2
                (new Double[]{4.0, 0.3}),// зп 16, скидка 0.3

        public static void main(String[] args) {
            String csvFile = "target/data.csv";
            String line = null;
            String csvSplitBy = ",";
            try {
                BufferedReader br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {
                    String[] salary = line.split(csvSplitBy);
                    System.out.println(salary[0] + " " + salary[1]);
//                System.out.println(Arrays.toString(salary));

//                for (int i = 0; i < salary.length; i++) {
//                    System.out.println(salary[i]);
//                }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        };

 */

    @DataProvider
    public static Object[] usingCSV() {
        String csvFile = "target/data.csv";
        String line;
        String csvSplitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                Object[] arr1 = line.split(csvSplitBy);
                return arr1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Object[]{};
    }

    @Test(dataProvider = "usingCSV")
    public void testDisc(String s) {
        String res = "приветик";
        Assert.assertEquals(s, res, "Тест не пройден");
        System.out.println("Тест пройден:\n" + "Ожидаемый результат " + s + ", Фактический результат " + res);
    }


    @Test(enabled = false)
    public void testDisc() throws Exception {
        int ticketPrice = 1000;
        double discount = 0.2;
        double c = Calculation.countTicketPrice(ticketPrice, discount);
        Assert.assertEquals(c, 800);
    }

}

