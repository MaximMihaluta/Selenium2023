package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice8 {
    public static void main(String[] args) {
//        ask #1 - Check all link on the page
//        Open Chrome browser
//        Go to https://www.technovaschool.com/
//        Count the number of the links on the web-page (expected 41)
//        Print out all the texts of the links on the page
//        Count the number of the links that doesn’t have text (expected 19)

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://www.technovaschool.com/");


        List<WebElement> lll = driver.findElements(By.xpath("//body//a"));
        int expected = 41;
        int actual = lll.size();

        if (expected == actual){
            System.out.println("Pass");
        }else{
            System.out.println("FAILED");
        }

        int count = 0;
        for(WebElement kkk: lll){
            System.out.println(kkk.getText());
            if(kkk.getText().isEmpty()){
                System.out.println(kkk.getText());
                count++;
                continue;
            }

        }
        System.out.println(count);

        if (count==19){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
    }

}
