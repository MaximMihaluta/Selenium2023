package TestNG;

import AutomationCL.SmartBear;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework3 {
//    Task 3 — Create a method called removeName()
//    Accept two parameters: Webdriver, String name
//    Method will remove the given name from the list of SmartBear
//    Create a new TestNG test, and call your method
//    Assert that your method removed the given name

    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void removeName(String name,WebDriver driver) {
        WebElement nameToDelete = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='\" +name +\"']/../td[1]\"));\n"));
        nameToDelete.click();
        WebElement dltbt = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_btnDelete\"]"));
        dltbt.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));

        for (WebElement names : allNames) {
            Assert.assertFalse(names.getText().equals(name));

        }
    }
    @Test
                public void deleteName(){
            SmartBear.loginToSmartBear(driver);
            removeName("Samuel Clemens",driver);
        }





}
