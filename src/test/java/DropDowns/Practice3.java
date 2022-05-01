package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Practice3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement n1 = driver.findElement(By.xpath("(//select[@class=\"dropdown-menu-lists\"])[1]"));
        WebElement n2 = driver.findElement(By.xpath("(//select[@class=\"dropdown-menu-lists\"])[2]"));
        WebElement n3 = driver.findElement(By.xpath("(//select[@class=\"dropdown-menu-lists\"])[3]"));

        Select select1 = new Select(n1);
        select1.selectByVisibleText("Python");

        Select select2 = new Select(n2);
        select2.selectByIndex(1);

        Select select3 = new Select(n3);
        select3.selectByValue("javascript");

    }
}
