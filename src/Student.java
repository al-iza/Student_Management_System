public class Student {                  // Define the Student class
  private int id;                       // Private field to store student's ID
  private String name;                  // Private field to store student's name
  private int age;                      // Private field to store student's age
  private String grade;                 // Private field to store student's grade

  // Constructor
  public Student(int id, String name, int age, String grade) {   // Constructor to initialize student object
    this.id = id;                        // Assign parameter id to the object's id
    this.name = name;                    // Assign parameter name to the object's name
    this.age = age;                      // Assign parameter age to the object's age
    this.grade = grade;                  // Assign parameter grade to the object's grade
  }

  // Getters
  public int getId() {                  // Getter method for id
    return id;                          // Return the student's id
  }
  public String getName() {             // Getter method for name
    return name;                        // Return the student's name
  }
  public int getAge() {                 // Getter method for age
    return age;                         // Return the student's age
  }
  public String getGrade() {            // Getter method for grade
    return grade;                       // Return the student's grade
  }

  // Setters
  public void setName(String name) {    // Setter method for name
    this.name = name;                   // Update the student's name
  }
  public void setAge(int age) {         // Setter method for age
    this.age = age;                     // Update the student's age
  }
  public void setGrade(String grade) {  // Setter method for grade
    this.grade = grade;                 // Update the student's grade
  }

  // toString for printing
  @Override
  public String toString() {            // toString method to represent student object as a string
    return id + " - " + name + " (Age: " + age + ", Grade: " + grade + ")";
    // Return formatted student details
  }

  // equals() to compare students by ID
  @Override
  public boolean equals(Object obj) {   // Override equals method to compare students
    if (this == obj) return true;       // If both references point to the same object, return true
    if (!(obj instanceof Student)) return false;  // If obj is not a Student, return false
    Student s = (Student) obj;          // Typecast obj to Student
    return this.id == s.id;             // Compare students by their ID
  }
}
