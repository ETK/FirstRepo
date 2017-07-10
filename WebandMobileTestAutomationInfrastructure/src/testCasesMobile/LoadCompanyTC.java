package testCasesMobile;

import pagesMobile.CompanyPage;
import pagesMobile.SearchPage;

//Load the company
public class LoadCompanyTC {

	SearchPage sp = new SearchPage();
	CompanyPage cp = new CompanyPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on company
		sp.tapCompany(main.main.elementProp.getProperty("Artoo"));
		
		//Step 2 : Verify company page open
		result = cp.verifyCompanyPageOpen(main.main.elementProp.getProperty("following"),10);

    	//Step 3 : Store Result
    	if(result) return true;
		return false;
	}
}
