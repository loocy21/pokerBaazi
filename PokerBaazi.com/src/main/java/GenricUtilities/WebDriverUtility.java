package GenricUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;

public class WebDriverUtility {
	/**
	 * Description: this method enables user to handle dropdown using visible text
	 * @author prashun
	 * @param driver
	 * @param ele
	 * @param option
	 */
	
	public void hardAssert(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Description: this method perform to switch one window to another
	 * @param driver
	 * @param partialTitle
	 */
	public void switchToWindow(WebDriver driver, String partialTitle) {
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> it = wind.iterator();
		
		while(it.hasNext()) {
			String windID = it.next();
			String title = driver.switchTo().window(windID).getTitle();
			
			if (title.contains(partialTitle)) {
				break;
			}
		}
	}
	
	/**
	 * Description: this method enables user to handle dropdown using visible text
	 * @author prashun
	 * @param driver
	 * @param ele
	 * @param option
	 */
	
	public void handleDropDownUsingVisibleText(WebDriver driver, WebElement ele, String option) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(option);
	}
	/**
	 * Description: this method enables user to handle dropdown using index
	 * @author prashun
	 * @param driver
	 * @param ele
	 * @param index
	 */
	
	public void handleDropDownUsingIndex(WebDriver driver, WebElement ele, int index) {
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}
	/**
	 * Description: this method enables user to handle dropdown using value
	 * @author prashun
	 * @param driver
	 * @param ele
	 * @param value
	 */
	
	public void handleDropDownUsingValue(WebDriver driver, WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
	}
	
	public void Thread(int count) throws InterruptedException {
		Thread.sleep(count);
	}
	
	/**
	 *  Description: this method for exlicitwait
	 * @author prashun
	 * @param driver
	 * @param ele
	 * */
	public void explicitWait(WebDriver driver, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	/**
	 * Description: this method wait for 20 sec for page loading
	 * @author prashun
	 * @param driver
	 */
	public void waitUntilPageLoads(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	/**
	 * Description: this method perform mouse hover action
	 * @author prashun
	 * @param driver
	 * @param ele
	 */
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
	}
	
	/**
	 *Description: this method perform right click action
	 *@author prashun
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions ac = new Actions(driver);
		ac.contextClick(ele).perform();
	}
	/**
	 * Description: Accept alert
	 * @author prashun
	 * @param driver
	 */
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * Description: cancel alert
	 * @author prashun
	 * @param driver
	 */
	
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 *Description: this method perform scroll by
	 *@author prashun
	 * @param driver
	 * @param ele
	 */
	public void scrollToWebElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int y=ele.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", ele);
	}
	
	/**
	 * this method is used to switch frame
	 * @param driver
	 */
	
	public void switchFrames(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * this method is used to switch frame
	 * @param driver
	 */
	
	public void switchToPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * Description: this method is used to take screenshot
	 * @author prashun
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws Throwable
	 */
	public static String takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
		String screenshotPath = "./photos/"+screenshotName+".PNG";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotPath);
		Files.copy(src, dest);
		return screenshotPath;
	}
}
