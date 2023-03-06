package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //go to amazon
        driver.get("https://www.amazon.com/");
        //get all the links
        List<WebElement> tags= driver.findElements(By.tagName("a"));
  // in order to print we need to iterate
  for(WebElement tag:tags)  {
      String links=tag.getAttribute("href");
      System.out.println(links);

  }
    }
}
