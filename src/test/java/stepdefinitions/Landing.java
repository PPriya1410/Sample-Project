package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Landing {
	WebDriver driver;
	
	@Given("user opens a browser")
	public void user_opens_a_browser() {
	    // Write code here that turns the phrase above into concrete actions
		
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
	}

	@When("Usr launch an url")
	public void usr_launch_an_url() {
	  driver.get("https://www.demoblaze.com/index.html");
		
	}

	@Then("User should observe the page title")
	public void user_should_observe_the_page_title() {
	  
		Assert.assertEquals("STORE", driver.getTitle());
	}

	@When("Click on a product")
	public void click_on_a_product() throws InterruptedException {
		Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
	}

	@Then("user should naviagte to respective product")
	public void user_should_naviagte_to_respective_product() throws InterruptedException {

		Thread.sleep(5000);
		
		Assert.assertEquals("Nokia lumia 1520", 	driver.findElement(By.xpath("//h2[text()='Nokia lumia 1520']")).getText());
		Assert.assertEquals(true,driver.findElement(By.xpath("//h2[text()='Nokia lumia 1520']")).isDisplayed());
		
	}
	@Then("user should display with below contents")
	public void user_should_display_with_below_contents(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(5000);
		List<String> l=dataTable.asList(String.class);
		for(String e:l)
		{
			driver.findElement(By.xpath("//a[text()='"+e+"']")).isDisplayed();
		}
	
		
		
	}
	@When("usr click on login link")
	public void usr_click_on_login_link() throws InterruptedException {
		Thread.sleep(5000);
	   driver.findElement(By.id("login2")).click();
	}

	@Then("User eneter {string} and {string} and click on login button")
	public void user_eneter_and_and_click_on_login_button(String string, String string2) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("loginusername")).sendKeys(string);
		driver.findElement(By.id("loginpassword")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
	
	}

	@Then("use should verify logged successfully")
	public void use_should_verify_logged_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
