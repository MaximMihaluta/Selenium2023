package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwork4 {
    public static void main(String[] args) {

    //    Go to http://a.testaddressbook.com/sign_in

        //    Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //    Go to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //    array = ['a', 'b']
        //    Enter email using random of element of array adding @gmail.com at the end
        String email[] = {"qwert","@gmail",".com"};
        for(String name : email) {
            System.out.println(name);
        }
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("qwert@gmail.com");
        //    Enter a dummy password
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
        //    Click on sign in button
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        //    Verify message dispalyed “Bad email or password.”
        boolean mmm = driver.findElement(By.xpath("//div[@class=\"alert alert-notice\"]")).isDisplayed();
        if(mmm){
            System.out.println("PASS");
        }else{
            System.out.println("Failed");
        }



    }
}
