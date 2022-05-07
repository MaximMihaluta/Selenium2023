package AutomationCL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        practice2.loginpractice2(driver);




    }

    public static void verifyOrder(WebDriver driver, String login){
        List<WebElement> allnames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));

        for (WebElement names : allnames){
            if(names.getText().contains(login)){
                System.out.println("PASS");
                //break ; // break or exit the loop
                return; //stop and return the line
            }
        }
        System.out.println("Failed");
    }

}
