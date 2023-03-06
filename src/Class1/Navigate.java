package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://www.google.com/");
        //slow down
        Thread.sleep(2000);
        //now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //go back is the method of navigate
        driver.navigate().back(); // we can only do this with driver.navigate
      // go to facebook
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh(); // refreshing the page
        driver.close();// close the current tab
    }
}
