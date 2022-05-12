package TestNG;

import AutomationCL.SmartBear;
import AutomationCL.practice2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static AutomationCL.practice2.loginpractice2;

public class Practice12 {

    WebDriver driver;



    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void deleteAllTest(){
        SmartBear.loginToSmartBear(driver);
        WebElement chkBtt = driver.findElement(By.xpath("//a[@id=\"ctl00_MainContent_btnCheckAll\"]"));
        chkBtt.click();
        WebElement dlt = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_btnDelete\"]"));
        dlt.click();
        WebElement ms = driver.findElement(By.xpath("//div[@id=\"ctl00_MainContent_orderMessage\"]"));

        Assert.assertTrue(ms.isDisplayed());




    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }



}
