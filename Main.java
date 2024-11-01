class Main extends Constants {
    public static void main(String[] agrs) {
        // Income
        Souts Income = new Souts();
        Income.setNetIncome(kINCOME);
        // Food
        Souts Food = new Souts();
        Food.setPriority(kFOOD, kFOODVALUE, kFOODCOST);

        // Housing
        Souts House = new Souts();
        House.setPriority(kHOUSE, kHOUSEVALUE, kHOUSECOST);

        // Utilities
        Souts Utilities = new Souts();
        Utilities.setPriority(kUTILITIES, kUTILITIESVALUE, kUTILITIESCOST);

        // Programming gear
        Souts Programming = new Souts();
        Programming.setPriority(kPROGRAM, kPROGRAMVALUE, kPROGRAMCOST);

        // Running shoes
        Souts Shoes = new Souts();
        Shoes.setPriority(kSHOES, kSHOESVALUE, kSHOESCOST);

        // Outputs Income Info
        Income.getTotalIncomeInfo(kINCOME, Income.getIncome());

        // Budget Spendings compiled
        Income.getCompiled(
            Food.getPriority()
            +House.getPriority()
            +Utilities.getPriority()
            +Programming.getPriority()
            +Shoes.getPriority()
        );


        // Amount leftover (Savings & Impulsive Spending)
        Income.getTotal(
        (Income.getLeftover(true)), (Income.getLeftover(false)),
        (Income.getIncome()), (Income.getSavings()), (Income.getImpulsive()), (Income.getValuePercent())
        );
    }
}