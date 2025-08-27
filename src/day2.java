import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {

        //Hypotenuse c = Math.sqrt(a**2+b**2)
        Scanner sc = new Scanner(System.in);

//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side A: ");
//        a = input.nextDouble();
//
//        System.out.print("Enter the length of side B: ");
//        b = input.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("The hypotenuse of c is: " + c);

        double circumference;
        double volume;
        double area;
        double radius;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

       circumference = 2 * Math.PI * radius;
       area = Math.PI * Math.pow(radius, 2);
       volume= (4.0/3.0) * Math.PI * Math.pow(radius, 3);

       System.out.println("The circumference is: " + circumference + "cm");
       System.out.println("The volume is: " + volume);
       System.out.println("The area is: " + area);
sc.close();


    }
}
