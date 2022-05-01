package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {
    public static void main(String[] args) {
      //  1. Open a chrome browser
      //  2. Go to https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC
      //  3. Enter any login
      //  4. Enter any password
      //  5. Verify total is equal 1692.67 (hint use getText())


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");

        WebElement login = driver.findElement(By.xpath("//input[@class=\"input\"]"));
        WebElement pass =  driver.findElement(By.xpath("//input[@type=\"password\"]"));

        WebElement signButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));

        login.sendKeys("admin");
        pass.sendKeys("admin123");
        signButton.click();

        WebElement message = driver.findElement(By.xpath("//p[@class=\"error\"]"));

        if(message.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }












    }
}
