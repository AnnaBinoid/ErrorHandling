package HWnumber03Exception.Exceptions;

public class IncorrectDataException extends Exception{
    public IncorrectDataException(){}

    public void incorrectDataException(String i){
        System.out.println("Incorrect data format!");
        System.out.printf("Check your format: %s!\n", i);
    }

}
