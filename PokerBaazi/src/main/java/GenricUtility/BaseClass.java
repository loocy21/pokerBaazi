package GenricUtility;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	WebDriverUtility webdriver  = new WebDriverUtility();
	FileUtility fu = new FileUtility();
	
	/**
	 * Description: this method for open application
	 * @author Prashun
	 * @param
	 */
	@BeforeClass
	public void openApp() throws Throwable {
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://dashboard.alphabetabox.com/login-credentials");
			webdriver.waitUntilPageLoads(driver);
			System.out.println("Application the launch");
		} catch (Exception e) {
			Assert.fail("Application launch fails");
		}
	}
	
	/**
	 * Description: this method for close application
	 * @author Prashun
	 * @param
	 */
	@AfterClass
	public void closeApp() {
		try {
			//driver.quit();
			System.out.println("close the application");
		} catch (Exception e) {
			Assert.fail("fails to close the application");
		}
	}
}
