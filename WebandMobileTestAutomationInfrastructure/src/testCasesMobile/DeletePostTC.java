package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.PostPage;

//Delete the post
public class DeletePostTC {

	HomePage hp = new HomePage();
	PostPage pp = new PostPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on context menu
		pp.tapPostContext(main.main.elementProp.getProperty("postcontext"));
		
		//Step 2 : Tap on delete option
		pp.tapDeleteOption(main.main.elementProp.getProperty("deletepost"),main.main.elementProp.getProperty("deletepostclassindex"));
		
		//Step 3 : Tap on delete Confirmation
		pp.tapDeleteConfirmation(main.main.elementProp.getProperty("deletepostconfirm"));
		
		//Step 4 : verify delete post
		result = hp.verifyDeletePost(main.main.elementProp.getProperty("profile"),20);
		
    	//Step 5 : Store Result
    	if(result) return true;
		return false;
	}
}
