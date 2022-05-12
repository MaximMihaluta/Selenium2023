package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PracticeClass {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void openlink(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @Test
    public void informativeAlert(){
        WebElement clickJSalert = driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]"));
        clickJSalert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement message = driver.findElement(By.xpath("//p[@id=\"result\"]"));

        String expected = "You successfully clicked an alert";
        Assert.assertEquals(message.getText(),expected);
    }

    @Test
    public void informativeAlert2(){
        WebElement clickJSconfirm = driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]"));
        clickJSconfirm.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        WebElement message2= driver.findElement(By.xpath("//p[@id=\"result\"]"));

        String expected2 = "You clicked: Ok";
        Assert.assertEquals(message2.getText(),expected2);

    }
    @Test
    public void informativeAlert3(){
        String myText = "Maxim";

        WebElement clickJSpromt = driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]"));
        clickJSpromt.click();
        Alert alert3= driver.switchTo().alert();
        alert3.sendKeys(myText);
        alert3.accept();
        WebElement message3 = driver.findElement(By.xpath("//p[@id=\"result\"]"));

        Assert.assertTrue(message3.getText().contains(myText));


    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }





}
