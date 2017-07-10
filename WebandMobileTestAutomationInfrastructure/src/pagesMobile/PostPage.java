package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Page Object Model for Post page

public class PostPage {
	
	//Enter a post
	public void enterPost(String id, String input){

	   	AppiumFunctions.sendKeys(id, input);
	}

	//Tap on post button
	public void tapPostButton(String id){

	   	AppiumFunctions.clickid(id);
	}
	
	//Type a comment
	public void typeComment(String id, String value){

	   	AppiumFunctions.sendKeys(id, value);
	}
	
	//Tap on comment button
	public void tapCommentButton(String id){

		AppiumFunctions.clickid(id);
	}
	
	//Tap on post context menu
	public void tapPostContext(String id){

		AppiumFunctions.clickid(id);
	}
	
	//Tap on edit option
	public void tapEditOption(String className, String index){

		AppiumFunctions.clickClassName(className, Integer.parseInt(index));
	}
	
	//enter edited post
	public void enterEditPost(String id, String value){

	   	AppiumFunctions.sendKeys(id, value);
	}
	
	//Tap on save button
	public void saveEditPost(String id){

		AppiumFunctions.clickid(id);
	}
	
	//Tap on delete option
	public void tapDeleteOption(String className, String index){

		AppiumFunctions.clickClassName(className, Integer.parseInt(index));
	}
	
	//Tap on delete confirmation
	public void tapDeleteConfirmation(String id){

		AppiumFunctions.clickid(id);
	}
	
	//Verify if post is shown
	public boolean verifyComment(String id, int time){

	   	return AppiumFunctions.explicitWaitForElement(id, time);
	}
	
	//Verify if post is shown
	public boolean verifyEditPost(String id, String value){

	   	return AppiumFunctions.verifyTextOfElementbyId(id, value);
	}
	
}
