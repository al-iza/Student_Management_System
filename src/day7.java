public class day7 {
  public static void main(String[] args) {

    String name= "Aliza";
    int age = 20;
    if (ageCheck(age)){
      System.out.println("You are an adult! You can Signup for the card!!");
    }
    else {
      System.out.println("You must be 18+ to Signup for the card!!");
    }

    double result = square(9);
    System.out.println(result);

    double result1 = cube(9);
    System.out.println(result1);

    happyBirthday(name,age);
    happyBirthday(name,age);
    happyBirthday(name,age);

  }

  static double square(double number){
    return number*number;
  }

  static double cube(double number){
    return number*number*number;
  }

  static void happyBirthday(String name,int age){
    System.out.printf("Happy Birthday to you %s\n",name);
    System.out.printf("Happy Birthday to you %s\n",name);
    System.out.printf("Happy %d\n",age);
    System.out.printf("Happy %d to you\n",age);
    System.out.println("YAYY");
  }

  static boolean ageCheck(int age){
    if(age>18){
      return true;
    }
    else{
      return false;
    }
  }
}
