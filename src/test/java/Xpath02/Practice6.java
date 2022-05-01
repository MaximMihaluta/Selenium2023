package Xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {
    public static void main(String[] args) {
       // Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //        2. Go to https://the-internet.herokuapp.com/add_remove_elements/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //        3. Click to “Add Element” button
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]"));
        addButton.click();
        //        4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class=\"added-manually\"]"));
        if(deleteButton.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
        //        5. Click to “Delete” button.
        deleteButton.click();
        //        6. Verify “Delete” button is NOT displayed after clicking.

        if (!deleteButton.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }







    }
}
