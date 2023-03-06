package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// creating instance
        //opening up the website
        driver.get("https://www.amazon.com/");
        //maximize the screen its a good practice
        driver.manage().window().maximize();
        //print all the links in the amazon .com
        driver.findElements(By.id("a"));

    }
}
