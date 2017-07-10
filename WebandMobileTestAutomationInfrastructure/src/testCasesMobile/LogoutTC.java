package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.LandingPage;
import pagesMobile.ProfilePage;

//Logout to Linkedin
public class LogoutTC {

	HomePage hp = new HomePage();
	ProfilePage pp = new ProfilePage();
	LandingPage lp = new LandingPage();
	
	boolean result;
	
	public boolean execute(){

		//Step 1 : Tap Sign in link
		hp.tapProfileButton(main.main.elementProp.getProperty("profile"));
		
		//step 2 : Tap on profile settings	
		pp.verifySettingsButtonLoad(main.main.elementProp.getProperty("profilesettings"), 20);
    	pp.tapProfileSetting(main.main.elementProp.getProperty("profilesettings"));
    	
    	//step 3 : Tap on communications	
    	pp.tapCommunicataions(main.main.elementProp.getProperty("communications"),main.main.elementProp.getProperty("communicationsclassindex"));
    	
    	//step 4 : Tap on sign out	
    	pp.tapSignOut(main.main.elementProp.getProperty("signout"),main.main.elementProp.getProperty("signoutclassindex"));
    	
    	//step 5 : Verify if SignIn link has loaded		
    	result=lp.VerifySignInLinkLoad(main.main.elementProp.getProperty("signinlink"), 20);
		
    	//Step 6 : Store Result
    	if(result) return true;
		return false;
	}
}
