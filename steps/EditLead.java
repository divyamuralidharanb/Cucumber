package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	
	@When("Click on Find Leads by Phone button")
	public void clickOnFindLeadsByPhoneButton() {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@When("Search with phone number as {string}")
	public void searchWithPhoneNumberAs(String phnNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnNo);
	}
	@When("Click Find Leads button and choose first")
	public void findLeadAndChooseLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Choose to edit Lead link")
	public void chooseToEditLeadLink() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@When("Update company name as {string}")
	public void updateCompanyNameAs(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}
	@Then("Company should get updated as {string}")
	public void companyShouldGetUpdated(String company) {
		driver.findElement(By.name("submitButton")).click();
		String updatedCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(updatedCompany.contains(company)) {
			System.out.println("Company name updated");
		}
		else {
			System.out.println("Company name not updated");
		}
	}
}

