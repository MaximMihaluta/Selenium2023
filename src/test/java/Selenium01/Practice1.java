package Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {


        //open browser
        // go to google
        //verify title : is google

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("The Title test pass");
        }else{
            System.out.println("The Title test failed");
        }





        //open browser
        // go to technova
        // verify url contains : technova
        // verify title expected : TechNova School

        WebDriver dr = new ChromeDriver();
        dr.get("https://www.technovaschool.com/");

        String actualUrl = driver.getCurrentUrl();
        String expected = "TechNovaSchool";

        if(actualUrl.contains(expected)){
            System.out.println("Second test PaSS");
        }else{
            System.out.println("Second Test FAILED");
        }

        String actualTitleSchool = driver.getTitle();
        String expectedSchool = "It School online";
                if(actualTitleSchool.equals(expectedSchool)){
                    System.out.println("Thrid test Pass");
                }else{
                    System.out.println("Third test FAILed");
                }




    }
}
