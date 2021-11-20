package org.vapasi;


import org.testng.annotations.*;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @BeforeTest
    public void doOnceForAllTests(){
        System.out.println("Before Test is called");
    }

    @BeforeClass
    public void doPerClass() {
        System.out.println("Before Class is called");
    }
    @BeforeMethod
    public void setup() {
        System.out.println("Before Method is called");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("After Method is called");
    }

    @Test
    public void test1()
    {
        System.out.println("Printed first test in console");
        int result = sumOf(2,3);
        Assert.assertEquals(result,5);
        Assert.assertTrue(result==6, "sum doesn't match 6");
        Assert.assertFalse(result==5, "sum is 5");
    }

    private int sumOf(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }

    @Test
    public void test2() {
        System.out.println("Printed second test in console");
    }
}
