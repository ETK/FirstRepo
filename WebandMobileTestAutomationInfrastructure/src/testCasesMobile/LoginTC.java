package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.LandingPage;
import pagesMobile.LoginPage;

//Login to Linkedin
public class LoginTC {

	LandingPage lp = new LandingPage();
	LoginPage lgp = new LoginPage();
	HomePage hp = new HomePage();
	
	boolean result;
	
	public boolean execute(){

		//Step 1 : Tap Sign in link
		lp.tapSignIn(main.main.elementProp.getProperty("signinlink"));
		
		//Step 2 : Enter email
		result=lgp.WaitForEmailFieldLoad(main.main.elementProp.getProperty("email"),20);
		lgp.enterEmail(main.main.elementProp.getProperty("email"),main.main.dataProp.getProperty("email"));
		
		//Step 3 : Enter password
		lgp.enterEmail(main.main.elementProp.getProperty("password"),main.main.dataProp.getProperty("password"));
		
		//Step 4 : Tap Sign in button
		lgp.tapSignIn(main.main.elementProp.getProperty("signinbutton"));
		
		//step 5 : Verify if Search bar has loaded		
    	result=hp.verifySearchBarLoad(main.main.elementProp.getProperty("searchbar"), 20);
		
    	//Step 6 : Store Result
    	if(result) return true;
		return false;
	}
}
