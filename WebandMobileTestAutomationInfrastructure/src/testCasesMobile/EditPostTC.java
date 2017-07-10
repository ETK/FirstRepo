package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.PostPage;

//Edit the post
public class EditPostTC {

	HomePage hp = new HomePage();
	PostPage pp = new PostPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on context menu
		pp.tapPostContext(main.main.elementProp.getProperty("postcontext"));
		
		//Step 2 : Tap on edit option
		pp.tapEditOption(main.main.elementProp.getProperty("editpost"),main.main.elementProp.getProperty("editpostclassindex"));
		
		//Step 3 : Edit the post
		pp.enterEditPost(main.main.elementProp.getProperty("posttext"), main.main.dataProp.getProperty("postmessageedit"));
	
		//Step 4 : Tap on edit option
		pp.saveEditPost(main.main.elementProp.getProperty("savepost"));
		
		//Step 5 : verify edit post
		result = pp.verifyEditPost(main.main.elementProp.getProperty("postmessageedit"),main.main.dataProp.getProperty("postmessageedit"));
		
    	//Step 6 : Store Result
    	if(result) return true;
		return false;
	}
}
