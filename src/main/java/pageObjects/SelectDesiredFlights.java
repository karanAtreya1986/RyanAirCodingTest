package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDesiredFlights {

	public WebDriver driver;

	/**
	 * Locators for the flight selection page
	 */

	@FindBy(how = How.CSS, using = "body > app-root > flights-root > div > div > div > div > flights-lazy-content > flights-summary-container > flights-summary > div > div:nth-child(1) > journey-container > journey > flight-list > ry-spinner > div > flight-card-new > div > div > div.flight-card__summary.ng-tns-c260157839-15.ng-star-inserted > flight-card-summary > div.flight-card-summary__footer.ng-tns-c2051464752-16 > button")
	public WebElement clickFirstFlight;

	@FindBy(how = How.CSS, using = "body > app-root > flights-root > div > div > div > div > flights-lazy-content > flights-summary-container > flights-summary > div > div.inbound.ng-tns-c143892162-4.inbound--unconfirmed > journey-container > journey > flight-list > ry-spinner > div > flight-card-new > div > div > div.flight-card__summary.ng-tns-c260157839-13.ng-star-inserted > flight-card-summary > div.flight-card-summary__footer.ng-tns-c2051464752-14 > button")
	public WebElement clickSecondFlight;

	@FindBy(how = How.XPATH, using = "//div[@class='fare-table__fare-column-border fare-table__fare-column-border--regular']")
	public WebElement clickContinueWithBasicFare;

	@FindBy(how = How.XPATH, using = "//ry-spinner[normalize-space()='Continue with Basic']")
	public WebElement clickAcceptBasicFarePopUp;

	@FindBy(how = How.XPATH, using = "//button[@class='ry-button--full login-touchpoint__login-button ry-button--gradient-blue ry-button--medium']")
	public WebElement clickLoginButton;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Make it simple with myRyanair']")
	public WebElement getTextFromLogin;

	/**
	 * Constructor for the select flights page
	 * 
	 * @param driver
	 */
	public SelectDesiredFlights(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Get the title of the page to verify if we have navigated to this page or not
	 * 
	 * @return String
	 */
	public String getTitle() {
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		String expectedURL = "https://www.ryanair.com/ie/en/trip/flights/select";
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.urlContains(expectedURL));
		return driver.getTitle();
	}

	// Scroll to the bottom of the page using JavaScript
	private static void scrollToEnd(WebDriver driver) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Click on the to flight select button
	 * 
	 * 
	 */
	public void clickFirstFlight() {
		// Thread.sleep(5000);
		new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.elementToBeClickable(clickFirstFlight));
		clickFirstFlight.click();
	}

	/**
	 * Click on the second return flight select button
	 */
	public void clickSecondFlight() {
		// Thread.sleep(5000);
		// new WebDriverWait(driver, Duration.ofSeconds(10))
		// .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/flights-root/div/div/div/div/flights-lazy-content/flights-summary-container/flights-summary/div/div[1]/journey-container/journey/flight-list/ry-spinner/div/flight-card-new/div/div/div[4]/flight-card-summary/div[2]/button")));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1050)", "");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.elementToBeClickable(clickSecondFlight));
		scrollToEnd(driver);
		new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.elementToBeClickable(clickSecondFlight));
		// Thread.sleep(5000);
		clickSecondFlight.click();
	}

	/**
	 * Click on the basic fare option
	 * 
	 *
	 */
	public void clickOnBasicFare() {
		// Thread.sleep(5000);
		scrollToEnd(driver);
		new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.elementToBeClickable(clickContinueWithBasicFare));
		clickContinueWithBasicFare.click();
	}

	/**
	 * Click on the accept basic fare option.
	 * 
	 */
	public void acceptBasicFare() {
		// Thread.sleep(5000);
		scrollToEnd(driver);
		new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.elementToBeClickable(clickAcceptBasicFarePopUp));
		clickAcceptBasicFarePopUp.click();
	}

	/**
	 * Click on the login button
	 * 
	 */
	public void clickLoginButton()  {
		// Thread.sleep(5000);
		scrollToEnd(driver);
		new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.elementToBeClickable(clickLoginButton));
		clickLoginButton.click();
	}

	/**
	 * Get the text from login window and assert if it matches the one we are expecting
	 * @return String
	 */
	public String getTextFromLogin()  {
		// Thread.sleep(5000);
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOf(getTextFromLogin));
		String message = getTextFromLogin.getText();
		return message;
	}

}
