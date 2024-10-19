package Exercise2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Game Tester Type:");
        System.out.println("1. FullTime");
        System.out.println("2. PartTime");
        int choice = input.nextInt();
        input.nextLine();
        System.out.print("Enter the name of the game tester: ");
        String testername = input.nextLine();

        GameTester Tester = null;

        switch (choice)
        {
            case 1:
                Tester = new FullTimeGameTester(testername);
                break;
            case 2:
                System.out.print("Enter the number of hours worked: ");
                double hours = input.nextDouble();
                Tester = new PartTimeGameTester(testername, hours);
                break;
            default:
                System.out.print("Invalid choice.Please choose from (PartTime,FullTime)");
        }
        Tester.displayInfo();
        input.close();
    }
}