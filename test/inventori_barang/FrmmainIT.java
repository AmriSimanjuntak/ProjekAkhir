/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori_barang;

import java.awt.event.FocusEvent;
import java.awt.event.WindowEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amris
 */
public class FrmmainIT {
    
    public FrmmainIT() {
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
     * Test of windowActivated method, of class Frmmain.
     */
    @Test
    public void testWindowActivated() {
        System.out.println("windowActivated");
        WindowEvent e = null;
        Frmmain instance = new Frmmain();
        instance.windowActivated(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of windowDeactivated method, of class Frmmain.
     */
    @Test
    public void testWindowDeactivated() {
        System.out.println("windowDeactivated");
        WindowEvent e = null;
        Frmmain instance = new Frmmain();
        instance.windowDeactivated(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of focusGained method, of class Frmmain.
     */
    @Test
    public void testFocusGained() {
        System.out.println("focusGained");
        FocusEvent fe = null;
        Frmmain instance = new Frmmain();
        instance.focusGained(fe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of focusLost method, of class Frmmain.
     */
    @Test
    public void testFocusLost() {
        System.out.println("focusLost");
        FocusEvent fe = null;
        Frmmain instance = new Frmmain();
        instance.focusLost(fe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Frmmain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Frmmain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
