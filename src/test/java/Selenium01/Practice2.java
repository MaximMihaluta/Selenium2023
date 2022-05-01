package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Practice2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";
        if(actualTitle.contains(expectedTitle)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
