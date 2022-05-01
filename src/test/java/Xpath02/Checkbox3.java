package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox3 {
    public static void main(String[] args) {
//        Open chrome browser
//        2. Go to https://www.google.com
//        3. Get amount of total balance, credit available, due today
//        4. Add (sum_ all three amount
//        5. Print out the result
//        6.close the driver

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement tb = driver.findElement(By.xpath("(//div[@class=\"balance-value\"])[1]/span"));
        WebElement ca = driver.findElement(By.xpath("//div[@class=\"balance\"]/div[@class=\"balance-value\"]"));
        WebElement dt = driver.findElement(By.xpath("//div[@class=\"balance\"]/div[@class=\"balance-value danger\"]"));

        String numTwoStr = ca.getText().replace("$","");
        int numOne = Integer.valueOf(tb.getText().replace("$",""));
        int numTwo = Integer.valueOf(numTwoStr.replace(",",""));
        int numTree = Integer.valueOf(dt.getText().replace("$",""));

        int total = numOne + numTwo + numTree;
        System.out.println(total);




    }
}
