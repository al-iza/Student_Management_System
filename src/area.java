import java.io.IOException;
import java.util.Scanner;

public class area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length;
        int breadth;
        int height;
        int volume;

        System.out.println("Enter the length of cube: ");
        length = sc.nextInt();

        System.out.println("Enter the breadth of your cube: ");
        breadth = sc.nextInt();

        System.out.println("Enter the height of your cube: ");
        height = sc.nextInt();

        System.out.println("Volume of the cube is: "+length*breadth*height);
        volume = sc.nextInt();


    }


    }

