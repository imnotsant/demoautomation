import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation {

public static void main(String[] args) {
        
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.automationtesting.in/Register.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        // Input Name

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Santosh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Santosh");

        //Input Address

        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Bangalore");
	
        // Input email
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");


        // Input phone
        driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//child::input[@type='tel']")).sendKeys("0987654321");
        
        //Input Gender
        driver.findElement(By.xpath("//input[@value='Male']")).click();

        //Input Hobbies
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        
                                            // Select dropdown
       

        // Input Languages
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();


        WebElement Ddn = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select skill = new Select(Ddn);
        skill.selectByVisibleText("C");
        //skill.selectByIndex(3);
        //skill.selectByValue("Analytics");


                                // option 2
        //WebElement skill =driver.findElement(By.xpath("//select[@id='Skills']"));
		//skill.sendKeys("C");
                            
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
        
        /////         DOB      //////////////////
        
        //input year
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		year.sendKeys("2025");
		       

		//input Month
		WebElement Mon = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Mon.sendKeys("May");
		
		//input day
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		day.sendKeys("12");
		
		//input password
		WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		password.sendKeys("abcdefgh");
		
		//input confirm password
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		ConfirmPassword.sendKeys("abcdefgh");
		
		//Click  Submit
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submit.click();
}

}
