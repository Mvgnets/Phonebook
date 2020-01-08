/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static phonebook.PhoneBook2.hMap;

/**
 *
 * @author EchoY
 */
public class PhoneBook2Test {
    
    public PhoneBook2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PhoneBook2.
     */
    @Test
    public void testMain() {
        System.out.println("Testing main");
        hMap = new HashMap<String, ContactInfo>();
        hMap.put("John Smith", new ContactInfo("John Smith", "01642 192846", "07714123456", "john.smith@gmail.com"));
        hMap.put("Jill Hash", new ContactInfo("Jill Hash", "01642 738564", "07836173456", "jill.hash@gmail.com"));
        int expSize = 2;
        int size = hMap.size();
        assertEquals(expSize, size);
    }
    
}
