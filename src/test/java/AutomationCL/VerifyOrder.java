package AutomationCL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VerifyOrder {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        practice2.loginpractice2(driver);

        WebElement dateOfSusan = driver.findElement(By.xpath("//td[.=\"Susan McLaren\"]/following-sibling::td[3]"));
        WebElement dateOfSusan2 = driver.findElement(By.xpath("////td[.=\"Susan McLaren\"]/../td[5]"));

        String datte = "01/05/2010";
        if (datte.equals(dateOfSusan)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }



        driver.close();



    }
}
