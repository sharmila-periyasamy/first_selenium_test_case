package DataDriven;

import java.util.Stack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class BaseClass {
 static WebDriver   driver;
	public static void LaunchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sureshkannan/Documents/selenium/chromedriver_win32/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().fullscreen();
		
	}
	public static void sendValue(WebElement g, String a) {
	g.sendKeys(a);
		

	}
	public static void clickButton(WebElement a){
		a.click();
	}
	
	public static void exit(){
		driver.quit();
	}
	
	}


