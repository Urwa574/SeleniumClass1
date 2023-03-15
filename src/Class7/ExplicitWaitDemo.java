package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// creating instance
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        //click on the start button
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        //as the element that contains text becomes visible after some time, so first we need to implement the explicit wait and then get the text
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
//        once the element is visivle then get the text

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText = text.getText();
        System.out.println(WelcomeText);

    }
}