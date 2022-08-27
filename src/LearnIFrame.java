import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIFrame {
	
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
@Test
public void testIFrame() {
	driver.switchTo().frame("packageListFrame")
	driver.findElement(By.linkText(By.linkText("java.awt")).click();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("Adjustable")).click();
}
}
