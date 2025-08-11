package project3;

//Main.java
public class Main {
 public static void main(String[] args) {
     RegistrationManager manager = new RegistrationManager();

     // Create courses
     Course math = new Course("C101", "Mathematics");
     Course physics = new Course("C102", "Physics");
     Course cs = new Course("C103", "Computer Science");

     manager.addCourse(math);
     manager.addCourse(physics);
     manager.addCourse(cs);

     // Create students
     Student revathi = new Student("S001", "Revathi");
     Student gude = new Student("S002", "Gude");

     manager.addStudent(revathi);
     manager.addStudent(gude);

     try {
         revathi.registerCourse(math);
         revathi.registerCourse(physics);
         // Trying to register again to the same course
         revathi.registerCourse(math); // Will throw exception
     } catch (CourseAlreadyRegisteredException e) {
         System.out.println("Error: " + e.getMessage());
     }

     try {
         revathi.dropCourse(cs); // Will throw exception
     } catch (CourseNotFoundException e) {
         System.out.println("Error: " + e.getMessage());
     }

     try {
         revathi.dropCourse(math); // Successful
     } catch (CourseNotFoundException e) {
         System.out.println("Error: " + e.getMessage());
     }

     System.out.println("Courses registered by Revathi:");
     for (Course c : revathi.getRegisteredCourses()) {
         System.out.println(c);
     }
 }
}

