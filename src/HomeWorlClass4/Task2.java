package HomeWorlClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    //1. u need to write down the code that can select  1 check box out of 4 mentioned,
    //e.g option1 , option2 , option 3, option 4
    //Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
       List<WebElement>checkbox= driver.findElements(By.cssSelector("input[class='cb1-element']"));//can work with xpath too
        for (WebElement checkButton : checkbox) {
         String option=checkButton.getAttribute("value");
         if(option.equalsIgnoreCase("Option-4")){
             checkButton.click();
         }
        }
        Thread.sleep(2000);
      driver.quit();
    }
}
