package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {
    public static void main(String[] args) {


        //        Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
//        2. Go to link https://ultimateqa.com/complicated-page
        driver.get(" https://ultimateqa.com/complicated-page");
        //        3. Enter any name in name field
        WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
        name.sendKeys("Max");
        //        4. Enter any email in email field
        WebElement email = driver.findElement(By.cssSelector("et_pb_contact_email_0"));
        email.sendKeys("max@gmail.com");
        //        5. Add any description (you can use lorem to generate text)
        WebElement comment = driver.findElement(By.xpath("//textarea[@placeholder=\"Message\"]"));
        comment.sendKeys("Lorem Ipum");
        //        6. Create a logic to pass captcha
        WebElement sum = driver.findElement(By.xpath("//input[@name=\"et_pb_contact_captcha_0\"]"));
        WebElement submit = driver.findElement(By.xpath("(//button[@name=\"et_builder_submit_button\"])[1]"));
        WebElement textValueOfCaptcha = driver.findElement(By.xpath("(//span[@class=\"et_pb_contact_captcha_question\"])[1]"));

        String numbers = textValueOfCaptcha.getText();
        int plusSign = numbers.indexOf("+");

        String numOne = numbers.substring(0,plusSign-1);
        String numTwo = numbers.substring(plusSign+2);

        int one = Integer.valueOf(numOne);
        int two = Integer.valueOf(numTwo);
        int total = one + two;
        sum.sendKeys(String.valueOf(total));
        submit.click();










    }
}
