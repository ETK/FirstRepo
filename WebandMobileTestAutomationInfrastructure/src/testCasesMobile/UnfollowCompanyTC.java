package testCasesMobile;

import pagesMobile.CompanyPage;

//Unfollow company
public class UnfollowCompanyTC {

	CompanyPage cp = new CompanyPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Unfollow Company by clicking on 'following'
		cp.tapFollowingUnfollow(main.main.elementProp.getProperty("following"));
		
		//Step 2 : Verify company unfollowed
		result = cp.verifyUnfollowed(main.main.elementProp.getProperty("unfollowed"),10);

    	//Step 3 : Store Result
    	if(result) return true;
		return false;
	}
}
