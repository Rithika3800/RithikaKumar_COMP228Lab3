package Exercise3;

import java.util.Scanner;

interface MortgageConstants {
    int Short_term = 1;
    int medium_term = 3;
    int long_term = 5;
    double Max_mortgage = 300000;
    String Bank_name = "CityToronto bank";
}

abstract class Mortgage implements MortgageConstants {
    public String mortgageNumber;
    public String customername;
    public double amountofmortgage;
    public double interestRate;
    public int term;

    public Mortgage(String mortgageNumber, String customername, double amountofmortgage, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customername = customername;

        if (amountofmortgage > Max_mortgage)
        {
            this.amountofmortgage = Max_mortgage;
        } else {
            this.amountofmortgage = amountofmortgage;
        }

        this.interestRate = interestRate;

        if (term == Short_term || term == medium_term || term == long_term)
        {
            this.term = term;
        }
        else
        {
            this.term = Short_term;
        }

    }

    public abstract void setInterestRate(double primeRate);

    public String getMortgageDet()
    {
        return String.format(
                "Mortgage Number: %s" +
                        "\nCustomer Name: %s" +
                        "\nAmount of Mortgage: $%.2f\n" +
                        "Interest Rate: %.2f%%" +
                        "\nTerm: %d years\n",
                mortgageNumber, customername, amountofmortgage, interestRate * 100, term
        );
    }
}

class BusinessMortgage extends Mortgage
{
    public BusinessMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate + 0.01, term);
    }

    public void setInterestRate(double primeRate)
    {
        this.interestRate = primeRate + 0.1;
    }
}

class PersonalMortgage extends Mortgage
{
    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate + 0.02, term);
    }

    public void setInterestRate(double primeRate)
    {
        this.interestRate = primeRate + 0.2;
    }
}

