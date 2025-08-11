package Collections;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();

        // Create and add customers
        Customer c1 = new Customer("C002", "Reva", "9876543210", "Hyderabad");
        Customer c2 = new Customer("C004", "Revathi", "7894561230", "Chennai");
        Customer c3 = new Customer("C001", "Anjali", "9123456780", "Delhi");
        Customer c4 = new Customer("C005", "Lilly", "9988776655", "Mumbai");
        Customer c5 = new Customer("C003", "Janu", "7788990011", "Bangalore");

        // Update one customer using setter (example)
        //c1.setLocation("New Hyderabad");

        // Add customers to the list
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        // 1. Sort using Comparator
        //Collections.sort(list);

        System.out.println("Sorted Customer List:");
        Iterator<Customer> it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        // 2. Remove element at index 3
        if (list.size() > 3) {
            list.remove(3);
        }

        System.out.println("After Removing Index 3:");
        Iterator<Customer> it2 = list.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // 3. Search for customer with ID "C003"
        boolean found = false;
        Iterator<Customer> it3 = list.iterator();
        while (it3.hasNext()) {
            Customer c = it3.next();
            if (c.getId().equalsIgnoreCase("C003")) {
                System.out.println("Customer "+c.getId()+" Found:");
                System.out.println("Name: " + c.getName());
                System.out.println("Location: " + c.getLocation());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer C003 not found.");
        }
    }


}
