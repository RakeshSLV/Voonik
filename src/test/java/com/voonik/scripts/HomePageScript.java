package com.voonik.scripts;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.voonik.library.BaseLib;
import com.voonik.po.HomePO;

public class HomePageScript extends BaseLib {
	
HomePO homePo = null;
	
	@Test(priority=1,enabled=false)
	public void loginViagooglePlus() 
	{
		homePo=new HomePO(driver);
		try
		{
		
			driver.get("Http://voonik.com");
			homePo.loginViaGooglePlus();
			Assert.assertEquals(homePo.getVerifyUserLogin().getText(), "Nandini Pradeep");
			System.out.println("User is Logged In and Verified User Name");
		}
		catch(AssertionError e)
		{
			throw e;
		}
	}
	
	@Test(priority=1,enabled=true)
	public void loginViaEmailId() throws InterruptedException {
		homePo=new HomePO(driver);
		try{
			driver.get("Http://voonik.com");
			homePo.loginViaEmailId();
			Assert.assertEquals(homePo.getVerifyUserLogin().getText(), "Nandini Pradeep");
			System.out.println("User is Logged In and Verified User Name");
		}
		catch(AssertionError e)
		{
			throw e;
		}
		
	}
	
	@Test(enabled=false)
	public void Login_ForgotPassword() throws InterruptedException{
		homePo=new HomePO(driver);
		try{
			driver.get("Http://voonik.com");
			homePo.getEleLoginLink().click();
			homePo.getEleForgotPasswordLink().click();
			homePo.getEleForgEmailText().sendKeys("nandinideepu09@gmail.com");
			homePo.getEleForgSubmit().click();
			Thread.sleep(2000);
			System.out.println(homePo.getEleForgMessage().getText());
			Assert.assertTrue(homePo.getEleForgMessage().getText().contains("We have sent you a link"));
			System.out.println("Message Verified");
		}
		catch(AssertionError e)
		{
			throw e;
		}
	}
	

}
