package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class Base {

    /*
    This class is designed to be parent of all test classes and
    It has driver instance to be used by all child test classes
    Also, it has before and after setup and teardown tasks
     */

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}

