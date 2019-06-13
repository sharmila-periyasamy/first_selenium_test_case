package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class executorClass extends BaseClass {

	public static void main(String[] args) {
		LaunchBrowser("https://www.facebook.com/");
		WebElement e= driver.findElement(By.id("email"));
		sendValue(e,"sharmila.periyasamy");
		WebElement e1= driver.findElement(By.id("pass"));
		sendValue(e1,"122345");
		WebElement button= driver.findElement(By.xpath("//input[@value='Log In']"));
		clickButton(button);
		exit();
			}

}
