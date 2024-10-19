package Exercise1;
abstract class Insurance
{
    public String typeInsurance;
    public double monthlyCost;

    public Insurance(String typeInsurance) {
        this.typeInsurance = typeInsurance;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public String getTypeInsurance() {
        return typeInsurance;
    }

    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}

class LifeClass extends Insurance
{
    public LifeClass()
    {
        super("Life Insurance");
    }

    public void setInsuranceCost(double cost)
    {
        this.monthlyCost = cost;
    }

    public void displayInfo()
    {
        System.out.println("Type of Insurance: " + getTypeInsurance());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}

class HealthClass extends Insurance {
    public HealthClass() {
        super("Health Insurance");
    }

    public void setInsuranceCost(double cost)
    {
        this.monthlyCost = cost;
    }

    public void displayInfo()
    {
        System.out.println("Type of Insurance: " + getTypeInsurance());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}