package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup(); //creates connection

        WebDriver driver = new ChromeDriver(); //create instance of chrome

        driver.manage().window().maximize();

        driver.get("https://www.google.com/"); // it will navigate to google


        System.out.println(driver.getTitle());

       // Thread.sleep(5000);

        driver.navigate().back();
        // Thread.sleep(5000);
        driver.navigate().forward();

      //  driver.close();


        System.out.println(driver.getCurrentUrl());







    }
}
