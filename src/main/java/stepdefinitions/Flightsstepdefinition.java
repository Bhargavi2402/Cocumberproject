package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class Flightsstepdefinition extends Abstractstepdefinition{
	WebDriver driver = getdriver() ;
	@Then("^user enters credentials to login$")
	public void user_enters_credentials_to_login(DataTable usercredentials) throws Throwable {
		driver.findElement(By.id("ch_login_icon")).click();
		List<List<String>> data = usercredentials.raw();
		 driver.findElement(By.id("ch_login_email")).sendKeys(data.get(0).get(0));
	 driver.findElement(By.id("ch_login_password")).sendKeys(data.get(0).get(1));
	    
	}

	

	@Then("^user enters from to and date$")
	public void user_enters_from_to_and_date(DataTable flighdetails) throws Throwable {
		List<List<String>> details = flighdetails.raw();
		Thread.sleep(1000);
		WebElement frombutton = driver.findElement(By.id("hp-widget__sfrom"));
		List<WebElement> fromlist = driver.findElements(By.xpath("//*[contains(@class,'locationFilter autocomplete_from')]/ul[1]//li//div//span[contains(@class,'autoCompleteItem__label')]"));
		WebElement Tobutton = driver.findElement(By.id("hp-widget__sTo"));
		List<WebElement> tolist = driver.findElements(By.xpath("//*[contains(@class,'locationFilter autocomplete_to')]/ul[1]//li//div//span[contains(@class,'autoCompleteItem__label')]"));
		WebElement Datebutton = driver.findElement(By.id("hp-widget__depart"));
		WebElement currentmonth = driver.findElement(By.xpath("//*[contains(@class,'ui-datepicker-title')]/span[contains(@class,'ui-datepicker-month')]"));
		WebElement nextbutton = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]"));
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar']/tbody//td/a[contains(@class,'ui-state-default')]"));
		
		frombutton.clear();
		frombutton.click();
		
		try {
			for(WebElement ele:fromlist){
			WebDriverWait wait = new WebDriverWait(driver, 5);
			String city = ele.getText();
			if(city.contains(details.get(0).get(0))){
				ele.click();;
					
			}
		}}
		catch (Exception e) {
			e.getMessage();
		}
		try {
			for(WebElement elem:tolist){
			
			String city2 =  elem.getText();
			if(city2.contains(details.get(0).get(1))){
				elem.click();
			}
		}} catch (Exception e) {
			e.getMessage();
		}
		Thread.sleep(1000);
		Datebutton.click();
		String Currentmonth = currentmonth.getText();
		String Expectedmonth = details.get(0).get(2);
		if(Expectedmonth.contains(Currentmonth)){
			System.out.println("month is already selected");
		
		}else{
			for(int i=1;i<12;i++){
				nextbutton.click();
				//driver.findElement(By.partialLinkText("ui-datepicker-next ui-corner-all")).click();
				 Currentmonth = currentmonth.getText();
				 if(Expectedmonth.equalsIgnoreCase(Currentmonth)){
						System.out.println("month is selected");
						break;
					}
				}
			}
		for(WebElement date:dates){
			String caldate = date.getText();
			String selecteddate = details.get(0).get(3);
			if(caldate.equals(selecteddate)){
				date.click();
				break;
			}
		}
			
	    
	}

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		 driver.findElement(By.id("searchBtn")).click();
	   
	}


}
