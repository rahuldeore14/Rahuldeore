package com.PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.DropDown;

public class PIMPage extends BaseClass {

	@FindBy(xpath="//b[text()='PIM']")
	WebElement PIM;
	
	@FindBy(id="empsearch_employee_status")
	WebElement EmployeeStatus;
	
	@FindBy(id="searchBtn")
	WebElement SearchButton;
	
	@FindBy(tagName="tr")
	List<WebElement> CountTotalEmployee; 
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void CountEmployee() {
		PIM.click();
		DropDown.selectByVisibleText(EmployeeStatus,"Full-Time Permanent");
		SearchButton.click();
		System.out.println(CountTotalEmployee.size());
	}
	
	
}
