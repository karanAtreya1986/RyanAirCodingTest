# RyanAirCodingTest
Below is the sample project structure:

Config file reader class will read the properties from the configuration file.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/1619a4fa-a8b7-429d-83ef-55384656e458)

Enums package contains two classes-
Driver Type - This will have the list of all browser names.
Environment Type - This will have the list of environment names.
This enum package is used bu dataProviders -> ConfigFileReader to call the correct browser and environment.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/f67a6155-63dc-49ab-a5ae-fd883bc9ee8f)

Then we have the managers package.
It contains three files-
FileReaderManager - which will read instantiate the config file reader if not done, else if it is instantiated return the object of that class.
PageObjectManager - which will instantiate the individual page classes if not done, else if it is instantiated return the object of that class.
WebDriverManager - this is for driver management. This will get the environment details, browser on where to run the code. If the driver is not created, create a new one. Maximise the window. Close the browser.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/90698d13-7da4-4ce4-bca8-38d9c7f76094)

We have the pageObjects package which contain two classes-
HomePage.java - all locators of home page and the methods in homepage
SelectDesiredFlights.java - all locators of select flight page and the methods in select flights page.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/5f03adaf-7d2a-44ea-b7f0-9c3a9f063008)

We have the cucumber package which contains the class TestContext.java.
This is basically to maintain the same context of webdriver and page objects when traversing multiple step definition files, to avoid null pointer exceptions.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/faa4ede9-e451-4586-82d5-88d159ba4b5b)

Runners package contains the runner file to run the E2E scenarios.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/ba2a455e-96da-4767-9d2c-926a8fb702e1)

















