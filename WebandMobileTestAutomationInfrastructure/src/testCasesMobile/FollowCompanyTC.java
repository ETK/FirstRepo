package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.SearchPage;

//Follow company
public class FollowCompanyTC {

	HomePage hp = new HomePage();
	SearchPage sp = new SearchPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on search
		sp.tapContextMenu(main.main.elementProp.getProperty("contextmenu"));
		
		//Step 2 : Hit follow
		sp.tapFollow(main.main.elementProp.getProperty("follow"));
		
		//Step 3 : Verify followed
		sp.wait(5000);
		sp.tapContextMenu(main.main.elementProp.getProperty("contextmenu"));
		result = sp.verifyFollowed(main.main.elementProp.getProperty("follow"),main.main.dataProp.getProperty("followed"));
		sp.dismissPopUp(main.main.elementProp.getProperty("framelayout"));
	
    	//Step 4 : Store Result
    	if(result) return true;
		return false;
	}
}
