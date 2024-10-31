class Main extends Constants {
    public static void main(String[] agrs) {
        // Income
        Planner Income = new Planner();
        Income.setNetIncome(kINCOME);

        // Food
        Planner Food = new Planner();
        Food.setPriority(kFOOD, kFOODVALUE, kFOODCOST);

        // Housing
        Planner House = new Planner();
        House.setPriority(kHOUSE, kHOUSEVALUE, kHOUSECOST);

        // Utilities
        Planner Utilities = new Planner();
        Utilities.setPriority(kUTILITIES, kUTILITIESVALUE, kUTILITIESCOST);

        // Programming gear
        Planner Programming = new Planner();
        Programming.setPriority(kPROGRAM, kPROGRAMVALUE, kPROGRAMCOST);

        // Running shoes
        Planner Shoes = new Planner();
        Shoes.setPriority(kSHOES, kSHOESVALUE, kSHOESCOST);

        // Outputs
        System.out.println(
                "Income:\nGross Income: " + kINCOME + "$\nNet Income (14.9% Tax): " + Income.getIncome() + "$");

        // Budget Spendings
        System.out.println("-\nBudget spendings: ");
        System.out.println(Food.getPriority(Planner.percentSpending(kFOODCOST)));
        System.out.println(House.getPriority(Planner.percentSpending(kHOUSECOST)));
        System.out.println(Utilities.getPriority(Planner.percentSpending(kUTILITIESCOST)));
        System.out.println(Programming.getPriority(Planner.percentSpending(kPROGRAMCOST)));
        System.out.println(Shoes.getPriority(Planner.percentSpending(kSHOESCOST)));

        // Amount leftover (Savings & Impulsive Spending)
        if (Income.calcLeftover(true) >= 0 && Income.calcLeftover(true) != 0) {
            System.out.println("Amount leftover for Savings: "
                    + Income.Get_Savings()
                    + "$\nAmount of Money leftover for Impuslive Spending: "
                    + Income.Get_Impuslive() +
                    "$\nTotal Money Left: "
                    + Income.calcLeftover(true)
                    + "$\nTotal Percent of money spent: "
                    + ((Income.calcLeftover(false)) / Income.getIncome()) * 100 + "%"
                    + "\nPercentages of values (1/2/3): " + Income.getValuePercent());
        } else {
            System.out.println("You are in debt from spending "
                    + (Income.calcLeftover(true) * -1)
                    + "$ over your income!" + "\nPercentage over budget: "
                    + (((Income.calcLeftover(false)) / Income.getIncome()) - 1) * 100 + "%");
        }
    }
}