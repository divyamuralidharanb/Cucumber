package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateLead extends BaseClass{
	
	@When("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Then("MyHomePage should be displayed")
	public void validateMyHomePage() {
		if(driver.getTitle().equalsIgnoreCase("My Home | opentaps CRM")) {
	    	System.out.println("My Home is displayed as expected");
	    }
	    else {
	    	System.out.println("My Home is NOT displayed");
	    }
	}
	
	@When("Click on Leads link")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}	
	
	@When("Click on Create Lead link")
	public void clickOnCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter company name as {string}")
	public void enterCompanyNameAs(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	@When("Enter first name as {string}")
	public void enterFirstNameAs(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@When("Enter last name as {string}")
	public void enterLastNameAs(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("Click on Submit button")
	public void clickOnSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("View Lead should be displayed")
	public void viewLeadShouldBeDisplayed() {
	    if(driver.getTitle().equalsIgnoreCase("View Lead | opentaps CRM")) {
	    	System.out.println("View Lead is displayed as expected");
	    }
	    else {
	    	System.out.println("View Lead is NOT displayed");
	    }
	}
	
	
}

