package AutomationCL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class practice2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//
//
//        WebElement login = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$username\"]"));
//        WebElement password = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$password\"]"));
//        WebElement submitBtn = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$login_button\"]"));
//
//        login.sendKeys("tester");
//        password.sendKeys("tester");
//        submitBtn.click();

        loginpractice2(driver);
        List<WebElement>  list = driver.findElements(By.xpath("//body//a"));
        int count = list.size();
        System.out.println(count);
        for(WebElement links: list){
            System.out.println(links.getText());
        }


    }

    public static void loginpractice2(WebDriver driver){

        WebElement login = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$username\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$password\"]"));
        WebElement submitBtn = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$login_button\"]"));

        login.sendKeys("Tester");
        password.sendKeys("test");
        submitBtn.click();
    }


}
