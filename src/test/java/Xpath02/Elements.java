package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Elements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

        List<WebElement> list =  driver.findElements(By.xpath("//body//a"));
        int expected = 19;
        int actual = list.size();
        System.out.println(actual);
        if(expected == actual){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }

        int count = 0;
        for(WebElement whatever : list){
            if (whatever.getText().isEmpty()){
                count++;
                continue;

            }
            System.out.println(whatever.getText());
        }

        System.out.println(count);

    }
}
