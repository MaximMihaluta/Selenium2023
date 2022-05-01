package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }



        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

    }
}
