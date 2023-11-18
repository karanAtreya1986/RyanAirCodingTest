package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	/**
	 * Constructor to confirm that same test context is passed during page url changes.
	 */
	public TestContext(){
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	/**
	 * Get the webdrivermanager object so we can use the methods of that class and manipulate the browsers.
	 * @return WebDriverManager
	 */
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	/**
	 * Get the page object manager object so we can use the methods of that class and manipulate the page objects.
	 * @return PageObjectManager
	 */
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
