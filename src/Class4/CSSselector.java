package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //go to fb
        driver.get("https://www.facebook.com");
       WebElement createNewBtn =driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
       createNewBtn.click();
       Thread.sleep(2000); //put a sleep so that the browser can open up the window which contains the element
 // first name
      WebElement firstName=  driver.findElement(By.cssSelector("input[name='firstname']"));
      firstName.sendKeys("urwa");
    }
}