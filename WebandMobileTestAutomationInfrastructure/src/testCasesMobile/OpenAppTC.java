package testCasesMobile;

import pagesMobile.LandingPage;
import pagesMobile.StartUp;

//Open Linkedin App
public class OpenAppTC {
	
	LandingPage lp = new LandingPage();
	boolean result;
	
	public boolean execute(){

		//Step 1 : Open LinkedIn App
		StartUp.InitializeDriver(main.main.dataProp.getProperty("ip"), main.main.dataProp.getProperty("port")); 
		
		//step 2 : Verify if SignIn link has loaded		
    	result=lp.VerifySignInLinkLoad(main.main.elementProp.getProperty("signinlink"), 20);
		
    	//Step 3 : Store Result
    	if(result) return true;
		return false;

	}
	

}
