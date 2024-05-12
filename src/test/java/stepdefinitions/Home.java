package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {
	WebDriver driver;
	@Given("user launches browser")
	public void user_launches_browser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	    // Write code here that turns the phrase above into concrete actions
		}
	
	@When("^enter url$")
	public void enter_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.amazon.in");
	}

	@Then("^observe the contents$")
	public void observe_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.getCurrentUrl().contains(".in");
	}

	@Then("^observe the contents displaying in the header$")
	public void observe_the_contents_displaying_in_the_header(DataTable arg1) throws Throwable {
		List<String> data=arg1.asList(String.class);
		for(int i=0;i<data.size();i++)
		{
			driver.findElement(By.xpath("//a[contains(text(),'"+data.get(i)+"')]")).isDisplayed();
		}
	   
	}


@When("enter a {string} and click on search")
public void enter_a_and_click_on_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}


@Then("respective should display")
public void respective_should_display() {
	    // Write code here that turns the phrase above into concrete actions
		driver.getCurrentUrl();
	}

}
