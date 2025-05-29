import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

    public static void main(String[] args) {
        

         
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.automationtesting.in/Register.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();

        // Hidden Dropdown

        
        
    }

}
