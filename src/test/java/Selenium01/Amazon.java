package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327672&hvpos=&hvnetw=g&hvrand=14398830315018736703&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1013008&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845445&gclid=CjwKCAjwu_mSBhAYEiwA5BBmf4hn7xwd-xE8NDMNhcYibnmZomP889J9tG0HgsmaWP0wniA2bw-RghoCE90QAvD_BwE");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch" + Keys.ENTER);

       String m1= driver.getTitle();
       String m2 = "watch";
       if(m1.contains(m2)){
           System.out.println("PASS");
       }else{
           System.out.println("FAILED");
       }
    }
}
