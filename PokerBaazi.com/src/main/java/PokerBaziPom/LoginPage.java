package  PokerBaziPom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;



/**
 * Description: This class consists of Locaters and generic methods related to Login page
 * @author Mabasha
 *
 */
public class LoginPage {
	WebDriver driver;
	WebDriverUtility wu= new WebDriverUtility();
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*Dynamic xpath Text Filed Options*/
	public WebElement tfOptions(String value) {
		String xpath="//input[@id='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/*Dynamic xpath Link Options*/
	public WebElement linkOptions(String value) {
		String xpath="//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*dynamic xpath for links*/
	public WebElement linkoptions(String value) {
		String xpath="//a[contains(@class,'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*Logout button*/
	@FindBy(xpath = "//div[@class='pb-sidebar-logout']")
	private WebElement btnLogout;
	
	/*Dynamic xpath btn option*/
	public WebElement btnOptions(String value) {
		String xpath="//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/**
	 * Description: this method used for login
	 * @author Prashun
	 * @param
	 * @throws Throwable 
	 */
	public void clkOnLogin(String txtUsername, String txtPassword, String username, String password, String value) throws Throwable {
		try {
			tfOptions(txtUsername).sendKeys(username);
			tfOptions(txtPassword).sendKeys(password);
			linkOptions(value).click();
			Thread.sleep(5000);
			System.out.println("able to login");
		} catch (Exception e) {
			System.out.println("unable to login");
			Assert.fail("unable to login");
		}
	}
	
	
	/**
	 * Description: this method is used enter user name in username TF
	 * @author Mabasha
	 * @param id 
	 * @param username
	 * @throws Throwable 
	 */

	public void enterUserName(String id,String username) throws Throwable {
		try {
			wu.Thread(4000);
			tfOptions(id).sendKeys(username);
			System.out.println("Username entered sucessfully "+username);
		}catch (Exception e) {
			Assert.fail("Unable to enter usernname ");
		}
	}
	
	/**
	 * Description: this method is used enter user password in password TF
	 * @author Mabasha
	 * @param id 
	 * @param userpwd
	 * @throws Throwable 
	 */
	public void enterUserPwd(String id,String userpwd) throws Throwable {
		try {
			wu.Thread(4000);
			tfOptions(id).sendKeys(userpwd);
			System.out.println("Userpwd entered sucessfully "+userpwd);
		}catch (Exception e) {
			Assert.fail("Unable to enter Userpwd ");
		}
	}
	
	/**
	 * Description: this method is used eto click on login with phone number link
	 * @author Mabasha
	 * @param text
	 * @throws Throwable 
	 */
	public void clkLoginPhoneNumLink(String text) throws Throwable {
		try {
			wu.Thread(4000);
			linkoptions(text).click();
			System.out.println("Able to click on Login with phone Number "+text);
		}catch (Exception e) {
			Assert.fail("Unable to click on Login with phone Number ");

		}
	}

	/**
	 * Description: this method is used enter Phone Number in phone number tf
	 * @author Mabasha
	 * @param id 
	 * @param username
	 * @throws Throwable 
	 */

	public void enterUserPhoneNum(String id,String userphoneNum) throws Throwable {
		try {
			wu.Thread(4000);
			tfOptions(id).sendKeys(userphoneNum);
			System.out.println("userphoneNum entered sucessfully "+userphoneNum);
		}catch (Exception e) {
			Assert.fail("Unable to enter userphoneNum ");
		}
	}
	/**
	 * Description: this method is used to click on login btn
	 * @author Mabasha
	 * @param text
	 * @throws Throwable 
	 */
	public void clkbtLogin(String text) throws Throwable {
		try {
			wu.Thread(4000);
			btnOptions(text).click();
			System.out.println("Able to click on Login btn "+text);
		}catch (Exception e) {
			Assert.fail("Unable to click on Login btn ");

		}
	}
	/**
	 * Description: this method is used to click on Logout btn
	 * @author Mabasha
	 * @param text
	 * @throws Throwable 
	 */
	public void clkbtLogout() throws Throwable {
		try {
			wu.Thread(10000);
			btnLogout.click();
			System.out.println("Able to click on Logout btn ");
		}catch (Exception e) {
			Assert.fail("Unable to click on Logout btn ");

		}
	}
	/**
	 * Description: this method is used eto click on login with Email  link
	 * @author Mabasha
	 * @param text
	 * @throws Throwable 
	 */
	public void clkLoginEmailLink(String text) throws Throwable {
		try {
			wu.Thread(4000);
			linkoptions(text).click();
			System.out.println("Able to click on Login with Email  "+text);
		}catch (Exception e) {
			Assert.fail("Unable to click on Login with Email ");

		}
	}

}
