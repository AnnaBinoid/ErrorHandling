package HWnumber03Exception.Exceptions;

public class IncorrectSexException extends Exception{
    public IncorrectSexException(){}

    public void incorrectSexException(String i){
        System.out.println("Incorrect date format!");
        System.out.printf("Check your sex format (f or m): %s!\n", i);
    }
}
