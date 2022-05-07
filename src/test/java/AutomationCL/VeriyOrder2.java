package AutomationCL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VeriyOrder2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        practice2.loginpractice2(driver);

    }
    public static void printCity(WebDriver driver) {
        List<WebElement> allnames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));
        List<WebElement> allcity = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[7]"));

        for(int i = 0; i<allnames.size(); i++){
            System.out.println(allnames.get(i).getText()+ " lives " + allcity.get(i).getText());
        }

    }
    }
