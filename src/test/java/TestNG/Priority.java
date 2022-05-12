package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 0)
    public void test1(){
        System.out.println("This is test1");
    }
    @Test(priority = 1,dependsOnMethods = "test3")
    public void test2(){
        System.out.println("This is test2");
    }
    @Ignore
    @Test (priority = 2)
    public void test3(){
        System.out.println("This is test3");
    }
}
