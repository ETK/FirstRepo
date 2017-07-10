package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Page Object Model for Landing page

public class LandingPage {
	
	//Tap on Gender field
	public boolean VerifySignInLinkLoad(String id, int time){

		return AppiumFunctions.explicitWaitForElement(id, time);
	}
	
	//Tap on sign in link
	public void tapSignIn(String id){

    	AppiumFunctions.clickid(id);
	}
	
	
}
