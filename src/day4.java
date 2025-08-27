import java.util.Scanner;
public class day4 {
  public static void main(String[] args) {
    //compound interest calculator
    Scanner sc = new Scanner(System.in);
    double principle;
    double years;
    double rate;
    double timesCompound;
    double amount;

    System.out.println("Enter the principal amount: ");
    principle = sc.nextDouble();

    System.out.print("Enter the number of years: ");
    years = sc.nextDouble();

    System.out.print("Enter the rate: ");
    rate =sc.nextDouble() /100;

    System.out.println("Enter the timesCompound: ");
    timesCompound =sc.nextDouble();

    amount = principle * Math.pow(1 + rate/timesCompound, timesCompound * years);
    System.out.printf("The amount after %.1f years is $%.2f" , years , amount);

    sc.close();

  }
}
