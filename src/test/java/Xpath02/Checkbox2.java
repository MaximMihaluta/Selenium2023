package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox2 {
    public static void main(String[] args) {
//        Open a Chrome browser
//
//
//
//        Go to https://www.rahulshettyacademy.com/AutomationPractice/
//
//        under ---Checkbox Example
//
//        Select all 3 options (one by one)
//
//        Verify all 3 option are selected
//
//        Unselect second option
//
//        Verify second option is not selected anymore
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/ ");
        WebElement c1 = driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]"));
        WebElement c2 = driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]"));
        WebElement c3 = driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]"));
        c1.click();
        c2.click();
        c3.click();
        if(c1.isSelected()){
            System.out.println("PASS 1");
        }else {
            System.out.println("FAILED 1");
        }
        if(c2.isSelected()){
            System.out.println("PASS 2");
        }else {
            System.out.println("FAILED 2");
        }
        if(c3.isSelected()){
            System.out.println("PASS 3");
        }else {
            System.out.println("FAILED 3");
        }
        c1.click();
        c2.click();
        c3.click();
        if(!c1.isSelected()){
            System.out.println("PASS 11");
        }else {
            System.out.println("FAILED 11");
        }
        if(!c2.isSelected()){
            System.out.println("PASS 22");
        }else {
            System.out.println("FAILED 22");
        }
        if(!c3.isSelected()){
            System.out.println("PASS 33");
        }else {
            System.out.println("FAILED 33");
        }
        driver.close();






    }
}
