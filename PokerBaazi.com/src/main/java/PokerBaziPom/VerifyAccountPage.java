package  PokerBaziPom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Description: Elements of Verify Account Page
 * @author Prashun
 */
public class VerifyAccountPage {
	WebDriver driver;
	public VerifyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*text verify account*/
	private WebElement txtVerifyAccount(String value) {
		String xpath= "//span[contains(text(),'"+value+"')]/ancestor::div[@class='pb-container__body ']/descendant::div[@class='content__description']/span";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*button edit*/
	@FindBy(xpath= "//div[@class='content__description']/button")
	private WebElement btnEdit;
	
	/*text mobile number*/
	@FindBy(id= "mobile")
	private WebElement txtMobileNumber;
	
	/*button verify, send OTP and continue KYC */
	private WebElement btnVerifyOTPAndKYC(String value) {
		String xpath= "//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/**
	 * Description: this method is used to get verify account email
	 * @author Prashun
	 * @param value
	 */
	public void getVerifyEmail(String value) {
		try {
			WebElement ele = txtVerifyAccount(value);
			System.out.println(ele.getText());
			System.out.println("able to get verify account email");
		} catch (Exception e) {
			Assert.fail("unable to get verify account email");
		}
	}
	
	/**
	 * Description: this method is used to get verify account phoneno
	 * @author Prashun
	 * @param value
	 */
	public void getVerifyPhoneNo(String value) {
		try {
			WebElement ele = txtVerifyAccount(value);
			System.out.println(ele.getText());
			System.out.println("able to get verify account phoneno");
		} catch (Exception e) {
			Assert.fail("unable to get verify account phoneno");
		}
	}
	
	/**
	 * Description: this method is used to click on edit phone no
	 * @author Prashun
	 */
	public void clkEdit() {
		try {
			btnEdit.click();
			System.out.println("able to click on edit phone no");
		} catch (Exception e) {
			Assert.fail("unable to click on edit phone no");
		}
	}
	
	/**
	 * Description: this method is used to enter phone no
	 * @author Prashun
	 * @param value
	 */
	public void setPhoneNO(String value) {
		try {
			txtMobileNumber.sendKeys(value);
			System.out.println("able to enter phone no");
		} catch (Exception e) {
			Assert.fail("unable to enter phone no");
		}
	}
	
	/**
	 * Description: this method is used to click on send otp
	 * @author Prashun
	 * @param value
	 */
	public void clkOnSendOtp(String value) {
		try {
			btnVerifyOTPAndKYC(value).click();
			System.out.println("able to click on send otp");
		} catch (Exception e) {
			Assert.fail("unable to click on send otp");
		}
	}
	
	/**
	 * Description: this method is used to click on verify button
	 * @author Prashun
	 * @param value
	 */
	public void clkOnVerify(String value) {
		try {
			btnVerifyOTPAndKYC(value).click();
			System.out.println("able to click on verify button");
		} catch (Exception e) {
			Assert.fail("unable to click on verify button");
		}
	}
	
	/**
	 * Description: this method is used to click on continue with kyc button
	 * @author Prashun
	 * @param value
	 */
	public void clkOnContinueWithKyc(String value) {
		try {
			btnVerifyOTPAndKYC(value).click();
			System.out.println("able to click on continue with kyc button");
		} catch (Exception e) {
			Assert.fail("unable to click on continue with kyc button");
		}
	}
	
}
