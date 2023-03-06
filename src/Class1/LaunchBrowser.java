package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    // tell the browser where the web-driver is located
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of webDriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        //get the title of the webpage
        String title= driver.getTitle();
        System.out.println("the title of the page is "+title);
        Thread.sleep(3000); // this works to slow down the closing down the web process which u going to open 3000 means 3sec
     driver.quit(); //close the browser

    }
}
