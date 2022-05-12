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

public class HomeWork {

//
//    Task 1 —Delete Order
//    Open browser and Login to smartBear
//    Delete”Mark Smith” from the list
//    Assert it is deleted from the list
//    Task 2 — Edit order
//    Open browser and login to SmartBear
//    Click too edit button from the right for “Steve Johns”
//    Change the name to “ your favorite actor/ sport star”
//    Click Update
//    Assert “your actor name” is in the list
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
    public void deleteOrder (){
        SmartBear.loginToSmartBear(driver);
        String givenName = " Mark Smith ";
        WebElement checkBox = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='" +givenName +"']/../td[1]"));

        checkBox.click();

      //  WebElement chbt = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_orderGrid_ctl03_OrderSelector\"]"));
      //  chbt.click();

        WebElement dltbt = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_btnDelete\"]"));
        dltbt.click();

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));

        for(WebElement names: allNames){
            Assert.assertFalse(names.isDisplayed());

        }


    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }



}
