package com.cucumber.framework.helper.genericHelper;


import org.openqa.selenium.WebElement;
import com.cucumber.framework.helper.TestBase.TestBase;


public class GenericHelper{
	


	
	
	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	public boolean isSelected(WebElement element) {
		try {
			element.isSelected();
			
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	public boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			
			return false;
		} catch (Exception e) {
			
			return true;
		}
	}
	
	protected String getDisplayText(WebElement element) {
		if (null == element)
			return null;
		if (!isDisplayed(element))
			return null;
		return element.getText();
	}
	

	public static synchronized String getElementText( WebElement element) {
		if (null == element) {
			
			return null;
		}
		String elementText = null;
		try {
			elementText = element.getText();
		} catch (Exception ex) {
			
		}
		return elementText;
	}
	public static synchronized String getElementTexts( WebElement element) {
		if (null == element) {
			
			return null;
		}
		String elementText = null;
		try {
			elementText = element.getAttribute("value");
			System.out.println("Value is correctly displayed");
		} catch (Exception ex) {
			
		}
		return elementText;
	}

}
