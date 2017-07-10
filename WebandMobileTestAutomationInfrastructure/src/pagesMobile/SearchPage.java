package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Page Object Model for Search page

public class SearchPage {
	
	//Enter company name in search field
	public void enterCompanyNameToSearch(String id, String input){

    	AppiumFunctions.sendKeys(id, input);
	}
	
	//Verify if Company name is searched
	public boolean verifyCompanyNameEntered(String id, String value){

	    return AppiumFunctions.verifyTextOfElementbyId(id,value);
	}
	
	//Tap on companies
	public void tapCompanies(String className, String index){

	    AppiumFunctions.clickClassName(className, Integer.parseInt(index));
	}
	
	//Verify if Company name is loaded
	public boolean verifyCompanyNameLoad(String id, String value){

	    return AppiumFunctions.verifyTextOfElementbyId(id,value);
	}
	
	//Tap on context menu
	public void tapContextMenu(String id){

	    AppiumFunctions.clickid(id);
	}
	
	//Tap on follow
	public void tapFollow(String id){

	    AppiumFunctions.clickid(id);
	}
	
	//Verify if Company name is searched
	public boolean verifyFollowed(String id, String value){

	    return AppiumFunctions.verifyTextOfElementbyId(id,value);
	}
	
	//Verify if Company name is searched
	public void wait(int time){

	    AppiumFunctions.waitPeriod(time);
	}
	
	//Dismiss pop up
	public void dismissPopUp(String id){

	    AppiumFunctions.hitBack();
	}
	
	//Tap on company
	public void tapCompany(String id){

		 AppiumFunctions.clickid(id);
	}
	
}
