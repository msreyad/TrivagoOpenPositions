package com.trivago.basetest;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.trivago.deiver.Browser;
import com.trivago.utilities.Utilities;


public class BaseTest {
	protected WebDriver driver;
	private String browserName;
	private String url;
	private Browser browser = new Browser();

	@BeforeMethod
	public void setup() {
		Map<String, String> applicationData = Utilities.getApplicationData();
		browserName = applicationData.get("Browser");
		url = applicationData.get("Url");
		driver = browser.getDriver(browserName);
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
