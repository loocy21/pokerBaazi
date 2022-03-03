package GenricUtility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
/**
 * test case name: Listeners
 * Description: generate extent report of test script and take screenshot of failed test script
 * @author Prashun
 * @param
 */
public class Listeners implements ITestListener {
	
	ExtentReports reports;
	ExtentTest test;
	
	/**
	 * Description: this method is for onTestStart
	 * @author Prashun
	 * @param result
	 */
	public void onTestStart(ITestResult result) 
	{
		test=reports.createTest(result.getMethod().getMethodName());
	}
	
	/**
	 * Description: this method is for onTestSuccess
	 * @author Prashun
	 * @param result
	 */
	public void onTestSuccess(ITestResult result)
	{
	    test.log(Status.PASS, result.getMethod().getMethodName()+"is passed");	
		
	}
	
	/**
	 * Description: this method is for onTestFailure
	 * @author Prashun
	 * @param result
	 */
	public void onTestFailure(ITestResult result) {		
		String methodName = result.getMethod().getMethodName();
		Object obj = result.getInstance();
		WebDriver driver = null;
		test.log(Status.FAIL, result.getMethod().getMethodName()+"is failed");
		test.log(Status.FAIL,result.getThrowable());
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+methodName+".PNG");
		try {
			Files.copy(src, dest);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Description: this method is for onTestSkipped
	 * @author Prashun
	 * @param result
	 */
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+"is skipped");
		test.log(Status.SKIP, result.getThrowable());
	}
	
	/**
	 * Description: this method is for onTestFailedButWithinSuccessPercentage
	 * @author Prashun
	 * @param result
	 */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	
	/**
	 * Description: this method is for onStart
	 * @author Prashun
	 * @param context
	 */
	public void onStart(ITestContext context) {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReports/ExtentReports1.html");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("Test Script Report");
		reporter.config().setReportName("automation excution report");
		
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("BuildNo", "5.1");
		reports.setSystemInfo("Env", "pro");
		reports.setSystemInfo("Platform", "windows");
		reports.setSystemInfo("Browser version", "chrome-93");
		
		
	}
	
	/**
	 * Description: this method is for onFinish
	 * @author Prashun
	 * @param context
	 */
	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

	


	
}