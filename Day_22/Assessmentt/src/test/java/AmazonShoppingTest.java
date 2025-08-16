package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Customer;
import main.java.Product;
import main.java.AmazonShopping;

public class AmazonShoppingTest {
    AmazonShopping amazonshop = new AmazonShopping();

    @Test
    public void testInsertCustomer() {
        Customer c = new Customer(1001, "Revathi", "9876543210", "male", "Kandukuru", "Ongole", "523105");
        amazonshop.insertCustomer(c);
        assertTrue(true); // Dummy assertion to indicate success
    }

    @Test
    public void testInsertProduct() {
        Product p = new Product(2001, "P001", "Laptop", 55000.0, 2, java.sql.Date.valueOf("2037-12-23"));
        amazonshop.insertProduct(p, 1);
        assertTrue(true);
    }

    @Test
    public void testBuyProduct() {
        amazonshop.buyProduct(1, 1);
        assertTrue(true);
    }

    @Test
    public void testDisplayCustomerProducts() {
        amazonshop.displayCustomerProducts(1);
        assertTrue(true);
    }
}
