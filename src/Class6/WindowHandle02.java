package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle02 {
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
        //get the window handle of the parent(current) window
        String parentWindowHandle= driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        //get window handles of all the windows that have been opened up
        Set<String> windowHandles=driver.getWindowHandles();
        //print all window handles by the help of loop
        for (String handles:windowHandles){
          //switch the focus of the driver to help the window
            driver.switchTo().window(handles);
            //check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
      //to verify we switched to the right window
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindowHandle); // focus
        // move to parent window back
    }
}
