import java.util.Random;

public class day1 {
  public static void main(String[] args) {
    Random rand = new Random();
    int number1;
    int number2;
    int number3;

    number1 = rand.nextInt(1, 101);
    number2 = rand.nextInt(1, 101);
    number3 = rand.nextInt(1, 101);

    System.out.println("Number 1: " + number1);
    System.out.println("Number 2: " + number2);
    System.out.println("Number 3: " + number3);

    double number;
    number = rand.nextDouble(10, 20);
    System.out.println("The number is " + number);

    boolean isheads = rand.nextBoolean();
    if (isheads) {
      System.out.println("HEADS");
    } else {
      System.out.println("TAILS");
    }
  }
}


