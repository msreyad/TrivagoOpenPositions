package com.trivago.tests;


import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trivago.basetest.BaseTest;
import com.trivago.pages.OpenPostionsPage;

public class TrivagoScenarios extends BaseTest {

	@Test
	public void trivagoOpenPostions_Scenario() {

		OpenPostionsPage lp=new OpenPostionsPage(driver);	
		lp.getCurrentVacanciesUrls();
		String jobTitle = lp.jobTaiteWitH1Tag();
		String jobFamely = lp.jobfamily();
		String experienceLevel = lp.experienceLevel();
		String location = lp.jobLocation();
		String language = lp.jobLanguage();
        Boolean IsApplyButtonHere = lp.IsApplyButtonHere();
		String Whatyoulldo = lp.Whatyoulldo();
		String definitelyNeed = lp.definitelyNeed();
		String loveYouToHave = lp.loveYouToHave();


		Assert.assertTrue(jobTitle.contains("h1"));
		assertNotEquals("", jobFamely);
		assertNotEquals("", experienceLevel);
		assertNotEquals("", location);
		assertNotEquals("", language);
		Assert.assertTrue(IsApplyButtonHere);

		try{
			Assert.assertTrue(Whatyoulldo.contains("> b"));
			}
		catch (Throwable t){
			 System.out.println("(What you’ll do) doesn't has <b> tag, it as <strong>");
			 }

		try{
			Assert.assertTrue(definitelyNeed.contains("> b"));
			}
		catch (Throwable t){
			 System.out.println("(What you’ll definitely need) doesn't has <b> tag, it as <strong>");
			 }
		
		try{
			Assert.assertTrue(loveYouToHave.contains("> b"));
			}
		catch (Throwable t){
			 System.out.println("(What we’d love you to have ) doesn't has <b> tag, it as <strong>");
			 }
}
}
