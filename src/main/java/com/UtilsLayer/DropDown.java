package com.UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class DropDown extends BaseClass {
	
	public static void selectByVisibleText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
		
	}

}
