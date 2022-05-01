package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBear {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String actualValue = driver.findElement(By.id("ctl00_MainContent_status")).getText();

        String expectedValue = "Invalid Login or Password.";

        if(actualValue.equals(expectedValue))
        {
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
    }
}
