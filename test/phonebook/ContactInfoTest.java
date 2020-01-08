/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EchoY
 */
public class ContactInfoTest {
    
    public ContactInfoTest() {
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
     * Test of getName method, of class ContactInfo.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        ContactInfo test = new ContactInfo("John Smith", "01642 192846", "07714123456", "john.smith@gmail.com");
        String name = "John Smith";
        String expName = test.getName();
        assertEquals(expName, name);
    }

    /**
     * Test of getLandlineNumber method, of class ContactInfo.
     */
    @Test
    public void testGetLandlineNumber() {
        System.out.println("Testing getLandlineNumber");
        ContactInfo test = new ContactInfo("John Smith", "01642 192846", "07714123456", "john.smith@gmail.com");
        String lNum = "01642 192846";
        String expLNum = test.getLandlineNumber();
        assertEquals(expLNum, lNum);
    }

    /**
     * Test of getMobileNumber method, of class ContactInfo.
     */
    @Test
    public void testGetMobileNumber() {
        System.out.println("Testing getMobileNumber");
        ContactInfo test = new ContactInfo("John Smith", "01642 192846", "07714123456", "john.smith@gmail.com");
        String mNum = "07714123456";
        String expMNum = test.getMobileNumber();
        assertEquals(expMNum, mNum);
    }

    /**
     * Test of getEmailAddress method, of class ContactInfo.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("Testing getMobileNumber");
        ContactInfo test = new ContactInfo("John Smith", "01642 192846", "07714123456", "john.smith@gmail.com");
        String email = "john.smith@gmail.com";
        String expEmail = test.getEmailAddress();
        assertEquals(expEmail, email);
    }
    
}
