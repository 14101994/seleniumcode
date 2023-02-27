package com.StepDefination;

import com.BaseLayerPractice.baseClassPractice;
import com.PageLayerPractice.fbLogin;
import com.UtilsPractice.ExcelReaderfb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationPractice extends baseClassPractice{
	fbLogin login;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	 baseClassPractice.initilisation();
	}
	
	
	@When("user enter firstname lastname")
	public void user_enter_firstname_lastname() {
	   login = new fbLogin();
	   
	   ExcelReaderfb obj = new ExcelReaderfb("C:\\Users\\Admin.DESKTOP-31QM75N\\eclipse-workspaceNew\\ZpracticeBBDCucumber\\src\\main\\java\\com\\TestDataPractice\\TestData.xlsx");
	   String fname =  obj.getData(0, 1, 0);
	   login.enterFirstName(fname);
	   String lname = obj.getData(0, 1, 1);
	   login.enterLastName(lname);
	}

}
