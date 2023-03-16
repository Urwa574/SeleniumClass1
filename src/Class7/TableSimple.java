package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// creating instance
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //task 1 access level 1-- table based access
        //        get the whole table accessed and print it on the console
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data = table.getText();
      //  System.out.println(table_data);
        //task2 row level access
        //get the row from the table and print them
       List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       //print the rows
        for (WebElement row : rows) {
            //extract text from each row
            String row_text=row.getText();//modification print the row that contains company google
            if(row_text.contains("Google")){
          //  System.out.println(row_text);
        }}
        //task3: column level access
        //td= table data--- tr=table row /tbody=table body
        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column : columns) {
         //   System.out.println(column.getText());
        }
        //task4: just print the first column of every row
        List<WebElement> Fcolumns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement Fcolumn : columns) {
            System.out.println(Fcolumn.getText());
        }
        //task5:get the 3rd row
        List<WebElement> thirdRow=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
        for (WebElement webElement : thirdRow) {
            System.out.println(webElement.getText());
        }
    }
}
