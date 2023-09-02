package HWnumber03Exception.Exceptions;

public class IncorrectDateException extends Exception{
    public IncorrectDateException() {}

    public void incorrectDateException(String i){
        System.out.println("Incorrect date format!");
        System.out.printf("Check your date format (dd.mm.yyyy): %s!\n", i);
    }
}
