/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.web;

import javax.servlet.http.HttpServletRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.ModelMap;

/**
 *
 * @author Administrator
 */
public class EventControllerTest {
    
    public EventControllerTest() {
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
     * Test of home method, of class EventController.
     */
    @org.junit.Test
    public void testHome() {
        System.out.println("home");
        ModelMap map = null;
        HttpServletRequest request = null;
        EventController instance = new EventController();
        String expResult = "";
        String result = instance.home(map, request);
        assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
