package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        //get the dropDown
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='multi-select']"));
        //use select class because this drop down has a select tag
        Select sel=new Select(dropDown);
        //set by Value
        sel.selectByValue("New Jersey");
        Thread.sleep(2000);
        //select by visible text
        sel.selectByVisibleText("Ohio");
       //to slow
        Thread.sleep(2000);
        //select by index
        sel.selectByIndex(0);
        //when it come multiSelect Drop Down we can also deselect
        sel.deselectByVisibleText("Ohio");
        sel.deselectByValue("New Jersey");
        System.out.println("the dropdown is multiple "+sel.isMultiple());
        driver.close();
    }
}
