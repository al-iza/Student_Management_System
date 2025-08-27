public class day5 {

  public static void main(String[]args){
    boolean isStudent = false;
    boolean isSenior = false;
    double price= 9.99;

    if(isStudent){
      if(isSenior) {
        System.out.println("You get a student discount of 20%");
        System.out.println("You get a senior discount of 10%");
        price *= 0.7;
      }
      else{
          System.out.println("You get a Senior discount of 10%");
          price *=0.9;
        }
      }
    else{
      if(isSenior) {
        System.out.println("You get a Senior discount of 20%");
        price *= 0.8; // 20% off
      }
      else{
        price *= 1.0;

      }

    }
    System.out.printf("The price of the ticket is $%.2f\n ",price);
  }
  }
//
//
//public class day5 {
//
//  public static void main(String[] args) {
//    boolean isStudent = false;
//    boolean isSenior = true;
//    double price = 9.99;
//
//    if (isStudent) {
//      if (isSenior) {
//        System.out.println("You get a student discount of 20%");
//        System.out.println("You get a senior discount of 10%");
//        price *= 0.7; // 30% off total
//      } else {
//        System.out.println("You get a student discount of 10%");
//        price *= 0.9; // 10% off
//      }
//    } else {
//      if (isSenior) {
//        System.out.println("You get a senior discount of 20%");
//        price *= 0.8; // 20% off
//      } else {
//        System.out.println("No discount applied");
//        price *= 1.0; // full price
//      }
//    }
//
//    System.out.printf("The final price is $%.2f%n", price);
//  }
//}
