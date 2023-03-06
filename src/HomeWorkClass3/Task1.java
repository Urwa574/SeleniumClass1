package HomeWorkClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    //enter the message in the text box
    //click on show message
    //Enter value of a
    //Enter value of B
    //click on the button get total
    //also please print the value of the attribute type of the button GET TOTAL
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement username=driver.findElement(By.xpath("//input[@id='user-message']"));
        username.sendKeys("hello");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("79");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("984");
        WebElement total=driver.findElement(By.xpath("//button[@onclick='return total()']"));
        total.click();
      WebElement sum=driver.findElement(By.xpath("//span[@id='displayvalue']"));
      String type=total.getAttribute("type");
        System.out.println("Attribute type is "+type);
        System.out.println("Total value is "+sum.getText());

    }
}
