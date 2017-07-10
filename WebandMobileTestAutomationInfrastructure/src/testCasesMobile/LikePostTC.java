package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.PostPage;

//Like the post
public class LikePostTC {

	HomePage hp = new HomePage();
	PostPage pp = new PostPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on like post
		hp.tapLikePost(main.main.elementProp.getProperty("likepost"));
		
		//Step 2 : verify like post
		result = hp.verifyLikePost(main.main.elementProp.getProperty("unlikepost"),main.main.dataProp.getProperty("like"));
	
    	//Step 3 : Store Result
    	if(result) return true;
		return false;
	}
}
