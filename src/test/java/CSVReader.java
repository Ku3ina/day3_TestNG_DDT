/*
public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "target/data.csv";
        String line = null;
        String csvSplitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                Object[] salary = line.split(csvSplitBy);
                List<Object> list = Arrays.asList(salary);
                System.out.println(list);

//                System.out.println(salary[0] + " " + salary[1]);
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
16.0,0.0
14.0,0.15
12.0,0.2
7.0,0.2
4.0,0.3
 */


