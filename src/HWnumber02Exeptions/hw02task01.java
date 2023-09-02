package HWnumber02Exeptions;

import java.util.Scanner;

public class hw02task01 {

    /*Реализуйте метод, запрашивающий у пользователя ввод дробного числа (типа float),
     и возвращающий введенное значение.
     Ввод текста вместо числа должен приводить не к падению приложения,
     а к повторному запросу у пользователя ввода данных.*/

    public static void main(String[] args) {
        System.out.println(askAndReturnFloat());
    }

    public static float askAndReturnFloat() {
        Scanner sc = new Scanner(System.in);
        String askForValue = ("Enter a real number.");
        System.out.println(askForValue);
        while (true) {
            try {
                return Float.parseFloat(sc.next());
            } catch (NumberFormatException e) {
                System.out.print("That's not a float" + askForValue);
            }
        }
    }
}
