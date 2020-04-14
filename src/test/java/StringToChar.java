import java.util.Arrays;

public class StringToChar {

    //Конвертируем String в char и char в String на java
    public static void main(String[] args) {
        //Преобразуем строку в массив char'ов
        String string = "кака вака";
        char[] arr = string.toCharArray();

        System.out.println("Строку в массив символов: " + Arrays.toString(arr));
        //String в char

        for (int i = 0; i < arr.length; i++) {
            char c = string.charAt(i);
            System.out.println("String в char: " + c);
//            System.out.println(arr[i]);
        }
        char c = string.charAt(1);
        System.out.println("String в char: " + c);

        //        char в String
        String s = Character.toString(c);
        System.out.println("char в String: " + s);

        //удаляем символ 1 со строки
        System.out.println("удаляем все символы '1' со строки: " +

                removeSpecificCharsFromString("1A1B1C1D121D1", '1'));
    }

    private static String removeSpecificCharsFromString(String str, char c) {
        // находим в строке str все символы c и заменяем на строковую заглушку ""
        return str.replaceAll(Character.toString(c), "");
    }

}

