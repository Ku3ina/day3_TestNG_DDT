import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderToObject {
    public static Object[] stringToObj() {
        String csvFile = "target/data.csv";
        String line = null;
        String csvSplitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(csvSplitBy);
                Object[] arr1 = arr;
                return arr1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Object[0];
    }
}



/*
Object[][] getCSV()


public class CSVReader {


    public static Iterator<Object[]> parseTestData(String fileName) throws IOException {
        BufferedReader input = null;
        File file = new File(fileName);
        input = new BufferedReader(new FileReader(file));
        String line = null;
        ArrayList<Object[]> data = new ArrayList<Object[]>();
        while ((line = input.readLine()) != null) {
            String in = line.trim();
            String[] temp = in.split(",");
            List<Object> array = new ArrayList<Object>();
            for (String s : temp) {
                array.add(Integer.parseInt(s));
            }
            data.add(array.toArray());
        }
        input.close();
        return data.iterator();
    }
}
 */
/*
public class CSVReader {
    public static void main(String[] args) {
       String csvFile = "target/data.csv";
        String line = null;
        String csvSplitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] string = line.split(csvSplitBy);
                char[] char = string.
                System.out.println(string[0] + " " + string[1]);
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
    }
}

 */
