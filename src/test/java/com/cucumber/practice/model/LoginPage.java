package com.cucumber.practice.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//h1[contains(text(),'Welcome Back')]")
	WebElement header;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement signIn;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(){
		userName.sendKeys("gagankumarjavvaji@gmail.com");
	}
	
	public void enterPassword(){
		password.sendKeys("Anvai@4245");
	}
	
	public String getHeaderTitle(){
		return header.getText();
	}
	
	public void clickSignInButton(){
		signIn.click();
	}
	
}