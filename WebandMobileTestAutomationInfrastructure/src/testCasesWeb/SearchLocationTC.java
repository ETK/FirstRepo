package testCasesWeb;

import pagesWeb.HomePage;
import pagesWeb.PropertyPage;

//Search for location
public class SearchLocationTC {
	
	HomePage hp = new HomePage();
	PropertyPage pp = new PropertyPage();
	boolean result;
	
	public boolean execute(){
						
		//Step1 : Enter the location
		hp.enterLocation(main.main.elementProp.getProperty("searchbox"),main.main.dataProp.getProperty("location"));
				
		//Step2 : Click on Search button
		hp.hitSearch(main.main.elementProp.getProperty("searchbutton"));
		
		//Step3 : Verify if Property page is loaded
		result = pp.verifyFilterButtonLoad(main.main.elementProp.getProperty("filterbutton"),20);
		
		//Step4 : Store Result
    	if(result) return true;
		return false;
		
	}

}
