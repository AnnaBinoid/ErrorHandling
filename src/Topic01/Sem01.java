package Topic01;

import java.io.OutputStream;

public class Sem01 {

    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив
     и некоторое значение. Метод ищет в массиве заданное значение
      и возвращает его индекс. При этом, например:
    если длина массива меньше некоторого заданного минимума,
    метод возвращает -1, в качестве кода ошибки.

    если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    если вместо массива пришел null, метод вернет -3


придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
*/

/*
    public static void main(String[] args) {
 //       int[] ints = null;
        int[] ints = {2, 2, 2, 2};
        int ourValue = 5;
        int res = findValue(ints, ourValue);
        System.out.println(res);
    }

    public static int findValue (int[] arr, int value){
        if (arr == null) {
            return -3;
        }
        if (arr.length < 1){
            return -1;
        }
        for (int i: arr) {
            if (value == arr[i]){
                return i;
            }
        }
            return -2;
    }

 */


  /*    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива. 2 ограничения:
    метод может работать только с квадратными массивами
            (кол-во строк = кол-ву столбцов),
    и в каждой ячейке может лежать только значение 0 или 1.

    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.*/

    /*public static void main(String[] args) {
        int[][] ints = new int[3][];
        ints[0] = new int[]{0, 5, 0};
        ints[1] = new int[]{0, 0, 1};
        ints[2] = new int[]{1, 1, 0};

        try {
            System.out.println(matrixCount(ints));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("\t***\nIt's steel working.\n\t***");
    }

    public static int matrixCount(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 1 && matrix[i][j] != 0) {
                    throw new RuntimeException("\n" +
                            "Incorrect value entered. It must be 0 or 1");
                }
                result += matrix[i][j];
            }
            if (matrix.length != matrix[i].length) {
                throw new RuntimeException("Not square massive");
            }
        }
        return result;
    }*/

    /*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого
    равен сумме элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

    public static void main(String[] args) {
        int[] first = {0, 1, 2};
        int[] second = {2, 3, 5};

        try {
            if (first == null && second == null){
                System.out.print(0);
            }
            else if (first == null) {
                for (int i: second) {
                    System.out.print(i + ", ");
                }
            }
            else if (second == null){
                for (int i : first) {
                    System.out.print(i + ", ");
                }
            }
            int[] third = massiveWithSumsOfElements(first, second);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {

            int[] third = massiveWithSumsOfElements(first, second);
            for (int i: third) {
                System.out.print(i + ", ");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        int[] third = diffMassives(first, second);
        for (int i: third) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");

    }

    public static int[] massiveWithSumsOfElements(int[] one, int[] two){
        int[] joinedArray = new int[one.length];
        if (one.length != two.length){
            throw new RuntimeException("Massives are not equals");
        }
        else {
            for (int i = 0; i < one.length; i++) {
                joinedArray[i] = one[i] + two[i];
            }
        }
        return joinedArray;
    }
    public static int[] diffMassives(int[] one, int[] two){
        int minLength = one.length;
        if (one.length > two.length){
            minLength = two.length;
        }
        int[] difArray = new int[minLength];
        for (int i = 0; i < minLength; i++) {
            difArray[i] = one[i] + two[i];
        }
        return difArray;
    }
}


