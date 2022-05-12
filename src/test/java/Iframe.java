import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {

//    Create a new class called IframePractice
//
//            Create new test and create setUps
//
//    Go to https://the-internet.herokuapp.com/iframe
//
//    Assert : “Your content goes here. “Text is displayed”
//
//    Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
//
WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void openlink(){
        driver.get(" https://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void iframe(){
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id=\"mce_0_ifr\"]"));
        driver.switchTo().frame(iframe);


        WebElement pargraph = driver.findElement(By.xpath("//p"));
        System.out.println(pargraph.getText());

        Assert.assertTrue(pargraph.isDisplayed());

        driver.switchTo().parentFrame();

        WebElement headert = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headert.isDisplayed());




    }



 }
