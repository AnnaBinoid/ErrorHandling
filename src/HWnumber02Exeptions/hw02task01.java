package HWnumber02Exeptions;

import java.util.Scanner;

public class hw02task01 {

    /*���������� �����, ������������� � ������������ ���� �������� ����� (���� float),
     � ������������ ��������� ��������.
     ���� ������ ������ ����� ������ ��������� �� � ������� ����������,
     � � ���������� ������� � ������������ ����� ������.*/

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
