package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstractstepdefinition {

	protected static WebDriver driver;
	
	protected WebDriver getdriver(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "C:/Users/rbharga1/Downloads/Selenium workspace/chromedriver_win32/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		return driver;
	}
}
