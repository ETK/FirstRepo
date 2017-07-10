package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Page Object Model for Profile page

public class ProfilePage {
	
	//Verify if Search bar is loaded
	public boolean verifySettingsButtonLoad(String id, int time){

    	return AppiumFunctions.explicitWaitForElement(id, time);
	}
	
	//Tap on profile settings
	public void tapProfileSetting(String id){

	    AppiumFunctions.clickid(id);
	}
	
	//Tap on profile settings
	public void tapCommunicataions(String className, String index){

	    AppiumFunctions.clickClassName(className, Integer.parseInt(index));
	}
	
	//Verify if Search bar is loaded
	public boolean verifySignoutButtonLoad(String name, int time){

	   return AppiumFunctions.explicitWaitForElementName(name, time);
	}
	
	//Tap on profile settings
	public void tapSignOut(String className, String index){

	    AppiumFunctions.clickClassName(className, Integer.parseInt(index));
	}
	
}
