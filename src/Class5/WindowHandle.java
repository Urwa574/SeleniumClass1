package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?elo=1&ifkv=AWnogHcKUHSMlV11WH-xPtQnrNen99uqcwbTuGBw59PLONV-S5CkQNrb2028iBMwiB0lyAOChi65&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       //click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        //click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
       //get the window handle of the parent window
       String parentWindowHandle= driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        //get window handles of all the windows that have been opened up
        Set<String> windowHandles=driver.getWindowHandles();
        //        print all the window handles
        for(String wh:windowHandles){
//           switch the focus of the driver to help window
            driver.switchTo().window(wh);
//            check the title of the window to which our focus is right now
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
//        to verify we switched to the right window;
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);


    }
}
