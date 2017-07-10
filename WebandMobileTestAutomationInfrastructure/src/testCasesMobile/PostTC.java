package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.PostPage;

//Add a post
public class PostTC {

	HomePage hp = new HomePage();
	PostPage pp = new PostPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on post
		hp.tapPost(main.main.elementProp.getProperty("post"));
		
		//Step 2 : Type a post
		pp.enterPost(main.main.elementProp.getProperty("posttext"), main.main.dataProp.getProperty("postmessage"));
		
		//Step 3 : hit post
		pp.tapPostButton(main.main.elementProp.getProperty("postbutton"));
		
		//Step 4 : verify post
		result = hp.verifyPost(main.main.elementProp.getProperty("likepost"),20);
	
    	//Step 5 : Store Result
    	if(result) return true;
		return false;
	}
}
