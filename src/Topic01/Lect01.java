package Topic01;

public class Lect01 {
    // исключение - это тип объектов
    // коды ошибок или исключения
    // несколько исключений невозможно,
    // т.к. после проброски первого исключения JVM выйдет

    public static void main(String[] args) {
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
//1        System.out.println(divide(10, 0));
//2        int[] ints = new int[10];
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1000 out of bounds for length
//3        System.out.println(ints[1000]);
        // -//- стек трейс вызовов, откуда пошла ошибка
//4        first();
 //       System.out.println(divide(10, 0));

    }

    public static int divide(int a, int b){
        if(b == 0 ){
            throw new RuntimeException("Divide by zero not permited.");
        }
        return a/b;
    }

/*4

    public static void first(){
        second();
    }

    public static void second(){
        third();
    }

    public static void third(){
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }*/

}
