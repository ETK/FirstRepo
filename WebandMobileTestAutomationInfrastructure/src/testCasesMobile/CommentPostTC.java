package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.PostPage;

//Comment on post
public class CommentPostTC {

	HomePage hp = new HomePage();
	PostPage pp = new PostPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on comment
		hp.tapComment(main.main.elementProp.getProperty("comment"));
		
		//Step 2 : Type a comment
		pp.typeComment(main.main.elementProp.getProperty("commenttype"),main.main.dataProp.getProperty("commentpost"));
		
		//Step 3 : Tap on comment button
		pp.tapCommentButton(main.main.elementProp.getProperty("commentpost"));
		
		//Step 4 : verify comment post
		result = pp.verifyComment(main.main.elementProp.getProperty("verifycomment"),20);
	
    	//Step 5 : Store Result
    	if(result) return true;
		return false;
	}
	
}
