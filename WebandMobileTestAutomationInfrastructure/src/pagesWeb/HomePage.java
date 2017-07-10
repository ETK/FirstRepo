package pagesWeb;

import webDriverFunctions.WebdriverFunctions;

//Page Object Model for Home page
public class HomePage {
	
	//Open the Home page
	public void openPage(String url){
	   	
    	WebdriverFunctions.openPage(url);
	}
	
	//Verify if Home Page has loaded
	public boolean verifyHomePageLoad(String text){
		
    	WebdriverFunctions.verifyText(text);
    	return true;
	}
	
	//Select Bangalore City
	public void selectCity(String ObjectID){
		
		if(WebdriverFunctions.verifyElementPresent(ObjectID))WebdriverFunctions.clickXpath(ObjectID);
	}

	//Type desired location
	public void enterLocation(String ObjectID,String value){
		
		WebdriverFunctions.type(ObjectID, value);
	}
	
	//Hit search button
	public void hitSearch(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}	
	
}
