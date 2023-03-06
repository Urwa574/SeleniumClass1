package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass25Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// creating instance
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("urwa");
        driver.findElement(By.name("lastname")).sendKeys("waseem");
        driver.findElement(By.name("reg_email__")).sendKeys("03355617021");
        driver.findElement(By.id("password_step_input")).sendKeys("kfjkvg");
        driver.findElement(By.name("birthday_day")).sendKeys("13");
        driver.findElement(By.name("birthday_month")).sendKeys("oct");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
       // driver.navigate().back();
       driver.quit();


    }
}
