import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

    public static void main(String[] args) {
        

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.automationtesting.in/Register.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();
    }

}
