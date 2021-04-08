//Given an amount in dollars and a tax percentage. Return an array with the tax amount in cents.
import java.util.*;

class Q1 {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(Arrays.toString(getTaxAmount(15, 2.5)));
  }

  private static double[] getTaxAmount(double amount, double taxPercentage){
    double[] taxAmountInCents = new double[1];
    taxAmountInCents[0] = amount*taxPercentage;

    return taxAmountInCents;
  }
}