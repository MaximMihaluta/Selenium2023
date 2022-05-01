package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox {
//    1. Open a Chrome browser
//2. Go to https://the-internet.herokuapp.com/checkboxes
//            3. Verify Checkbox 2 is Checked
//4. Click on check-box 1
//            5. Verify CheckboxOne is Checked


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://the-internet.herokuapp.com/checkboxes");


        WebElement c1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        WebElement c2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
      if(c2.isSelected()){
          System.out.println("PASS");
      }else{
          System.out.println("FAILED");
      }

      c1.click();

      if (c1.isSelected()){
          System.out.println("TEST IS PASSED");
      }else {
          System.out.println("TEST is FAILED");
      }




    }
}
