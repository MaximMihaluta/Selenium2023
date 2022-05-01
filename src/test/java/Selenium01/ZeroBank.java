package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.tagName("h3")).getText();

        if( driver.findElement(By.tagName("h3")).getText().equals("Log in to ZeroBank")){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }

        driver.close();
    }
}
