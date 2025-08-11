package project3;

//Student.java
import java.util.ArrayList;

public class Student extends Person implements Registrable {
 private ArrayList<Course> registeredCourses;

 public Student(String id, String name) {
     super(id, name);
     registeredCourses = new ArrayList<>();
 }

 @Override
 public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
     if (registeredCourses.contains(course)) {
         throw new CourseAlreadyRegisteredException("Student already registered in course: " + course.getCourseId());
     }
     registeredCourses.add(course);
     System.out.println("Registered to course: " + course.getCourseName());
 }

 @Override
 public void dropCourse(Course course) throws CourseNotFoundException {
     if (!registeredCourses.contains(course)) {
         throw new CourseNotFoundException("Student not registered in course: " + course.getCourseId());
     }
     registeredCourses.remove(course);
     System.out.println("Dropped course: " + course.getCourseName());
 }

 public ArrayList<Course> getRegisteredCourses() {
     return registeredCourses;
 }

 @Override
 public String toString() {
     return "Student: " + name + " (" + id + ")";
 }
}

