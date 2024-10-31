public class Planner extends Refrences {
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

    public String getPriority(double percentSpending) {
        taskNum++;
        return "Spending #" + taskNum + ":" + this.Task_Name + "\nImportance: " +
                this.Value + "\n" + "Cost: " + this.Cost + "$" + "\n" +
                percentSpending + "% of Spendings\n-";
    }

    public double getIncome() {
        return this.Income;
    }

    public String getValuePercent() {
        double TotalValue = oneValueSpending + twoValueSpending + threeValueSpending;
        return (oneValueSpending / TotalValue) * 100 + "%/"
                + (twoValueSpending / TotalValue) * 100 + "%/"
                + (threeValueSpending / TotalValue) * 100 + "%";
    }
}
