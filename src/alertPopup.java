import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	WebDriver driver;
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(10,TimeOut.SECONDS);
	}	
	
	public void alertPopupmenu(){
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		driver.switchTo();
	}	
}
