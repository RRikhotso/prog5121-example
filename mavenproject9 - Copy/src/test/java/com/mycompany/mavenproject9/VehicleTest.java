/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Arcade Player
 */
public class VehicleTest {
    
    private static Vehicle vv;
    public VehicleTest() {
    }
    @BeforeAll
    public static void setUpTest()
    {
        vv = new Vehicle();
    }

    @Test
    public void testAdd()
    {
        //Vehicle vv = new Vehicle();
        
        int expected =  3;
        int actual;
        
        actual = vv.add(1,2);
        
        assertEquals(expected, actual);
    }
    
}
