package GenricUtilities;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass 
{
	
	private static final String[] browser = null;

	public WebDriver driver;
	
	public PropertyFileUtility pf = new PropertyFileUtility();
	public JsonFileUtility jsonLib = new JsonFileUtility();
	WebDriverUtility web = new WebDriverUtility();
	public static WebDriver staticdriver;
	
	@BeforeSuite
	public void launchBrowser() throws Throwable
	{
		System.out.println("====launchBrowser=====");
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		 String BROWSER  =pf.getPropertyFileData("browser");
		 String URL  = pf.getPropertyFileData("url");
		 
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver(p);
		
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		ChromeDriverManager.chromedriver().setup();
		driver.get(URL);
		driver.manage().window().maximize();
		web.waitUntilPageLoads(driver);
		
		}
	
	@BeforeMethod
	public void LoginToApp() throws Throwable
	{
		System.out.println("====LoginToApp===");
	}
		
	@AfterMethod
	public void logoutToApp()
	{
		System.out.println("====logoutToApp====");
	}
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("=====closeBrowser====");
		//driver.quit();
	}
		
	public String getscreenshot(String name) throws IOException 
	{
		File srcfile = ((TakesScreenshot) staticdriver).getScreenshotAs(OutputType.FILE);
		String  destfile = System.getProperty("user.dir")+"/Screenshots/"+name+".png";
	
		File finaldest= new File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		
		return destfile;

}
}

	