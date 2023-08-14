import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the download size: ");
        double dataAmount = Double.parseDouble(input.nextLine());

        System.out.println("Enter the measurement on the download");
        System.out.println("(bytes, kilobytes, megabytes, gigabytes): ");
        String unit = input.nextLine();

        System.out.println("Enter your download speed (Megabits/sec): ");
        int speed = Integer.parseInt(input.nextLine());

        //Build a Data object with these three values
        Data newData = new Data(dataAmount, unit, speed);
        newData.convertToMegabytes();
        newData.calculateDownloadTime();

        //Print out the data Object with your toString();
        System.out.println(newData.toString());
    }
}
