package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToLocators {
    public static void main(String[] args) {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.findElement(By.linkText("About")).click();

        String atualtitle = driver.getTitle();
        String expectedTitle = "About";
        if(atualtitle.contains(expectedTitle)){
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAILED");
        }



    }
}
