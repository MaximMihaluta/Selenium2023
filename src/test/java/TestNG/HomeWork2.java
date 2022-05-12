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

import java.util.concurrent.TimeUnit;

public class HomeWork2 {
 //   Task 2 — Edit order
//    Open browser and login to SmartBear
//    Click too edit button from the right for “Steve Johns”
//    Change the name to “ your favorite actor/ sport star”
//    Click Update

    WebDriver driver;

    @BeforeClass
            public void setup(){
      WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
}
    @Test
    public void change(){
        SmartBear.loginToSmartBear(driver);
        WebElement edbt = driver.findElement(By.xpath("(//input[@src=\"App_Themes/Default/images/button_edit.gif\"])[2]"));
        edbt.click();
        WebElement nm = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$txtName\"]"));
        nm.clear();
        nm.sendKeys("David Backham");

        WebElement upt = driver.findElement(By.xpath("//a[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]"));
        upt.click();

        WebElement nm1 = driver.findElement(By.xpath("(//td[following-sibling::td=\"ScreenSaver\"])[4]"));

        Assert.assertTrue(nm1.isDisplayed());
    }
    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
