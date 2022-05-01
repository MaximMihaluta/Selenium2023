package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwork3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        driver.findElement(By.id("email")).sendKeys("maxaimka8383@gmail.com");
        driver.findElement(By.id("form_submit")).sendKeys(Keys.ENTER);

        if( driver.findElement(By.tagName("h1")).getText().equals("Internal Server Error")){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }
        driver.close();
    }
}
