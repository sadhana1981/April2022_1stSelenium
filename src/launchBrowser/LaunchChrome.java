package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	
    public static void main(String[] args) throws InterruptedException {
    	
  //setup system property
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadha\\selenium\\first_selenium\\driver\\chromedriver.exe");
//object of chrome driver 
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.selenium.dev/");
    	driver.manage().window().maximize();
    	
    	Thread.sleep(2000);  //pause execution
    	
    	driver.close();      //close browser
    	
    }
}
