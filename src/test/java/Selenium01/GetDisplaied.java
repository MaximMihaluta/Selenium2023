package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDisplaied {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement linkElement = driver.findElement(By.partialLinkText("Forgot"));

       String actual = linkElement.getAttribute("href");

       String expected = "forgot-password";
        if (actual.contains(expected)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }

        linkElement.click();
        boolean header = driver.findElement(By.tagName("h3")).isDisplayed();

        if(header){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
    }
}
