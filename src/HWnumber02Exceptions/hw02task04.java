package HWnumber02Exceptions;

import java.util.Scanner;

public class hw02task04 {

    /*������������ ���������,
    ������� �������� Exception, ����� ������������ ������ ������ ������.
    ������������ ������ ���������� ���������, ��� ������ ������ ������� ������.
    */

    public static void main(String[] args) {
        enterNotNullStrings();
    }

    public static void enterNotNullStrings() {
        Scanner sc = new Scanner(System.in);
        String promt = ("Enter your string or \"end\" if you want to stop this program.");
        System.out.println(promt);
        String s = sc.nextLine();
        while (!s.equals("end")) {
            try {
                System.out.println(s);
                if ((s.length() == 0) || (s.chars().allMatch(Character::isWhitespace)) || (s.equals(null))) {
                    throw new NullPointerException("You can't enter empty string!");
                }
            } catch (NullPointerException e) {
                System.err.println(e.getMessage() + "\n" + promt);
            }
            s = sc.nextLine();
        }
    }
}
