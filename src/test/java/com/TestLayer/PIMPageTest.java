package com.TestLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.PageLayer.PIMPage;

import junit.framework.Assert;

public class PIMPageTest extends BaseClass {
	

	@BeforeClass
	public void setup() {
		BaseClass.intialization();
	}

     @Test(priority=1)
     public void validateLoginFunctionality() {
    	 Assert.assertEquals(driver.getTitle().contains("HRM"), true);
    	 Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
	
}

    @Test(priority=2)
    public void Login() {
    	LoginPage loginpage = new LoginPage();
    	 loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority=3)
    public void validateTotalEmployeeInPIMPage() {
    	
    	PIMPage pimpage = new PIMPage();
    	pimpage.CountEmployee();
    	
    }

}
