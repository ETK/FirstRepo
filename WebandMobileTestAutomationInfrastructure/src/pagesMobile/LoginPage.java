package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Page Object Model for Login page

public class LoginPage {
	
	//Verify if Verify Button is loaded
	public boolean WaitForEmailFieldLoad(String id, int time){

    	return AppiumFunctions.explicitWaitForElement(id, time);
	}
	
	//Enter email in email field
	public void enterEmail(String id, String input){

    	AppiumFunctions.sendKeys(id, input);
	}
	
	//Enter password in password field
	public void enterPassword(String id, String input){

    	AppiumFunctions.sendKeys(id, input);
	}
	
	//Tap on Sign in field
	public void tapSignIn(String id){

    	AppiumFunctions.clickid(id);
	}
	
	
}
