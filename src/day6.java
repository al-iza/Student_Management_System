import java.util.Scanner;
public class day6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows;
    int columns;
    char symbol;

    System.out.print("Enter the number of rows: ");
    rows = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    columns = sc.nextInt();
    System.out.print("Enter the symbols: ");
    symbol = sc.next().charAt(0);

  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
          System.out.print(symbol);
    }
    System.out.println();
  }
    sc.close();
  }
}