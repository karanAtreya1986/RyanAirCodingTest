package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.SelectDesiredFlights;

public class PageObjectManager {

	public WebDriver driver;

	private HomePage homePage;

	private SelectDesiredFlights selectDesiredFlightsPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Initializes the homePage if not done, else returns the object of homePage class
	 * @return HomePage
	 */
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	/**
	 * Initializes the selectDesiredFlights if not done, else returns the object of selectDesiredFlights class
	 * @return SelectDesiredFlights
	 */
	public SelectDesiredFlights getSelectDesiredFlightsPage() {
		return (selectDesiredFlightsPage == null) ? selectDesiredFlightsPage = new SelectDesiredFlights(driver) : selectDesiredFlightsPage;
	}

}
