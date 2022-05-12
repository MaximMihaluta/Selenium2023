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

import static org.testng.TestRunner.PriorityWeight.priority;

public class Homework2 {
//    Navigate to https://webdriveruniversity.com/Popup-Alerts/index.html
//            "Click Me" on JavaScript Alert
//"Click Me" on Modal Popup
//"CLICK ME!" JavaScript Confirm Box and dismiss alert
//    Assert that text "You pressed Cancel!" is displayed
    WebDriver driver;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void openlink() {
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
    }
    @Test(priority = 0)
    public void clickMe1() {
        WebElement javaScr = driver.findElement(By.xpath("(//p)[1]"));
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
    }
    @Test(priority = 1)
    public void clickMe2() {
        WebElement modalPopup = driver.findElement(By.xpath("(//p)[2]"));
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
    }
    @Test(priority = 2)
    public void clickMe3() {
        WebElement javaScrConfirmBox = driver.findElement(By.xpath("(//p)[4]"));
        Alert alert3 = driver.switchTo().alert();
        alert3.dismiss();
        WebElement message = driver.findElement(By.xpath("//p[@id=\"confirm-alert-text\"]"));
        String expected = "You pressed Cancel!";
        Assert.assertEquals(message.getText(), expected);
    }
    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
