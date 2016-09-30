package com.voonik.po;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePO {
	
	WebDriver driver = null;
	public HomePO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Log In')]")
	private WebElement eleLoginLink;
	public WebElement getEleLoginLink(){
		return eleLoginLink;
	}
	
	@FindBy(id="google_auth")
	private WebElement eleGooglePlus;
	public WebElement getEleGooglePlus(){
		return eleGooglePlus;
	}
	
	@FindBy(id="Email")
	private WebElement eleEmailTextField;
	public WebElement getEleEmailTextField(){
		return eleEmailTextField;
	}
	
	@FindBy(id="Passwd")
	private WebElement elePwdTextField;
	public WebElement getElePwdTextField(){
		return elePwdTextField;
	}
	
	@FindBy(xpath="//p[text()='Nandini Pradeep']")
	private WebElement verifyUserLogin;
	public WebElement getVerifyUserLogin(){
		return verifyUserLogin;
	}
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]/../../../preceding-sibling::div/input[@id='user_email']")
	private WebElement eleNativeEmailText;
	public WebElement getEleNativeEmailTextField(){
		return eleNativeEmailText;
	}
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]/../../../preceding-sibling::div/input[@id='user_password']")
	private WebElement eleNativePwdTextField;
	public WebElement getEleNativePwdTextField(){
		return eleNativePwdTextField;
	}
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]/../../../following-sibling::div")
	private WebElement eleSubmitBtn;
	public WebElement getEleSubmitBtn(){
		return eleSubmitBtn;
	}
	
	public void loginViaGooglePlus() {
		getEleLoginLink().click();
		getEleGooglePlus().click();
		getEleEmailTextField().sendKeys("nandinideepu09@gmail.com");
		getEleEmailTextField().sendKeys(Keys.ENTER);
		getElePwdTextField().sendKeys("nandinipranava3030");
		getElePwdTextField().sendKeys(Keys.ENTER);
	}
	
	public void loginViaEmailId() throws InterruptedException {
		getEleLoginLink().click();
		Thread.sleep(2000);
		getEleNativeEmailTextField().sendKeys("nandinideepu09@gmail.com");
		getEleNativePwdTextField().sendKeys("nandinipranava3030");
		getEleSubmitBtn().click();
		
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	private WebElement eleForgotPasswordLink;
	public WebElement getEleForgotPasswordLink(){
		return eleForgotPasswordLink;
	}
	
	@FindBy(xpath="//p[contains(text(),'Enter')]/../following-sibling::div/form/div/input[@id='user_email']")
	private WebElement eleForgEmailText;
	public WebElement getEleForgEmailText(){
		return eleForgEmailText;
	}
	
	@FindBy(xpath="//p[contains(text(),'Enter')]/../following-sibling::div/form/div/button")
	private WebElement eleForgSubmit;
	public WebElement getEleForgSubmit(){
		return eleForgSubmit;
	}
	
	@FindBy(xpath="//div[contains(text(),'We have sent you a link')]")
	private WebElement eleForgMessage;
	public WebElement getEleForgMessage(){
		return eleForgMessage;
	}
	

}
