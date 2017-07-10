package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Page Object Model for Home page

public class HomePage {
	
	//Verify if Search bar is loaded
	public boolean verifySearchBarLoad(String id, int time){

    	return AppiumFunctions.explicitWaitForElement(id, time);
	}
	
	//Tap on search
	public void tapSearch(String id){

    	AppiumFunctions.clickid(id);
	}
	
	//Hit Back
	public void navigateToPreviousPage(){

	    AppiumFunctions.hitBack();
	}
		
	//Tap on profile button
	public void tapProfileButton(String id){

    	AppiumFunctions.clickid(id);
	}
	
	//Tap on post button
	public void tapPost(String id){

	   	AppiumFunctions.clickid(id);
	}
	
	//Tap on like post button
	public void tapLikePost(String id){

	   	AppiumFunctions.clickid(id);
	}
		
	//Tap on comment button
	public void tapComment(String id){

	   	AppiumFunctions.clickid(id);
	}
	
	//Verify if post is shown
	public boolean verifyPost(String id, int time){

	   	return AppiumFunctions.explicitWaitForElement(id, time);
	}
	
	//Verify if post is liked
	public boolean verifyLikePost(String id, String value){

	   	return AppiumFunctions.verifyTextOfElementbyId(id, value);
	}
	
	//Verify if post is deleted
	public boolean verifyDeletePost(String id, int time){

	   	return AppiumFunctions.explicitWaitForElement(id, time);
	}
	
}
