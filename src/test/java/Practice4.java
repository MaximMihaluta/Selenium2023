import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("java book" + Keys.ENTER);

        driver.findElement(By.xpath("////input[@id=\"twotabsearchtextbox\"]")).sendKeys("watch"+Keys.ENTER);

        driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();


        driver.close();

    }

}
