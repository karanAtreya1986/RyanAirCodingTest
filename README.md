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










