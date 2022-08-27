import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnDropdown {
	
	WebDriver driver;
	
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=login/");
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(10,TimeOut.SECONDS);
	}		
		@Test
		
		public void loginTest{
			By userNameField=By.xpath("//input[@id='username']");
			By uspasswordField=By.xpath("//input[@id='password']");
			By signInButtonField=By.xpath("//input[@id='login']");
			By dashboardHeaderField=By.xpath("//h2[contains(text(),'Dashboard')]");
			
			driver.findElement(userNameField).sendKeys("demo@techfios.com");
			//driver.findElement(By.xpath("input[@id='username']")).sendKeys("demo@techfios.com");
			driver.findElement(signInButtonField).click();
			
			//boolean driver.findElement(dashboardHeaderField).isDisplayed();
			//Assert.assertTrue("Page not found",dashboardHeaderExistance);
			
			/*String dashboardHeaderText=driver.findElement(dashboardHeaderField).getText();
			
	//Assert.assertEquals("Page not found","Dashboard" ,dashboardHeaderText);*/
			
			//driver.getTitle();
			
			Assert.assertEquals("Page not found","Dashboard" ,driver.getTitle());
	
		}
public void addCustomerTest() {
	
	loginTest();
	driver.findElement(customerMenuField).click();
	driver.findElement(addcustomerMenuField).click();
	
	driver.findElement(fullNameField).sendKeys("Selenium");
	
	Select sel=new Select(driver.findElement(companyDropdownField));
	sel.selectByVisibleText("Techfios");
	//get option from select tag
	//and store them in a variable string type list
	//get the text out of it
	//string array with all the options to validate it with
	
	sel.getOptions();
	
   }	
@Test

public void tearDown() {
	
	driver.close();
}
		
		
	}


