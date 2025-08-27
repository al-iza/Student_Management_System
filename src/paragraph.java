import java.util.Scanner;

public class paragraph{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = sc.nextLine();

        System.out.print("Enter an noun (animal/person/object): ");
        noun1 = sc.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = sc.nextLine();

        System.out.print("Enter a verb end with -ing(action): ");
        verb1 = sc.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = sc.nextLine();

        System.out.println("Today was overall a "+adjective1+" time." );
        System.out.println("In an exhibit, I saw a " + noun1+ "." );
        System.out.println(noun1+ " was "+ adjective1+ " and " + verb1 + "!");
        System.out.println("Today I went to a "+adjective3+" day." );

        sc.close();
    }
}

