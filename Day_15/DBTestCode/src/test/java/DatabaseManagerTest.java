package test.java;

import main.java.DatabaseManager;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseManagerTest {

    private DatabaseManager db;

    @BeforeEach
    public void setUp() throws SQLException {
        db = new DatabaseManager();
        db.connect();
    }

    @AfterEach
    public void tearDown() throws SQLException {
        db.closeConn();
    }

    @Test
    public void testInsertData() throws SQLException {
        int result = db.insertData(1, "Revathi");
        assertEquals(1, result); // 1 row inserted
    }

    @Test
    public void testUpdateData() throws SQLException {
        db.insertData(2, "Gude");
        int result = db.updateData(2, "GudeRevathit");
        assertEquals(1, result); // 1 row updated
    }

    @Test
    public void testDeleteData() throws SQLException {
        db.insertData(3, "Root");
        int result = db.deleteData(3);
        assertEquals(1, result); // 1 row deleted
    }
}


        