package managers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String EDGE_DRIVER_PROPERTY = "webdriver.edge.driver";

	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	}

	/**
	 * Gets the driver if created, else creates a new driver
	 * @return WebDriver
	 */
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
	
	/**
	 * Creates driver if not done
	 * @return WebDriver
	 */
	private WebDriver createDriver() {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}
	
	/**
	 * Creates remote webdriver, but not implementing it now
	 * @return WebDriver
	 */
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}

	/**
	 * Creates local driver to run on local machine
	 * @return WebDriver
	 */
	private WebDriver createLocalDriver() {
        switch (driverType) {	    
        case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
        	driver = new ChromeDriver();
    		break;
        case EDGE : 
        	//System.setProperty(EDGE_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
        	System.setProperty(EDGE_DRIVER_PROPERTY, System.getProperty("user.dir") + "//BrowserDrivers/msedgedriver.exe");
        	driver = new EdgeDriver();
        	EdgeOptions options=new EdgeOptions();
        	options.addArguments("--disable-notifications");
        	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        	options.addArguments("ignore-certificate-errors");
    		break;
        }
        
        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}	

	/**
	 * Closing driver instance once done
	 */
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
