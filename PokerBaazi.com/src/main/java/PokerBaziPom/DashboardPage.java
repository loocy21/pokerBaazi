package  PokerBaziPom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Description:This page contains get text of all module name
 * @author Shobha
 *
 */
public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Genric xpath of button cashier*/
	private WebElement btnCashier(String value1) {
		String xpath = "//span[text()='"+value1+"']";
		return driver.findElement(By.xpath(xpath));
	} 
	
	
	/* get text of all options */
	@FindBy(xpath="//div[@class='pb-container_body pb-sidebar_body']")
	private List<WebElement> getTextAll;
	
	
	/* Genric xpath of get text of cashBalance*/
	private <List>WebElement balance(String cashBalance) {
		String xpath = "//ul[@class='MuiList-root pb-list  MuiList-padding']/descendant::span[contains(text(),'"+cashBalance+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/**
	 * Description: this method is used to click options from dashboard
	 * @author Prashun
	 * @param value
	 */
	public void clkOnDashboardOptions(String value) {
		try {
			btnCashier(value).click();
			System.out.println("able to click options from dashboard");
		} catch (Exception e) {
			Assert.fail("unable to click options from dashboard");
		}
	}
}
