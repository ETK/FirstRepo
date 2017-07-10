package testCasesMobile;

import pagesMobile.HomePage;
import pagesMobile.SearchPage;

//Search for company
public class SearchCompanyTC {

	HomePage hp = new HomePage();
	SearchPage sp = new SearchPage();
	
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Tap on search
		hp.tapSearch(main.main.elementProp.getProperty("searchbar"));

		//Step 2 : Enter company name in search bar
		sp.enterCompanyNameToSearch(main.main.elementProp.getProperty("searchtoolbar"),main.main.dataProp.getProperty("company")+"\n");
		result=sp.verifyCompanyNameEntered(main.main.elementProp.getProperty("searchtoolbar"), main.main.dataProp.getProperty("company"));
		
		//step 3 : Verify if company is entered		
    	sp.tapCompanies(main.main.elementProp.getProperty("companies"),main.main.elementProp.getProperty("companiesindex"));
    	result = sp.verifyCompanyNameLoad(main.main.elementProp.getProperty("Artoo"),main.main.dataProp.getProperty("company"));
		
    	//Step 4 : Store Result
    	if(result) return true;
		return false;
	}
}
