package Class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntax project.com
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //use switchTo
       Alert alert= driver.switchTo().alert();
       alert.accept();
       Thread.sleep(2000);
       //2nd by me
      driver.findElement(By.xpath("//button[contains(@onclick,'myConfirmFunction()')]")).click();
      alert.accept();
      Thread.sleep(2000);
       //3rd alert
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        //switch the focus to alert
        alert.sendKeys("aajhkdfj");
        Thread.sleep(2000);
        //accept it
        alert.accept();

    }
}
