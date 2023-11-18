package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {

	TestContext testContext;
	HomePage homePage;

	/**
	 * Constructor using TestContext and initializing homePage object if not done.
	 * 
	 * @param context
	 */
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	/**
	 * All feature files converted to step definitions below.
	 */
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		homePage.goToHomePage();
	}

	@When("user clicks From")
	public void user_clicks_from() {
		homePage.clickAcceptCookies();
		homePage.clickDepartureCityDrop();
		homePage.selectDepartureCountryOfAirport("France");
		homePage.selectArrivalCityOfAirport("Clermont");
	}

	@When("user clicks To")
	public void user_clicks_to() {
		homePage.selectDepartureCityOfAirport("Porto");
	}

	@When("user selects from date")
	public void user_selects_from_date() throws InterruptedException {
		homePage.selectDate("4", "December", "2023");
	}

	@When("user selects return date")
	public void user_selects_return_date() throws InterruptedException {
		homePage.selectDate("11", "December", "2023");
	}

	@When("user selects number of passengers")
	public void user_selects_number_of_passengers() {
		homePage.clickOnPlusInTeenPassenger();
	}

	@When("user accepts the terms and agreement")
	public void user_accepts_the_terms_and_agreement() {
		homePage.clickAcceptTermsAndAgreement();
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		homePage.clickOnSearchButton();
	}

}
