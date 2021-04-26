package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DeleteLead extends BaseClass{
	String leadID;
	
	@When("Click Find Leads button")
	public void clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@When("Choose first lead")
	public void chooseFirstLead() throws InterruptedException {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(2000);
	}
	@When("Click on Delete lead")
	public void clickOnDeleteLead() throws InterruptedException {
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(2000);
	}
	@Then("Lead should NOT be present")
	public void leadShouldNOTBePresent() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Delete successful");
		} else {
			System.out.println("Delete unsuccessful");
		}
	}
}

