package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage {

	public WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	/**
	 * Locators for the homepage
	 */

	@FindBy(how = How.XPATH, using = "//*[@id='cookie-popup-with-overlay']/div/div[3]/button[2]")
	public WebElement clickOnAcceptCookiesLocator;

	@FindBy(how = How.XPATH, using = "//input[@id='input-button__departure']")
	public WebElement clickOnDepartureCityDropDownLocator;

	@FindBy(how = How.XPATH, using = "//ry-counter[@data-ref='passengers-picker__teens']//div[@class='counter__button-wrapper--enabled']")
	public WebElement clickOnPlusInTeenPassengerLocator;

	@FindBy(how = How.XPATH, using = "//div[@class='_background']")
	public WebElement clickOnAcceptTermsAndAgreementLocator;

	@FindBy(how = How.XPATH, using = "//button[@aria-label='Search']")
	public WebElement clickOnSearchButtonLocator;

	/**
	 * Constructor for the homepage
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	/**
	 * Go to the url
	 */
	public void goToHomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	/**
	 * Click accept cookies which comes when page is loaded
	 */
	public void clickAcceptCookies() {
		clickOnAcceptCookiesLocator.click();
	}

	/**
	 * Click on departure city
	 */
	public void clickDepartureCityDrop() {
		clickOnDepartureCityDropDownLocator.click();
		clickOnDepartureCityDropDownLocator.clear();
	}

	/**
	 * Pass in the country name in departure. Used dynamic xpath so that tomorrow if
	 * we want to change the country name it becomes easy.
	 * 
	 * @param countryName
	 */
	public void selectDepartureCountryOfAirport(String countryName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[normalize-space()= '" + countryName + "']")).click();
	}

	/**
	 * Pass in the city name in departure. Used dynamic xpath so that tomorrow if we
	 * want to change the city name it becomes easy.
	 * 
	 * @param cityName
	 */
	public void selectDepartureCityOfAirport(String cityName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(), '" + cityName.trim() + "')]")).click();
	}

	/**
	 * Pass in the city name in arrival. Used dynamic xpath so that tomorrow if we
	 * want to change the city name it becomes easy.
	 * 
	 * @param cityName
	 */
	public void selectArrivalCityOfAirport(String cityName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(), '" + cityName.trim() + "')]")).click();
	}

	/**
	 * This is to get the month and year from calendar like "November 2023" and then
	 * split them based on space so we get two arrays, one for month name and one
	 * for year.
	 * 
	 * @param monthYearValue
	 * @return Array of strings
	 */
	public String[] getMonthYear(String monthYearValue) {
		return monthYearValue.split(" ");
	}

	/**
	 * Generic function to split the month and year and then select the desired
	 * month which is passed by user.
	 * 
	 * @param expectedDay
	 * @param expectedMonth
	 * @param expectedYear
	 * @throws InterruptedException
	 */
	public void selectDate(String expectedDay, String expectedMonth, String expectedYear) throws InterruptedException {
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("datepicker__calendar")));
		// Thread.sleep(5000);
		String monthYearValue = driver.findElement(By.className("calendar__month-name")).getText();
		while (!(getMonthYear(monthYearValue)[0].trim().equalsIgnoreCase(expectedMonth)
				&& getMonthYear(monthYearValue)[1].trim().equalsIgnoreCase(expectedYear))) {
			driver.findElement(By.xpath("//div[@data-ref='calendar-btn-next-month']")).click();
			monthYearValue = driver.findElement(By.className("calendar__month-name")).getText();
		}
		driver.findElement(By.xpath("//div[text()=' " + expectedDay + " ']")).click();
	}

	/**
	 * Selected teen passengers
	 */
	public void clickOnPlusInTeenPassenger() {
		clickOnPlusInTeenPassengerLocator.click();
	}

	/**
	 * Select accept terms and agreement checkbox
	 */
	public void clickAcceptTermsAndAgreement() {
		clickOnAcceptTermsAndAgreementLocator.click();
	}

	/**
	 * Click on the search button
	 * 
	 * @return SelectDesiredFlights
	 */
	public SelectDesiredFlights clickOnSearchButton() {
		clickOnSearchButtonLocator.click();
		SelectDesiredFlights selectFlights = new SelectDesiredFlights(driver);
		return selectFlights;
	}

}
