package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        //switch to iframe which contains the input box
        //method by index starts from 0
        driver.switchTo().frame(0);
        //this statement will shift the focus to the first frame
        WebElement textBox=driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("Urwa Waseem");//send keys
        //get the text click on from parent window
        driver.switchTo().defaultContent();
        //find the text //2nd method
        WebElement text=driver.findElement(By.xpath("//h3")); //we can also use tagName or xpath
        System.out.println("the text is "+text.getText());
      //      get the text enter name in iframe
        driver.switchTo().frame("iframe_a");
        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("the label is :  "+getLabel.getText());
         //switch focus to the main page
               driver.switchTo().defaultContent();
               //3rd method to an iframe using WebElement
        //        //clear what ever is written in the text page
             WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
                driver.switchTo().frame(frame1);
                textBox.clear(); //clear whatever you wrote in text box


    }
}