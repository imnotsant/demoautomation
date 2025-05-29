import java.lang.annotation.ElementType;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

public static void main(String[] args) {
    

      WebDriver driver = new ChromeDriver();

        // //div[@id='msdd']
        // //a[normalize-space()='Arabic']

        driver.get("https://demo.automationtesting.in/Register.html");
        
        driver.manage().window().maximize();

        // implicit wait
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='msdd']")));
        driver.findElement(By.xpath("//div[@id='msdd']")).click();

        WebDriverWait myDriverWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        myDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Arabic']")));
        driver.findElement(By.xpath("//a[normalize-space()='Arabic']")).click();
        

        //Fluent Wait

        Wait<WebDriver> myfluentwait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(5))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);

        //skills dd xp = //select[@id='Skills']
        // skills option xpath = 

        WebElement DD = myfluentwait.until(new Function<WebDriver,WebElement>() {

          public WebElement apply(WebDriver driver)
          {
            return driver.findElement(By.xpath("//select[@id='Skills']"));
          }          
        });

        DD.click();
        DD.sendKeys("C");






    }

}


