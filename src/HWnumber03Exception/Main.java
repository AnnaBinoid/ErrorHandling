package HWnumber03Exception;

import HW03.HWnumber03Exception.DateWorkers.ParseData;
import HWnumber03Exception.DateWorkers.WriteDataInFile;
import HWnumber03Exception.Exceptions.IncorrectDataException;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ParseData parseData = new ParseData();
        String newFileName = null; // Иннициализация переменной
        WriteDataInFile writeDataInFile = new WriteDataInFile();

        HashMap<String, Object> data = parseData.parsInputData(); // Иннициализация словаря
        while (data.size() != 6) {
            try {
                throw new IncorrectDataException();
            } catch (IncorrectDataException e) {
                data = parseData.parsInputData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeDataInFile.writeDateInFile(String.valueOf(sb), filePath);

    }
}
