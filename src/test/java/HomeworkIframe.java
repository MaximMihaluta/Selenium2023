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

public class HomeworkIframe {
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
        WebElement iframe = driver.findElement((By.xpath("//iframe[@id=\"frame\"]")));
        driver.switchTo().frame(iframe);

        WebElement message = driver.findElement((By.xpath("//p[@class=\"sub-heading\"]")));
        Assert.assertTrue(message.isDisplayed());




        WebElement header = driver.findElement((By.xpath("//a[@id=\"nav-title\"]")));
        Assert.assertTrue(header.isDisplayed());



    }
}
