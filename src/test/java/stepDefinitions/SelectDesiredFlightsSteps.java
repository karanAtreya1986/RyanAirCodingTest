package stepDefinitions;

import org.junit.Assert;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SelectDesiredFlights;

public class SelectDesiredFlightsSteps {

	TestContext testContext;
	SelectDesiredFlights selectDesiredFlights;

	/**
	 * Constructor using TestContext and initializing selectDesiredFlights object if
	 * not done.
	 * 
	 * @param context
	 */
	public SelectDesiredFlightsSteps(TestContext context) {
		testContext = context;
		selectDesiredFlights = testContext.getPageObjectManager().getSelectDesiredFlightsPage();
	}

	/**
	 * All feature files converted to step definitions below.
	 * 
	 * @param flightSelectionPageTitle
	 */
	@Then("user is navigated to flight selection page with Page Title as {string}")
	public void user_is_navigated_to_flight_selection_page_with_page_title_as(String flightSelectionPageTitle) {
		String title = selectDesiredFlights.getTitle();
		org.junit.Assert.assertTrue(title.contains(flightSelectionPageTitle));
	}

	@When("user clicks on the first flight")
	public void user_clicks_on_the_first_flight() throws InterruptedException {
		// SelectDesiredFlights selectFlights=new SelectDesiredFlights(driver);
		selectDesiredFlights.clickFirstFlight();
	}

	@When("user clicks on the second flight")
	public void user_clicks_on_the_second_flight() throws InterruptedException {
		// SelectDesiredFlights selectFlights=new SelectDesiredFlights(driver);
		selectDesiredFlights.clickSecondFlight();
	}

	@When("user clicks on Continue with Basic Fare")
	public void user_clicks_on_continue_with_basic_fare() throws InterruptedException {
		selectDesiredFlights.clickOnBasicFare();
	}

	@When("user accepts the basic fare on the pop up")
	public void user_accepts_the_basic_fare_on_the_pop_up() throws InterruptedException {
		selectDesiredFlights.acceptBasicFare();
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_Login_Button() throws InterruptedException {
		selectDesiredFlights.clickLoginButton();
	}

	@When("verify if the Login window contains the String {string}")
	public void verify_if_the_login_window_contains_the_string(String expectedMessage) throws InterruptedException {
		String messageDetails = selectDesiredFlights.getTextFromLogin();
		Assert.assertTrue(messageDetails.contains(expectedMessage));
	}

}
