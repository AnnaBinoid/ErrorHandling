package HWnumber01Exceptions;

/*1. Реализуйте метод, принимающий в качестве аргументов двумерный массив
Метод проверяет, что длина строк и столбцов с одинаковым индексом одинакова,
детализировать какие строки со столбцами не требуется.*/

public class gbExceptions01hw {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[]{0, 5, 0};
        array[1] = new int[]{0, 0};
        array[2] = new int[]{1, 1, 0};
        try {
            isColumnEqualsRow(array);
        }
        catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

    }

    public static void isColumnEqualsRow(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++ ){

            }
            if (arr[i].length == arr.length){
                System.out.printf("Length of column %d is equals to length of row %d.\n", i, i);
            }
            else System.out.println("Lengths of column and row aren't equals!!!!");
        }

    }

}
