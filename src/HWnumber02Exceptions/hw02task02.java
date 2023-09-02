package HWnumber02Exceptions;

public class hw02task02 {

    // Исправить код, если нужно

    public static void main(String[] args) {
        int[] intArray = {0, 1, 2};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
