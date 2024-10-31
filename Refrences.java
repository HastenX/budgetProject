public class Refrences {
    public static double threeValueSpending;
    public static double twoValueSpending;
    public static double oneValueSpending;

    public static double Global_Spendings;
    public static int taskNum;

    int Value;
    double Cost;
    double Income;
    String Task_Name;

    
    public void setNetIncome(double Income) {
        this.Income = Income * 0.851;
        // This tax value was chosen via the 14.9 average American taxed %
        // (1-0.149=0.851)
    }

    static double percentSpending(double Cost) {
        return (Cost / Global_Spendings) * 100;
    }

    public double calcLeftover(boolean withSpend) {
        if (withSpend == true) {
            return Income - Global_Spendings;
        } else {
            return Global_Spendings;
        }
    }

    public double Get_Savings() {
        return calcLeftover(true) * 0.75;
    }

    public double Get_Impuslive() {
        return calcLeftover(true) * 0.25;
    }
}
