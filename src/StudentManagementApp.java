import java.util.*;  // Import all utility classes (ArrayList, Scanner, etc.)

public class StudentManagementApp {   // Main class for the app
  private static ArrayList<Student> students = new ArrayList<>(); // List to store Student objects
  private static Scanner scanner = new Scanner(System.in);        // Scanner for user input

  public static void main(String[] args) {    // Entry point of the program
    while (true) {                            // Infinite loop for menu system
      System.out.println("\n--- Student Management App ---"); // Display menu
      System.out.println("1. Add Student");
      System.out.println("2. View Students");
      System.out.println("3. Search Student by ID");
      System.out.println("4. Update Student");
      System.out.println("5. Exit");
      System.out.print("Choose an option: "); // Prompt for user choice

      try {
        int choice = Integer.parseInt(scanner.nextLine()); // Read user choice as integer

        // Switch expression for menu handling
        switch (choice) {
          case 1 -> addStudent();      // Option 1 → Add a new student
          case 2 -> viewStudents();    // Option 2 → View all students
          case 3 -> searchStudent();   // Option 3 → Search student by ID
          case 4 -> updateStudent();   // Option 4 → Update student details
          case 5 -> {
            System.out.println("👋 You have exited the system. Goodbye!");
            System.exit(0);
          }   // Option 5 → Exit program
          default -> System.out.println("Invalid choice! Try again."); // Invalid input
        }
      } catch (NumberFormatException e) {   // Handle wrong input (letters instead of numbers)
        System.out.println("❌ Invalid input. Please enter a number.");
      }
    }
  }

  // Method to add a new student
  private static void addStudent() {
    try {
      System.out.print("Enter ID: ");
      int id = Integer.parseInt(scanner.nextLine());   // Read student ID
      System.out.print("Enter Name: ");
      String name = scanner.nextLine();                // Read student name
      System.out.print("Enter Age: ");
      int age = Integer.parseInt(scanner.nextLine());  // Read student age
      System.out.print("Enter Grade: ");
      String grade = scanner.nextLine();               // Read student grade

      students.add(new Student(id, name, age, grade)); // Create Student object and add to list
      System.out.println("✅ Student added successfully!");
    } catch (NumberFormatException e) { // Handle invalid ID/age input
      System.out.println("❌ Age/ID must be a number!");
    }
  }

  // Method to view all students
  private static void viewStudents() {
    if (students.isEmpty()) {                       // Check if list is empty
      System.out.println("No students yet!");
    } else {
      for (Student s : students) {                  // Loop through list
        System.out.println(s);                      // Print each student (calls toString())
      }
    }
  }

  // Method to search a student by ID
  private static void searchStudent() {
    System.out.print("Enter ID to search: ");
    try {
      int id = Integer.parseInt(scanner.nextLine());  // Read ID
      for (Student s : students) {                    // Loop through student list
        if (s.getId() == id) {                        // If ID matches
          System.out.println("✅ Found: " + s);       // Print student details
          return;                                     // Exit method after finding
        }
      }
      System.out.println("❌ Student not found!");    // If not found
    } catch (NumberFormatException e) {               // Handle invalid input
      System.out.println("❌ Invalid ID format!");
    }
  }

  // Method to update an existing student
  private static void updateStudent() {
    System.out.print("Enter ID to update: ");
    try {
      int id = Integer.parseInt(scanner.nextLine());  // Read ID
      for (Student s : students) {                    // Loop through students
        if (s.getId() == id) {                        // If ID matches
          System.out.print("Enter new name: ");
          s.setName(scanner.nextLine());              // Update name
          System.out.print("Enter new age: ");
          s.setAge(Integer.parseInt(scanner.nextLine())); // Update age
          System.out.print("Enter new grade: ");
          s.setGrade(scanner.nextLine());             // Update grade
          System.out.println("✅ Student updated!");
          return;                                     // Exit after updating
        }
      }
      System.out.println("❌ Student not found!");    // If no student matches the ID
    } catch (NumberFormatException e) {               // Handle invalid input (e.g., letters for age)
      System.out.println("❌ Invalid input!");
    }
    scanner.close();
  }
}
