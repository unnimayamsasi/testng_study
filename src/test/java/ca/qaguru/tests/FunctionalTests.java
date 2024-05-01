package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.*;

public class FunctionalTests extends TestBase {
    @BeforeClass
    public void beforeClass(){

        System.out.println("BeforeClass in FunctionalTests");
    }
    @AfterClass
    public void afterClass(){

        System.out.println("AfterClass in FunctionalTests");
    }
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("BeforeMethod in FunctionalTests");
    }
    @AfterMethod
    public void afterMethod(){

        System.out.println("AfterMethod in FunctionalTests");
    }

    @Test
    public void funcTest1(){
        System.out.println("funcTest1");
        log(Status.PASS,"funcTest1");

    }
    @Test
    public void funcTest2(){
        log(Status.INFO,"funcTest2 started");
        System.out.println("funcTest2");
        log(Status.INFO,"funcTest2 ended");
        Assert.assertEquals(10,10,"Numbers dont match");
    }
}
