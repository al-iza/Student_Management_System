import java.util.Scanner;
public class cart {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency;

        System.out.print("Enter the name of the item you want to buy: ");
        item = sc.nextLine();
        System.out.print("Enter the price of the item you want to buy: ");
        price = sc.nextDouble();
        System.out.print("Enter the quantity of the item you want to buy: ");
        quantity = sc.nextInt();
        System.out.print("Enter the currency code of the item you want to buy: ");
        currency = sc.next().charAt(0);

        System.out.println("Total price of your "+ item+"s"+" are " + currency+ price*quantity);

        sc.close();
    }
}
