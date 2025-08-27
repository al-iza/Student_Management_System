public class day3 {
  public static void main(String[] args) {
    //printf() is a method used to format output
    //%[flags][width][.precision][specifier-character]

    //[flags]
    // + = output a plus
    //, = comma grouping separator
    // (= negative numbers are enclosed in ()
    // space = display a minus if negative , space if positive


    String name = "Spongebob";
    int age = 2;
    boolean gender = true;
    double height = 146.22;
    char firstLetter = 'S';
    double price= -10000.012;

    System.out.printf("Hello %s.Hope you are doing great", name);
    System.out.printf("\nYour name starts from letter %c",firstLetter);
    System.out.printf("\nGender: %b",gender);
    System.out.printf("\nHeight: %.2f cm",height);
    System.out.printf("\n%s is %d years old",name, age);
    System.out.printf("\n%+,.4f",price);
  }
}
