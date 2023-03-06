package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// creating instance
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Urwa");
        driver.findElement(By.id("customer.lastName")).sendKeys("Waseem");
       driver.findElement(By.id("customer.address.street")).sendKeys("jhjsg");
       driver.findElement(By.id("customer.address.city")).sendKeys("skjhj");
       driver.findElement(By.name("customer.address.state")).sendKeys("njnbc");
       driver.findElement(By.name("customer.address.zipCode")).sendKeys("1mdn");
       driver.findElement(By.id("customer.phoneNumber")).sendKeys("786498717");
       driver.findElement(By.id("customer.ssn")).sendKeys("hduugiuj");
       driver.findElement(By.id("customer.username")).sendKeys("urwawaseem");
       driver.findElement(By.id("customer.password")).sendKeys("bhcdhjcbd");
       driver.findElement(By.id("repeatedPassword")).sendKeys("njch");
       driver.findElement(By.className("button")).click();
       driver.quit();
    }
}
