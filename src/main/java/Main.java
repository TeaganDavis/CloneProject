// Need comment at the top of the program.

// Changes made: Condensed some code, changed most println to just print
// Nothing changed in Data.java
// - Syl
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the download size: ");
        double dataAmount = Double.parseDouble(input.nextLine());
        /*
            Instead of doing this:
                System.out.println("Enter the measurement on the download");
                System.out.println("(bytes, kilobytes, megabytes, gigabytes): ");
            Do this:
         */
        System.out.print("Enter the measurement of the download\n(bytes, kilobytes, megabytes, gigabytes): ");
        String unit = input.nextLine();

        System.out.print("Enter your download speed (Megabits/sec): ");
        int speed = Integer.parseInt(input.nextLine());

        //Build a Data object with these three values
        Data newData = new Data(dataAmount, unit, speed);
        newData.convertToMegabytes();
        newData.calculateDownloadTime();

        //Print out the data Object with your toString();
        System.out.println(newData.toString());
    }
}
