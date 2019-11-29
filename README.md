TrivagoOpenPositions Test Automation Task

Test script have been written to execute Trivago Open Positions test scenario.

Description of project files :
* Src/main/java :
1- Pages Package : contains the project pages classes that contains methods that run over these pages 
2- Driver Packge: contains the class Browser.java that contains methods related to browser setup and initialization
3- Utilities Package: contains ExcelUtilities.java and Utilities.java classes that contains methods that commonly used to read data from excel and methods that commonly used in test automation projects 
* Src/test/java :
1- Basetest Package: contains BaseTest.java class that contains methods that run before and after the execution of test case
2- Tests Package: contains the test scripts


Resources and .exe files:
1. Seleniumdrivers:This folder contains the chromedriver.exe..and IEDriverServer.exe
2. Conf - This folder contains the property files .
a.application.properties - Contains properties to run scripts on specific URL and specific browser.

Tools:
1- Maven
2- Selenium Webdriver
3- TestNG

Requirements
In order to utilise this project you need to have the following installed locally:
* Maven 3.5
* Chrome browser
* Java 1.8

* Usage
you need to install TestNG in Eclipse if not install yet
https://www.ecanarys.com/Blogs/ArticleID/169/How-to-Install-TestNG-framework-Step-by-Step-installation-process
then 
* navigate to com.trivago.tests.TrivagoScenarios class under scr/test/java  directory and run as:  TestNG test



Reporting
* Logs written into (Log results) file in the root path with all expected and actual rsults.
* expected and actual rsults also has been insetred in the Console.
* Reports  are written into test-output - Default suite - Default test.html after a successful run.

