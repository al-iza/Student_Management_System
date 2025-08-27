import java.util.Scanner;

public class aliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.nextLine();

        System.out.print("Enter you age: ");
        int age = sc.nextInt();

        System.out.print("Enter you height: ");
        double height = sc.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        if (isStudent) {
            System.out.println("Student is alive");
        } else {
            System.out.println("Student is not alive");
        }

        System.out.print("Hello " + name + " You are " + age + " years old" + " and you are " + height + " cm tall.");

          sc.close();

    }}

