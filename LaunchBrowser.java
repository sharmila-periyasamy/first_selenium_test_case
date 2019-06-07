package launch;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.SendKeys;

import net.bytebuddy.matcher.EqualityMatcher;

public class LaunchBrowser {
	
	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:/Users/Sureshkannan/Documents/selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com");
		driver.manage().window().maximize();		
		WebElement e= driver.findElement(By.name("loginfmt"));
		e.sendKeys("EMAIL id");
		Thread.sleep(2000);
		String Str=driver.getCurrentUrl();
		System.out.println(Str);
		String title= driver.getTitle();
		System.out.println(title);
		WebElement next= driver.findElement(By.id("idSIButton9"));
		next.click();
		Thread.sleep(2000);
		WebElement pwd= driver.findElement(By.name("passwd"));
		pwd.sendKeys("******");
		WebElement signin= driver.findElement(By.id("idSIButton9"));
		signin.click();
		Thread.sleep(4000);
		WebElement btn=driver.findElement(By.xpath("//a [contains(text(),'Sharmila')]"));
		String name= btn.getText();
		System.out.println(name);
		String StrdNme= "Name";
				if(name.equalsIgnoreCase(StrdNme))
				{
					System.out.println("Login Successful");
				}
				else{
				System.out.println("Test Unsuccessful");
				}
				
				driver.close();
	}

}
