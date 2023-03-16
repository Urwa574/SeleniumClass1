package HomeWorkClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// creating instance
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
       driver.findElement(By.xpath("//button[@id='checkbox']")).click();
       WebDriverWait wait=new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ch']")));
      WebElement click=driver.findElement(By.xpath("//input[@id='ch']"));
      if(click.isEnabled()){
          System.out.println("true");
      }




    }
}
