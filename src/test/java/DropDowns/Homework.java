package DropDowns;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Homework {
    public static void main(String[] args) {
//        Navigate to the link https://letcode.in/forms
//        2. Complete the form using random test data
//        3.Find the bugs* (optional)


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://letcode.in/forms");

        Faker faker = new Faker();

        WebElement firstName = driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"lasttname\"]"));
        WebElement emaill = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        WebElement countryNumber = driver.findElement(By.xpath(" (//select)[1]"));
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id=\"Phno\"]"));
        WebElement adress1 = driver.findElement(By.xpath("//input[@id=\"Addl1\"]"));
        WebElement adress2 = driver.findElement(By.xpath("//input[@id=\"Addl2\"]"));
        WebElement state = driver.findElement(By.xpath("//input[@id=\"state\"]"));
        WebElement postalCode = driver.findElement(By.xpath("//input[@id=\"postalcode\"]"));
        WebElement country = driver.findElement(By.xpath("(//select)[2]"));
        WebElement birth = driver.findElement(By.xpath("//input[@id=\"Date\"]"));
        WebElement gender = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
        WebElement agree = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
        WebElement sbbnt = driver.findElement(By.xpath("//input[@type=\"submit\"]"));

        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        emaill.sendKeys(faker.internet().emailAddress());
        Select select = new Select(countryNumber);
        select.selectByIndex(1);
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        adress1.sendKeys(faker.address().fullAddress());
        adress2.sendKeys(faker.address().secondaryAddress());
        state.sendKeys(faker.address().state());
        postalCode.sendKeys(faker.address().country());
        Select select1 = new Select(country);
        select1.selectByVisibleText("Albania");
        birth.sendKeys("05/05/1999");
        gender.click();
        agree.click();
        sbbnt.click();

        driver.close();








    }
}
