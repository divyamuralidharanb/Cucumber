package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login extends BaseClass{
	
	@Given("Enter the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void validateHomePage() {
		if(driver.getTitle().equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Login failed");
		}
	}
	
	@But("Error message should be displayed")
	public void validateErrorMessage() {
		System.out.println("Error message displayed");
	}

}

