package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	//@FindBy(id="spanMessage")
	//WebElement ErrorMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String uname, String pass) {
		Username.sendKeys(uname);
		Password.sendKeys(pass);
		LoginButton.click();
		//if(ErrorMessage.isDisplayed()==true) {
			//System.out.println(ErrorMessage.getText());
		//}
	}
	
}
