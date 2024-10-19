package Exercise1;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Insurance[] insu = new Insurance[2];

        for (int r = 0; r < insu.length; r++)
        {
            System.out.println("Enter the type of insurance (Life or Health):");
            String insuranceType = input.nextLine();

            System.out.println("Enter the monthly cost of insurance:");
            double cost = input.nextDouble();
            input.nextLine(); // Clear the buffer

            switch (insuranceType.toLowerCase())
            {
                case "life":
                    insu[r] = new LifeClass();
                    break;
                case "health":
                    insu[r] = new HealthClass();
                    break;
                default:
                    System.out.println("Invalid insurances.please choose from(life,health).");
                    r--;
                    continue;
            }
            insu[r].setInsuranceCost(cost);
        }

        System.out.println("\nInformation of Insurances:");
        insu[0].displayInfo();
        insu[1].displayInfo();

        input.close();
    }
}