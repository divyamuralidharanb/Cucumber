package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DuplicateLead extends BaseClass {
	//public int leadId;
	
	@When("Choose to Create Duplicate lead")
	public void chooseToCreateDuplicateLead() {
		//leadId = Integer.parseInt(driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("\\D", ""));
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Then("Duplicate Lead page should be displayed")
	public void duplicateLeadPageShouldBeDisplayed() {
	    if(driver.getTitle().equalsIgnoreCase("Duplicate Lead | opentaps CRM")) {
	    	System.out.println("Duplicate Lead page is displayed");
	    }
	    else {
	    	System.out.println("Duplicate Lead page is NOT displayed");
	    }
	}
}

