public class Refrences {
    public static double threeValueSpending;
    public static double twoValueSpending;
    public static double oneValueSpending;

    public static double Global_Spendings;
    protected  static int taskNum;

    int Value;
    double Cost;
    double Income;
    String Task_Name;

    //Income methods
    public void setNetIncome(double Income) {
        this.Income = Income * 0.851;
        // This tax value was chosen via the 14.9 average American taxed %
        // (1-0.149=0.851)
    }

    //setting Priority method
    public void setPriority(String Task_Name, int Value, double Cost) {
        if (Value >= 3) {
            this.Value = 3;
            threeValueSpending += Cost;
        } else {
            if (Value <= 1) {
                this.Value = 1;
                oneValueSpending += Cost;
            } else {
                this.Value = Value;
                twoValueSpending += Cost;
            }
        }
        this.Cost = Cost;
        this.Task_Name = Task_Name;
        Global_Spendings += Cost;
    }

    public double getLeftover(boolean withSpend) {
        if (withSpend == true) {
            return Income - Global_Spendings;
        } else {
            return Global_Spendings;
        }
    }

    public double getSavings() {
        return getLeftover(true) * 0.75;
    }

    public double getImpulsive() {
        return getLeftover(true) * 0.25;
    }

    public void getTotalIncomeInfo(double grossIncome, double netIncome) {
        System.out.println("Income:\nGross Income: " 
            + grossIncome 
            + "$\nNet Income (14.9% Tax): "
            + netIncome + "$");
    }

    public double getIncome() {
        return this.Income;
    }

}
