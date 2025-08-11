package project3;

//RegistrationManager.java
import java.util.ArrayList;

public class RegistrationManager {
 private ArrayList<Student> students;
 private ArrayList<Course> courses;

 public RegistrationManager() {
     students = new ArrayList<>();
     courses = new ArrayList<>();
 }

 public void addStudent(Student student) {
     students.add(student);
     System.out.println("Added student: " + student.getName());
 }

 public void addCourse(Course course) {
     courses.add(course);
     System.out.println("Added course: " + course.getCourseName());
 }

 public Student findStudentById(String id) {
     for (Student s : students) {
         if (s.getId().equals(id)) {
             return s;
         }
     }
     return null;
 }

 public Course findCourseById(String id) {
     for (Course c : courses) {
         if (c.getCourseId().equals(id)) {
             return c;
         }
     }
     return null;
 }
}

