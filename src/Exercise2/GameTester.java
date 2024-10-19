package Exercise2;

import java.util.Scanner;

abstract class GameTester
{
    public String testername;
    public boolean FullTime;

    public GameTester(String name, boolean FullTime)
    {
        this.testername = testername;
        this.FullTime = FullTime;
    }

    public abstract double calculateSalary();

    public  void displayInfo() {
    System.out.println("Game Tester Type: " + testername);
    System.out.println("Salary of tester: $" + calculateSalary());
}
}

class FullTimeGameTester extends GameTester
{
    private static final double Basesalary = 3000;

    public FullTimeGameTester(String name)
    {
        super(name, true);
    }
    public double calculateSalary()
    {
        return Basesalary;
    }
}

class PartTimeGameTester extends GameTester
{
    private double WorkedHours;
    private static final double Hourlypay = 20;

    public PartTimeGameTester(String name, double WorkedHours)
    {
        super(name, false);
        this.WorkedHours = WorkedHours;
    }

    public double calculateSalary()
    {
        return Hourlypay * WorkedHours;
    }
}

