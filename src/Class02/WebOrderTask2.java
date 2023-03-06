package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// creating instance
        //opening up the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize the screen its a good practice
        driver.manage().window().maximize();
        //        verify that the title is "Web Orders"
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
        // send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
// click on the login button
        driver.findElement(By.className("button")).click();
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("the title is correct");
        } else {
            System.out.println("the title is incorrect");
        }

//        logout
        driver.findElement(By.linkText("Logout")).click();

//        close the browser
        driver.quit();
    }}
