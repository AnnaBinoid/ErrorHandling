package HWnumber03Exception.DateWorkers;

import java.util.Scanner;

public class GetData {
    public String[] getData() {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter the data SEPARATED BY A SPACE: " +
                    "\n01. Name\n02. Surname\n03.Second Name\n" +
                    "04. Date of birth (FORMAT: dd.mm.yyyy. Example: 31.12.2022)\n" +
                    "05. Phone number (FORMAT: just number without separators. Example: 89009001122\n" +
                    "06. Sex (FORMAT: m (for men) or f (for females).");
            String data = scan.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6){
                return arrayData;
            }
            if (arrayData.length < 6){
                System.out.println("Not enought data! Try again!");
            } else if (data.length() > 6){
                System.out.println("Too mach data! Try again!");
            }
        }
    }
}
