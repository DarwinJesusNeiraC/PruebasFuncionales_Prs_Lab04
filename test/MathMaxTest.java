/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MathMaxTest {

    @Test
    public void testZeroInputs() {
        Assert.assertEquals(0, Math.max(0, 0));
        Assert.assertEquals(10, Math.max(10, 0));
        Assert.assertEquals(0, Math.max(-5, 0));
        Assert.assertEquals(Integer.MAX_VALUE, Math.max(Integer.MAX_VALUE, 0));
        Assert.assertEquals(0, Math.max(Integer.MIN_VALUE, 0));
        Assert.assertEquals(Integer.MAX_VALUE, Math.max(0, Integer.MAX_VALUE));
        Assert.assertEquals(0, Math.max(0, Integer.MIN_VALUE));
        Assert.assertEquals(10, Math.max(0, 10));
        Assert.assertEquals(10, Math.max(10, 10));
        Assert.assertEquals(-5, Math.max(-5, -10));
    }

    @Test
    public void testPositiveInputs() {
        Assert.assertEquals(1000, Math.max(1000, 500));
        Assert.assertEquals(-500, Math.max(-1000, -500));
        Assert.assertEquals(1000, Math.max(0, 1000));
        Assert.assertEquals(0, Math.max(0, -1000));
        Assert.assertEquals(Integer.MAX_VALUE, Math.max(Integer.MAX_VALUE, 1000));
        Assert.assertNotEquals(Integer.MIN_VALUE, Math.max(Integer.MIN_VALUE, -1000));
        Assert.assertEquals(100, Math.max(0, 100));
        Assert.assertEquals(100, Math.max(100, 100));
        Assert.assertEquals(-50, Math.max(-50, -100));
        Assert.assertEquals(1000000, Math.max(1000000, 500000));
    }

    @Test
    public void testNegativeInputs() {
        Assert.assertEquals(-500000, Math.max(-1000000, -500000));
        Assert.assertEquals(1000000, Math.max(0, 1000000));
        Assert.assertEquals(0, Math.max(0, -1000000));
        Assert.assertEquals(Integer.MAX_VALUE, Math.max(Integer.MAX_VALUE, 1000000));
        Assert.assertEquals(-1000000, Math.max(Integer.MIN_VALUE, -1000000));
        Assert.assertEquals(500000, Math.max(0, 500000));
        Assert.assertEquals(500000, Math.max(500000, 500000));
        Assert.assertEquals(-500000, Math.max(-1000000, -500000));
        Assert.assertEquals(5000, Math.max(0, 5000));
        Assert.assertEquals(-5000, Math.max(-10000, -5000));
    }

    @Test
    public void testMixedInputs() {
        Assert.assertEquals(5000, Math.max(0, 5000));
        Assert.assertEquals(0, Math.max(0, -10000));
        Assert.assertEquals(Integer.MAX_VALUE, Math.max(Integer.MAX_VALUE, 5000));
        Assert.assertEquals(-10000, Math.max(Integer.MIN_VALUE, -10000));
        Assert.assertEquals(100, Math.max(100, 0));
        Assert.assertEquals(0, Math.max(-100, 0));
    }
}
