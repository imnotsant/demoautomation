import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

    public static void main(String[] args) {
        
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.automationtesting.in/Register.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        // Select dropdown
        // Bootstrap dropdown
        // Hidden dropdown

        WebElement Ddn = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select skill = new Select(Ddn);
        //skill.selectByVisibleText("C");
        //skill.selectByIndex(3);
        //skill.selectByValue("Analytics");


        // Capture the options from Dropdown

        List<WebElement>options = skill.getOptions();
        System.out.println(options.size());

        //Print the options from Dropdown

        for (int i=0;i<options.size();i++)
        {
            System.out.println(options.get(i).getText());

        }

        // enhanced for loop

        for(WebElement op : options)
        {
            System.out.println(op.getText());
        }
        
        
        // Select Country
        driver.findElement(By.xpath("//span[@role='presentation']")).click();
        WebElement CDrpdwmn = driver.findElement(By.xpath("//li[contains(text(),'Australia')]"));
        CDrpdwmn.click();
        //Select country = new Select(CDrpdwmn);
        //country.selectByVisibleText("Australia");
        //country.selectByValue("3");


        //CDrpdwmn.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        





    }

}
