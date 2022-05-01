package JavaFaker;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Faker faker = new Faker();

        WebElement fn = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
        WebElement sn = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
        WebElement ph = driver.findElement(By.xpath("//input[@name=\"phone\"]"));

        fn.sendKeys(faker.name().firstName());
        sn.sendKeys(faker.name().lastName());
        ph.sendKeys(faker.phoneNumber().cellPhone());

        WebElement email = driver.findElement(By.xpath("//input[@name=\"userName\"]"));
        WebElement adddres = driver.findElement(By.xpath("//input[@name=\"address1\"]"));

        email.sendKeys(faker.internet().emailAddress());
        adddres.sendKeys(faker.address().fullAddress());


        WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
        WebElement statePr = driver.findElement(By.xpath("//input[@name=\"state\"]"));
        WebElement postalCode = driver.findElement(By.xpath("//input[@name=\"postalCode\"]"));

        city.sendKeys(faker.address().fullAddress());
        postalCode.sendKeys(faker.address().country());

        WebElement country = driver.findElement(By.xpath("//select"));
        Select select = new Select(country);
        select.selectByVisibleText("Albany");

        WebElement userName = driver.findElement(By.xpath("////input[@name=\"email\"]"));
        WebElement passsword = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        WebElement confirm = driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]"));
        WebElement subbtn = driver.findElement(By.xpath("//input[@name=\"submit\"]"));

        String pass = faker.internet().password();
        userName.sendKeys(faker.name().username());
        passsword.sendKeys(pass);
        confirm.sendKeys(pass);
        subbtn.click();





    }
}
