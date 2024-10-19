package Exercise3;
import java.util.Scanner;

public class ProcessMortgage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Mortgage[] mort = new Mortgage[3];

        System.out.print("Please enter the current prime interest rate: ");
        double primeRate = input.nextDouble();
        input.nextLine();

        for (int r = 0; r < mort.length; r++)
        {
            System.out.println("\nEnter details for Mortgage " + (r + 1));

            System.out.print("Enter Mortgage Number: ");
            String mortgageNumber = input.nextLine();
            System.out.print("Enter Customer Name: ");
            String customerName = input.nextLine();

            System.out.print("Enter the Mortgage Amount: ");
            double amount = input.nextDouble();

            System.out.print("Enter the term: ");
            int term = input.nextInt();
            input.nextLine();

            System.out.print("1 Business or 2 Personal mortgage");
            int Type = input.nextInt();
            input.nextLine();

            if (Type == 1)
            {
                mort[r] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else if (Type == 2)
            {
                mort[r] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else {
                System.out.println("Invalid.");
                r--;
            }
        }
        System.out.println("Details regarding Mortgages:");
        for (Mortgage mortgage : mort)
        {
            System.out.println(mortgage.getMortgageDet());
        }
        input.close();
    }
}
