package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwork2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Gift box" + Keys.ENTER);


        String m1 = driver.getTitle();
        String m2 = "Gift box";


        if(m1.equals(m2)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
    }
}
