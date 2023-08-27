package Topic01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Lect02 {


/*    Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4
    Реализуйте метод, который считывает данные из файла
    и сохраняет в двумерный массив (либо HashMap).
    В отдельном методе нужно будет пройти по структуре данных,
    если сохранено значение ?, заменить его на соответствующее число.
    Если на каком-то месте встречается символ, отличный от числа или ?,
    бросить подходящее исключение.
    Записать в тот же файл данные с замененными символами ?.
    Ctrl + Alt + F */

    private static Map<String , String> hashMap;
    private static final String pathInput = "src/Topic01/doc.txt";
    private static final String pathOutput = "src/Topic01/doc.txt";

    public static void main(String[] args) {
        hashMap = new HashMap();
        mapReader();
        checkArray();
        System.out.println(hashMap);
        mapWriter();
    }

    public static void mapReader() {
        try (BufferedReader bfr = new BufferedReader(new FileReader(pathInput))) {
            String line;
            //String[] strings = new String[2];
            while ((line = bfr.readLine()) != null) {
                var parts = line.split("=");
                hashMap.put(parts[0], parts[1]);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            createNewFile(pathInput);
            mapReader(); // рекурсивный выбор трай новый файд
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void checkArray() {
        for(String key : hashMap.keySet()) {
            if (Objects.equals(hashMap.get(key), "?")){
                calculateAndSaveKeyLength(key);
            } else {
                try {
                    var num = Integer.parseInt(hashMap.get(key));
                    if (key.length() != num){
                        throw new ArithmeticException("Number of key does not meet the condition.");
                    }
                } catch (ArithmeticException | NumberFormatException e) {
                    System.err.println(e.getMessage());
                    calculateAndSaveKeyLength(key);
                }
            }
        }
    }

    public static void mapWriter() {
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(pathOutput))) {
            for (String key : hashMap.keySet()) {
                bfw.write(key + "=" + hashMap.get(key));
                bfw.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void calculateAndSaveKeyLength(String key) {
        hashMap.put(key, String.valueOf(key.length()));
    }

    private static void createNewFile(String path) {
        File file = new File(path); // doc.txt
        try {
            file.createNewFile();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
