package com.trivago.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenPostionsPage {
	protected WebDriver driver;
	private WebDriverWait wait ;
	private static Logger Log = Logger.getLogger(OpenPostionsPage.class.getName());

	public OpenPostionsPage(WebDriver driver) {
		this.driver = driver;
		wait =new WebDriverWait(driver,60);
		
	}
	
	
	public void getCurrentVacanciesUrls()
	{
		DOMConfigurator.configure("log4j.xml");
		Log.info("*************************************************************");
		Log.info("                     get Current Vacancies Urls                        ");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"list-jobs\"]")));
		WebElement allURLs=driver.findElement(By.xpath("//*[@id=\"list-mobile\"]/tbody"));
		
        List<WebElement> AllCheckBoxes = allURLs.findElements(By.className("list-jobs-wd"));
        int RowCount = AllCheckBoxes.size();
		System.out.println("status code is =>  " + RowCount);

		for (int i=0; i<RowCount;i++){
			
		      System.out.println("job number :"+ i +" " + AllCheckBoxes.get(i).getAttribute("onclick"));
			 Log.info("job number :"+ i +" " + AllCheckBoxes.get(i).getAttribute("onclick"));

		    }
		
		Log.info("                         End of 3.1 task                       ");
		Log.info("*************************************************************");
	}
	
	public String jobTaiteWitH1Tag()
	{
		DOMConfigurator.configure("log4j.xml");
		Log.info("*************************************************************");
		Log.info("                     check if the job title has <h1> tag                        ");

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"list-jobs\"]")));
		WebElement allURLs=driver.findElement(By.xpath("//*[@id=\"list-mobile\"]/tbody"));
		
        List<WebElement> getJObs = allURLs.findElements(By.className("list-jobs-wd"));
		String jobURL = getJObs.get(0).getAttribute("onclick");
		String jobURLAfterAmendment = jobURL.substring(19);
		System.out.println("jobURL is :  " + jobURLAfterAmendment);

		    
		driver.get(jobURLAfterAmendment);
		driver.manage().window().maximize();
		
		String hasH1Tag = "#content > section.maxwidth.maxwidth--screen.common-page.sub-page-head > div > div > div > h1";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content > section.maxwidth.maxwidth--screen.common-page.sub-page-head > div > div > div > h1")));
		WebElement apply=driver.findElement(By.cssSelector("#content > section.maxwidth.maxwidth--screen.common-page.sub-page-head > div > div > div > h1"));
		String text = apply.getText();
		
		
		System.out.println("job title is :  " + text+" and it has <h1> tag");
		Log.info("job title is :  " + text+" and it has <h1> tag");
		 
		Log.info("                         End of 3.2 task                       ");
		Log.info("*************************************************************");

		 return hasH1Tag;
	}
	
	public String jobfamily()
	{
		Log.info("*************************************************************");
		Log.info("                     check if job family is empty                        ");

	
		 WebElement jobfamily=driver.findElement(By.cssSelector("#job_family"));
		 String jobfamilyText = jobfamily.getText();

			System.out.println("job family is :  " + jobfamilyText);
			 Log.info("job family is :" + jobfamilyText);

		
		Log.info("                        End of 3.3 task                        ");
		Log.info("*************************************************************");
		
		 return jobfamilyText;

	}
	
	public String experienceLevel()
	{
		Log.info("*************************************************************");
		Log.info("                     check if experience Level is empty                        ");

	
		 WebElement experienceLevel=driver.findElement(By.cssSelector("#content > section.content.maxwidth.maxwidth--screen.careers > div > div > div.col.g-1of1.g1-1of3.g2-1of4.job-tags.margin-top-32 > p:nth-child(2) > span"));
		 String experienceLevelText = experienceLevel.getText();

			System.out.println("experience Level is :  " + experienceLevelText);
			 Log.info("experience Level is :" + experienceLevelText);

		
		Log.info("                         End of 3.4 task                          ");
		Log.info("*************************************************************");
		
		 return experienceLevelText;

	}
	
	public String jobLocation()
	{
	
		Log.info("*************************************************************");
		Log.info("                     check if job Location is empty                        ");

	
		 WebElement jobLocation=driver.findElement(By.cssSelector("#content > section.content.maxwidth.maxwidth--screen.careers > div > div > div.col.g-1of1.g1-1of3.g2-1of4.job-tags.margin-top-32 > p:nth-child(3) > span"));
		 String jobLocationText = jobLocation.getText();

			System.out.println("job Location is :  " + jobLocationText);
			 Log.info("job Location is :" + jobLocationText);

		
		Log.info("                         End of 3.5 task                          ");
		Log.info("*************************************************************");
		
		 return jobLocationText;

	}
	
	public String jobLanguage()
	{
		Log.info("*************************************************************");
		Log.info("                     check if job Language is empty                        ");

	
	
		 WebElement jobLanguage=driver.findElement(By.cssSelector("#content > section.content.maxwidth.maxwidth--screen.careers > div > div > div.col.g-1of1.g1-1of3.g2-1of4.job-tags.margin-top-32 > p:nth-child(4) > span"));
		 String jobLanguageText = jobLanguage.getText();

			System.out.println("job Language is :  " + jobLanguageText);
			 Log.info("job Language is :" + jobLanguageText);

		
		Log.info("                         End of 3.6 task                           ");
		Log.info("*************************************************************");
		
		 return jobLanguageText;

	}
	
	public Boolean IsApplyButtonHere()
	{
		Log.info("*************************************************************");
		Log.info("                     Is Apply Button Here                        ");

	
	
		 WebElement IsApplyButtonHere=driver.findElement(By.cssSelector("#content > section.content.maxwidth.maxwidth--screen.careers > div > div > div.col.g-1of1.g1-2of3.g1-offset-1of3.g2-1of2.g2-offset-1of4.job-tags.join-or-roles.margin-top-32 > button"));
		 Boolean IsApplyButtonexist = IsApplyButtonHere.isDisplayed();

			System.out.println("Is Apply Button exist :  " + IsApplyButtonexist);
			Log.info("Is Apply Button exist :" + IsApplyButtonexist);

		
		Log.info("                         End of 3.7 task                           ");
		Log.info("*************************************************************");
		
		 return IsApplyButtonexist;

	}

	public String Whatyoulldo()
	{
		Log.info("*************************************************************");
		Log.info("              What you will ll do should have a <b> tag             ");

	
	
		String hasBTag = "#content > section.content.maxwidth.maxwidth--screen.careers > div > div > div.col.g-1of1.g1-2of3.g2-1of2.p_cell.margin--none.margin-top-32 > h3:nth-child(6) > strong";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(hasBTag)));
		WebElement apply=driver.findElement(By.cssSelector(hasBTag));
		String text = apply.getText();
		
	    Boolean isBTagHere =	hasBTag.contains("> b");
		
		System.out.println("(" +text+")"+" and it has <b> tag " + isBTagHere);
		Log.info("(" +text+")"+" and it has <b> tag " + isBTagHere);
		 
		Log.info("                         End of 3.8 task                       ");
		Log.info("*************************************************************");

		 return hasBTag;

	}
	
	public String definitelyNeed()
	{
		Log.info("*************************************************************");
		Log.info("              What you will definitely need should have <b> tag                        ");

	
	
		String hasBTag = "#content > section.content.maxwidth.maxwidth--screen.careers > div > div > div.col.g-1of1.g1-2of3.g2-1of2.p_cell.margin--none.margin-top-32 > h3:nth-child(8) > strong";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(hasBTag)));
		WebElement apply=driver.findElement(By.cssSelector(hasBTag));
		String text = apply.getText();
		
         Boolean isBTagHere =	hasBTag.contains("> b");
		
		System.out.println("(What you’ll definitely need) and it has <b> tag " + isBTagHere);
		Log.info("(What you’ll definitely need) and it has <b> tag " + isBTagHere);
		 
		Log.info("                         End of 3.9 task                       ");
		Log.info("*************************************************************");

		 return hasBTag;

	}
	
	public String loveYouToHave()
	{
		Log.info("*************************************************************");
		Log.info("             What we would love you to have should have <b> tag                        ");

	
	
		String hasBTag = "#content > section.content.maxwidth.maxwidth--screen.careers > div > div > div.col.g-1of1.g1-2of3.g2-1of2.p_cell.margin--none.margin-top-32 > h3:nth-child(10) > strong";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(hasBTag)));
		WebElement apply=driver.findElement(By.cssSelector(hasBTag));
		String text = apply.getText();
		
         Boolean isBTagHere =	hasBTag.contains("> b");
		
		System.out.println("(" +text+")"+" and it has <b> tag " + isBTagHere);
		Log.info("(" +text+")"+" and it has <b> tag " + isBTagHere);
		 
		Log.info("                         End of 3.10 task                       ");
		Log.info("*************************************************************");

		 return hasBTag;

	}
}
