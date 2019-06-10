package MavenPackage.MavenProject;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main ( String[] args) throws InterruptedException
	
	{
	System.setProperty("webdriver.chrome.driver", "C:/Users/Sureshkannan/Documents/selenium/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	Thread.sleep(2000);
		driver.quit();
	}

}
