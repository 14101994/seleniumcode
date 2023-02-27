package com.PageLayerPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayerPractice.baseClassPractice;

public class fbLogin extends baseClassPractice {
	
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	public fbLogin() {
		PageFactory.initElements(driver, this);
	}
	
	public void  enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}

}
