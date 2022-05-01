package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("Gmail")).click();

        String actualtitle = driver.getTitle();
        String expected = "Gmail";
        if(actualtitle.contains(expected)){
            System.out.println("TEST PASS");
        }
        else{
            System.out.println("TEST FAILED");
        }


        driver.navigate().back();

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Google";
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        driver.navigate().forward();


        if(actualtitle.contains(expected)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }
}
