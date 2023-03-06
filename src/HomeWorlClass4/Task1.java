package HomeWorlClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    //check if the check box  "click on this check box" is Selected
    //if no  Select the check box
    //check gain if the checkbox is Selected or not
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
      WebElement buttonCheck=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
       boolean check= buttonCheck.isSelected();
        System.out.println(check);
        if(!check){
            buttonCheck.click();
        }
        check=buttonCheck.isSelected();
        System.out.println("the status of selection is: "+check);

    }
}