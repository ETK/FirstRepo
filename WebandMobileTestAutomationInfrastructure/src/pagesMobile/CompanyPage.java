package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Page Object Model for Company page

public class CompanyPage {
	
	//Verify if Company name is searched
	public boolean verifyCompanyPageOpen(String id, int time){

	    return AppiumFunctions.explicitWaitForElement(id,time);
	}
	
	//Verify if Company name is searched
	public void wait(int time){

	    AppiumFunctions.waitPeriod(time);
	}
	
	//Tap on following (unfollow)
	public void tapFollowingUnfollow(String id){

	    AppiumFunctions.clickid(id);
	}
	
	//Verify if Company name is searched
	public boolean verifyUnfollowed(String id, int time){

	    return AppiumFunctions.explicitWaitForElement(id,time);
	}
	
}
