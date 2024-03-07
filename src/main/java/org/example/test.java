package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test {
    @Parameters("browser")
    @BeforeTest
    public void beforeTest(String browser){
        System.out.println("Before Test");
        System.out.println(browser);

    }
    @Test
    public void Test(){
        System.out.println("Test");
    }
}
