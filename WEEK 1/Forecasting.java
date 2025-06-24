import java.util.*;
public class Forecasting {

   public static double futureValueIterative(double presentValue, double growthRate, int periods) {
    double result = presentValue;
    for (int i = 0; i < periods; i++) {
        result *= (1 + growthRate);
    }
    return result;
}


    public static void main(String[] args) {
        double pv = 10000; // amount
        double rate = 0.05; // 5%
        int n = 5; // 5 years

        double result = futureValueIterative(pv, rate, n);
        System.out.printf("Future Value after %d years = ₹%.2f%n", n, result);
    }
}
