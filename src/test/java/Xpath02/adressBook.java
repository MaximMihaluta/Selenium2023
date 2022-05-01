package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

import static org.openqa.selenium.By.xpath;

public class adressBook {
    public static void main(String[] args) {
    //    Open a Chrome browser
      //  Go to http://a.testaddressbook.com/sign_in
      //  Enter email using random of element of array adding @gmail.com at the end
       // Enter a dummy password
      // Click on sign in button
       // Verify message dispalyed “Bad email or password.”

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        String [] email = {"tony","max","andrew","kamol"};
        String emailend = "@gmail.com";
        Random rand = new Random();
        int ran = rand.nextInt(email.length-1);

      WebElement login = driver.findElement(By.xpath("//input[@id=\"session_email\"]"));

       WebElement pas =  driver.findElement(By.xpath("//input[@id=\"session_password\"]"));

       WebElement signIn =  driver.findElement(By.xpath("//input[@data-test=\"submit\"]"));

       login.sendKeys(email[ran]+ emailend);
       pas.sendKeys("admin123");
       signIn.click();
       WebElement message = driver.findElement(By.xpath("//div[@data-test=\"notice\"]"));
       if(message.isDisplayed()){
           System.out.println("PASS");
       }else{
           System.out.println("FAILED");
       }

    }
}
