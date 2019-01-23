package stepdefinitions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Loginstepdefinition extends Abstractstepdefinition{
	WebDriver driver = getdriver() ;
	@Given("^User is already login page$")
	public void user_is_already_login_page() {
		
		driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	
	}

	@When("^title of the login page is makemytrip$")
	public void title_of_the_login_page_is_makemytrip()  {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		 WebDriverWait wait = new WebDriverWait(driver, 500);
		 String expectedtitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		  wait.until(ExpectedConditions.titleIs(expectedtitle));
		  String title = driver.getTitle();
		  Assert.assertEquals(title,expectedtitle);
	    
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("ch_login_icon")).click();
		 driver.findElement(By.id("ch_login_email")).sendKeys(username);
	 driver.findElement(By.id("ch_login_password")).sendKeys(password);
		
		
	   
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement button= driver.findElement(By.xpath("//button[@id='ch_login_btn']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", button);
	   
	}

	@Then("^user is on homepages$")
	public void user_is_on_homepages()  {
		System.out.println("home page logged");
		String expectedtitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		
		  String title = driver.getTitle();
		  Assert.assertEquals(title,expectedtitle);
	    
	}

}
