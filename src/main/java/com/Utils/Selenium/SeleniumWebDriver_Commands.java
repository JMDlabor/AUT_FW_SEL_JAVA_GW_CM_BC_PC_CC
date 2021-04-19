/*
 * getcss
 */

package com.Utils.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.base.Verify;

public class SeleniumWebDriver_Commands extends Selenium_Utils_File {

	protected WebDriver driver;
	protected ExtentTest oExtentTest;

	WebElement oWebElement;
	String LogMsg;

	public SeleniumWebDriver_Commands(WebDriver driver, ExtentTest oExtentTest) {
		this.driver = driver;
		this.oExtentTest = oExtentTest;
	}

	protected WebElement getElement(By Locator) throws Throwable {

		oWebElement = null;

		try {

			// Find the Element.
			oWebElement = driver.findElement(Locator);

			// Wait for the Element.
			oWebDriverWait.until(ExpectedConditions.visibilityOf(oWebElement));

			// Highlight the Element.
			oJavascriptExecutor.executeScript(
					"arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", oWebElement);

			Thread.sleep(500);

			oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px white')",
					oWebElement);

			// oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			oWebElement = null;

			LogMsg = "Element not found ";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;

		}

		return oWebElement;
	}

	public List<WebElement> getElements(By Locator) throws Throwable {

		oWebElement = null;
		List<WebElement> oWebElement_List;

		try {

			// Find the Element.
			oWebElement_List = driver.findElements(Locator);

			int intsize = oWebElement_List.size();
			if (intsize <= 0) {
				oWebElement_List = null;
				throw new NoSuchElementException(Locator.toString());
			} else if (intsize >= 1) {
				for (WebElement oWebElement : oWebElement_List) {

					// Wait for the Element.
					oWebDriverWait.until(ExpectedConditions.visibilityOf(oWebElement));

					// Highlight the Element.
					oJavascriptExecutor.executeScript(
							"arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')",
							oWebElement);

					Thread.sleep(500);

					oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px white')",
							oWebElement);
				}
			}

		} catch (Exception e) {
			LogMsg = "Element not found ";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

		return oWebElement_List;

	}

	public void gwAutomate(By Locator, String command, String strValue) throws Throwable {

		oWebElement = null;

		try {

			// Get the Element.
			oWebElement = getElement(Locator);

			switch (command) {
			case "sendkeys":
				oWebElement.sendKeys(strValue);
				break;
			case "clear":
				oWebElement.clear();
				break;
			case "select":
				new Select(oWebElement).selectByVisibleText(strValue);
				break;
			case "selectByVisibleText":
				new Select(oWebElement).selectByVisibleText(strValue);
				break;
			case "selectByIndex":
				new Select(oWebElement).selectByIndex(0);

				break;
			case "click":
				oWebElement.click();
				break;

			default:
				break;
			}

			String LogMsg;
			String strTemp = "Element : " + Locator.toString() + " command : [" + command.toString() + "] Value : ["
					+ strValue.toString() + "]";
			System.out.println(strTemp);
			if (command.equals("click")) {
				LogMsg = "Clicked Element : " + Locator.toString();

			} else {
				LogMsg = "Element : " + Locator.toString() + " =  [" + strValue.toString() + "]";
			}
			oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void GuidewireAutomate(String ElementName, By Locator, String command, String strValue) throws Throwable {

		oWebElement = null;
		LogMsg = null;
		Actions oActions = new Actions(driver);
		Action oAction;
		try {

			// Get the Element.
			oWebElement = getElement(Locator);

			switch (command) {
			case "alertaccept":
				driver.switchTo().alert().accept();
				break;
			case "alertdismiss":
				driver.switchTo().alert().dismiss();
				break;
			case "moveToElement":
				oAction = oActions.moveToElement(oWebElement).build();
				oAction.perform();
				break;
			case "keyDownF12":
				oAction = oActions.keyDown(oWebElement, Keys.F12).build();
				oAction.perform();
				break;
			case "keyUpF12":
				oAction = oActions.keyUp(oWebElement, Keys.F12).build();
				oAction.perform();
				break;
			case "ALTSHIFTP":
				oAction = oActions.keyUp(oWebElement, Keys.F12).build();
				oAction.perform();
				break;
			case "ALTSHIFTF":
				oAction = oActions.keyUp(oWebElement, Keys.F12).build();
				oAction.perform();
				break;
			case "doubleClick":
				oAction = oActions.doubleClick(oWebElement).build();
				oAction.perform();
				break;
			case "clear":
				oWebElement.clear();
				break;
			case "click":
				oWebElement.click();
				break;
			case "close":
				// oWebElement.close();
				break;
			case "sendkeys":
				oWebElement.sendKeys(strValue);
				break;
			case "selectByIndex":
				new Select(oWebElement).selectByIndex(Integer.parseInt(strValue));
				break;
			case "selectByVisibleText":
				new Select(oWebElement).selectByVisibleText(strValue);
				break;
			case "selectByValue":
				new Select(oWebElement).selectByValue(strValue);
				break;

			default:
				break;
			}

			String strTemp = "Element : " + Locator.toString() + " command : [" + command.toString() + "] Value : ["
					+ strValue.toString() + "]";
			System.out.println(strTemp);
			if (command.equals("click")) {
				LogMsg = "Clicked : " + ElementName;

			} else {
				LogMsg = ElementName + " =  [" + strValue.toString() + "]";
			}
			oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			LogMsg = ElementName + " =  [" + strValue.toString() + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

	}

	public void GuidewireAutomate_Table(String ElementName, By Locator, String command, String strValue)
			throws Throwable {

		oWebElement = null;
		List<WebElement> oWebElement_List;

		LogMsg = null;
		Actions oActions = new Actions(driver);
		Action oAction;
		try {

			// Get the Element.
			oWebElement_List = getElements(Locator);

			switch (command) {

			case "sendkeys":
				oWebElement.sendKeys(strValue);
				break;
			case "selectByIndex":
				new Select(oWebElement).selectByIndex(Integer.parseInt(strValue));
				break;
			case "selectByVisibleText":
				new Select(oWebElement).selectByVisibleText(strValue);
				break;
			case "selectByValue":
				new Select(oWebElement).selectByValue(strValue);
				break;
			case "moveToElement":
				oAction = oActions.moveToElement(oWebElement).build();
				oAction.perform();
				break;
			case "clear":
				oWebElement.clear();
				break;
			case "click":
				oWebElement.click();
				break;
			default:
				break;
			}

			String strTemp = "Element : " + Locator.toString() + " command : [" + command.toString() + "] Value : ["
					+ strValue.toString() + "]";
			System.out.println(strTemp);
			if (command.equals("click")) {
				LogMsg = "Clicked : " + ElementName;

			} else {
				LogMsg = ElementName + " =  [" + strValue.toString() + "]";
			}
			oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			LogMsg = ElementName + " =  [" + strValue.toString() + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

	}

	public void GuidewireAutomate_Handle(String Handle, String HandleName) {
		oWebElement = null;
		LogMsg = null;

		try {

			switch (Handle) {
			case "alertaccept":
				driver.switchTo().alert().accept();
				break;
			case "alertdismiss":
				driver.switchTo().alert().dismiss();
				break;
			case "childwindow":
				driver.switchTo().window(HandleName);
				break;
			case "parentwindow":
				driver.switchTo().window(HandleName);
				break;
			case "defaultContent":
				driver.switchTo().defaultContent();
				break;
			case "parentFrame":
				driver.switchTo().parentFrame();
				break;
			}
			LogMsg = HandleName + " =  [" + strValue.toString() + "]";

			oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			LogMsg = Handle + " =  [" + strValue.toString() + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}
	}

	public void GuidewireAutomate_waitForElement(By Locator, String strExpectedConditions, String strExpectedValue)
			throws Throwable {

		boolean bExpectedConditions = false;

		switch (strExpectedConditions) {

		case "alertIsPresent":
			oWebDriverWait.until(ExpectedConditions.alertIsPresent());
			break;

		case "frameToBeAvailableAndSwitchToIt":
			oWebDriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Locator));
			break;

		case "elementToBeSelected":
			oWebDriverWait.until(ExpectedConditions.elementToBeSelected(Locator));
			break;

		case "elementToBeClickable":
			oWebDriverWait.until(ExpectedConditions.elementToBeClickable(getElement(Locator)));
			break;

		case "visibilityOfElementLocated":
			oWebDriverWait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
			break;

		case "visibilityOfAllElementsLocatedBy":
			oWebDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
			break;

		case "visibilityOf":
			oWebDriverWait.until(ExpectedConditions.visibilityOf(getElement(Locator)));
			break;

		case "invisibilityOfElementLocated":
			oWebDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
			break;

		case "titleContains":
			// oWebDriverWait.until(ExpectedConditions.titleContains(strExpectedValue));
			break;

		default:
			break;
		}
	}

	public void GuidewireAutomate_Validation(String ElementName, By Locator, String strValidation, String Expected)
			throws Throwable {

		boolean bValidation = false;
		String strActual = null;

		try {

			switch (strValidation) {

			case "equals":
				strActual = getText_Element(Locator);
				bValidation = strActual.equalsIgnoreCase(Expected);
				break;
			case "contains":
				// strActual = getElement_Property(Locator, "getText", "");
				strActual = getText_Element(Locator);
				bValidation = strActual.contains(Expected);
				break;
			case "isEmpty":
				bValidation = ElementName.isEmpty();
				break;
			case "isDisplayed":
				bValidation = oWebDriverWait.until(ExpectedConditions.visibilityOf(getElement(Locator))) != null;
				break;
			case "numberOfWindowsToBe":
				bValidation = oWebDriverWait
						.until(ExpectedConditions.numberOfWindowsToBe(Integer.parseInt(strValidation))).booleanValue();
				break;

			case "invisibilityOfElementLocated":
				bValidation = oWebDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
				break;

			case "titleContains":
				// bValidation =
				// oWebDriverWait.until(ExpectedConditions.titleContains(strExpectedValue));
				break;

			default:
				break;
			}

			LogMsg = ElementName + " => Actual = [" + strActual + "] " + strValidation + " Expected = [" + Expected
					+ "]";

			if (bValidation) {
				oExtentTest.log(Status.PASS, LogMsg);
			} else {
				oExtentTest.log(Status.FAIL, LogMsg);
			}

		} catch (Exception e) {
			LogMsg = ElementName + " =  [" + ElementName.toString() + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

	}

	public String getElement_Property(By Locator, String Property, String PropertyName) throws Throwable {

		strValue = null;

		switch (Property) {

		case "getAttribute":
			strValue = getElement(Locator).getAttribute(PropertyName);
		case "getCssValue":
			strValue = getElement(Locator).getCssValue(PropertyName);
		case "getTagName":
			strValue = getElement(Locator).getTagName();
		case "getText":
			strValue = getText_Element(Locator);
		case "getSize":
			strValue = getElement(Locator).getSize().toString();
		default:
			break;
		}
		return strValue;

	}

	public static void robotkey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ESCAPE);
	}

	/*
	 * Browwser
	 */
	public void switchAllWindow() {

		// It will return the parent window name as a Strings
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());

				// driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());

	}

	public void switchChildBrowser() {

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println("switchChildBrowser getTitle =  " + driver.getTitle());
			}
		}

		driver.switchTo().defaultContent();
	}

	public int switchChildBrowserIndex() {

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println("switchChildBrowser getTitle =  " + driver.getTitle());
			}
		}

		driver.switchTo().defaultContent();
		return 1;
	}

	public void openBrowserCount() {

		Set<String> allWindowHandles = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);

		// ArrayList<String> tabs = new ArrayList<String>
		// (robot.getWebDriver().getWindowHandles());

		System.out.println("No. of tabs: " + tabs.size());

	}

	/*
	 * Not Required
	 */
	public String getText_Element(By Locator) throws Throwable {
		return getElement(Locator).getText();
	}

	public String getText_ElementWait(By Locator) throws Throwable {
		WebElement we = getElement(Locator);
		oWebDriverWait.until(ExpectedConditions.visibilityOf(we));
		oJavascriptExecutor.executeScript("arguments[0].scrollIntoView();", we);

		String stetemp = we.getText();
		System.out.println(stetemp);
		oExtentTest.log(Status.INFO, stetemp);
		return stetemp;
	}

	public void scrollUpToElement(WebElement element) {

		oJavascriptExecutor.executeScript("window.scrollBy(0,0)");
		oJavascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);

	}

	public void gwAssertEquals(By Locator, String strExpected) throws Throwable {
		String strActual = getText_Element(Locator);
		LogMsg = "Actual Value = [" + strActual + "] 	Expected Value = [" + strActual + "]";
		System.out.println(LogMsg);
		Assert.assertEquals(strActual, strExpected);

		if (strActual.equalsIgnoreCase(strExpected)) {
			oExtentTest.log(Status.PASS, LogMsg);
		} else {
			oExtentTest.log(Status.FAIL, LogMsg);
			throw new Exception(LogMsg);
		}
	}

	public void gwVerifyEquals(By Locator, String strExpected) throws Throwable {
		String strActual = getText_Element(Locator);
		LogMsg = "Actual Value = [" + strActual + "] 	Expected Value = [" + strActual + "]";
		System.out.println(LogMsg);
		Verify.verify(true, strActual, 0);

		if (strActual.equalsIgnoreCase(strExpected)) {
			oExtentTest.log(Status.PASS, LogMsg);
		} else {
			oExtentTest.log(Status.FAIL, LogMsg);
			throw new Exception(LogMsg);
		}
	}

	public static void waitForElementPresent(WebElement Element) {
		try {
			oWebDriverWait.until(ExpectedConditions.visibilityOf(Element));
		} catch (Exception e) {
			System.out.println("Exception in waitForElementPresent");
			e.printStackTrace();
		}
	}

}
