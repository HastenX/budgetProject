public class Souts extends Refrences {
    //Methods producing UI output

    public String getPriority() {
        taskNum++;
        return ("\nSpending #" 
        + taskNum 
        + ":" 
        + this.Task_Name 
        + "\nImportance: " 
        +this.Value 
        + "\nCost: " 
        + this.Cost 
        + "$\n" 
        + (this.Cost / Global_Spendings) * 100
        + "% of Spendings\n-"
        );
    }

    public void getTotal(double getLeftoverTrue, double getLeftoverFalse, double getIncome, 
        double getSavings, double getImpulsive, String getValuePercent) {
        if (getLeftoverTrue >= 0 && getLeftoverTrue != 0) {
            System.out.println("Amount leftover for Savings: "
                    + getSavings()
                    + "$\nAmount of Money leftover for Impuslive Spending: "
                    + getImpulsive() +
                    "$\n-\nTotal Money Left: "
                    + getLeftoverTrue
                    + "$\nTotal Percent of money spent: "
                    + (getLeftoverFalse / getIncome) * 100 + "%"
                    + "\nPercentages of values (1/2/3): " + getValuePercent);
        } else {
            System.out.println("You are in debt from spending "
                    + (getLeftoverTrue * -1)
                    + "$ over your income!" + "\nPercentage over budget: "
                    + ((getLeftoverFalse / getIncome) - 1) * 100 + "%");
        }
    }

    public String getValuePercent() {
        double TotalValue = oneValueSpending + twoValueSpending + threeValueSpending;
        return (oneValueSpending / TotalValue) * 100 + "%/"
            + (twoValueSpending / TotalValue) * 100 + "%/"
            + (threeValueSpending / TotalValue) * 100 + "%";
    }

    public void getCompiled (String ... args) {
        for (String i : args) {
            System.out.println(i);
        }
    }
}