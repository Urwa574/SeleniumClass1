package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();// creating instance
        //opening up facebook
        driver.get("https://www.facebook.com/");
        //send in the username
        driver.findElement(By.id("email")).sendKeys("Urwa");
        //If an attribute value has a number in it, use another locator b/c it could change(dynamic)**
        // send the password
        driver.findElement(By.name("pass")).sendKeys("mnscjhnc");
        //click on create new account
       // driver.findElement(By.linkText("Create new account")).click();
       //click on forgotten password
        driver.findElement(By.partialLinkText( "password?")).click();
        //"LinkedText" is used to locate web elements based on the exact text of a hyperlink vs "PartialLinkText"
        // is used to locate web elements based on a partial match of the text of a hyperlink.
        driver.quit();


    }
}
