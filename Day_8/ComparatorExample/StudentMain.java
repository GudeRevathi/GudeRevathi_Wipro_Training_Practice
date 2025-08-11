package ComparatorExample;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Student> list = new ArrayList<>();
        list.add(new Student("Garry",21));
        list.add(new Student("Binny",26));
        list.add(new Student("Fenny",22));
        //SortByAge
        System.out.println("Before sorting: The age of the Students");
        for(Student sage:list) {
            System.out.println(sage.getAge());
        }
        System.out.println("After sorting: The age of the Students");
        Collections.sort(list,new AgeComparator());
        for(Student sage:list) {
            System.out.println(sage.getAge());
        }
        //SortByName
        System.out.println("Before sorting: The name of the Students");
        for(Student name:list) {
            System.out.println(name.getName());
        }
        System.out.println("After sorting: The name of the Students");
        Collections.sort(list, new NameComparator());
        for(Student name:list) {
            System.out.println(name.getName());
        }
        //Second Approach
        //Using Anonymous class
        System.out.println("After sorting: The age of the Students...");
        Collections.sort(list,new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }});
        for(Student sage:list) {
            System.out.println(sage.getAge());
        }

        System.out.println("After sorting: The Name of the Students...");
        Collections.sort(list,new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }});
        for(Student sage:list) {
            System.out.println(sage.getName());
        }

        //Third Approach
        //Using Lambda Expression
        list.sort((s1,s2)->Integer.compare(s1.getAge(),s2.getAge()));
        // To iterate the elements of the ArrayList
        list.forEach(System.out::println);


        list.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
        list.forEach(System.out::println);
    }

}