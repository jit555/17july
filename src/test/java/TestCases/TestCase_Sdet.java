package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage_Sdet;

public class TestCase_Sdet extends BaseClass_Sdet{

	 @Test
	public void loginTest()
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage_Sdet lp=new LoginPage_Sdet(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		
		/*if(driver.getTitle().equals("GTPL Bank Home Page"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}*/
	}
}
