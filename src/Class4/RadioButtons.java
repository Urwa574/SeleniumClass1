package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //click on the radio button Male
       WebElement maleBtn= driver.findElement(By.cssSelector("input[value='Male']"));
       //check if the radio button is enabled
       boolean isEnabaledButn= maleBtn.isEnabled();
        System.out.println("the radio button is enabled "+isEnabaledButn);
       boolean isDisplayed=maleBtn.isDisplayed();
        System.out.println("the radio button male is Displayed "+isDisplayed);
        boolean isSelectedmale=maleBtn.isSelected();
        System.out.println("the male button is selected "+isSelectedmale);
        //if the radio button is not selected click on it
        if(!isSelectedmale) {
            maleBtn.click();
        }
        //checking is radio button is selected after the click
        isSelectedmale=maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedmale);

    }
}