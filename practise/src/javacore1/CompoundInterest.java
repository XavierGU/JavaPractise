package javacore1;

public class CompoundInterest {
    public static void main(String[] args) {
        final double startInterest = 10;
        final int years = 10;
        final int rate = 6;
        double[] interestRate = new double[rate];
        for (int i = 0;i<interestRate.length;i++)
            interestRate[i]=(startInterest+i)/100.0;

        double[][]balances = new double[years][rate];
        for (int i = 0;i<balances[0].length;i++)
            balances[0][i]=10000;

        for (int i = 1;i<balances.length;i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double lastInterest = balances[i - 1][j];
                double interest = lastInterest * interestRate[j];
                balances[i][j] = lastInterest + interest;
            }
        }
        for (int i = 0;i<interestRate.length;i++)
            System.out.printf("%9.0f%%",100*interestRate[i]);
            System.out.println();
            for (double[] row:balances){
                for (double b :row)
                    System.out.printf("%10.2f",b);
                    System.out.println();
                }
    }

}
