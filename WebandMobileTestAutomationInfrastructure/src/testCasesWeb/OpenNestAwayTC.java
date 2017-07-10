package testCasesWeb;

import pagesWeb.HomePage;
import pagesWeb.Launch;

//Open nestAway page
public class OpenNestAwayTC {
	
	Launch la = new Launch();
	HomePage hp = new HomePage();
	boolean result;
	
	public boolean execute(){
		
		//Step 1 : Launch web browser		
		la.lauchBrowser(main.main.configProp.getProperty("browser"));
		
		//Step 2 : Open the login page	
		hp.openPage(main.main.configProp.getProperty("url"));
		
		//step 3 : select the city
		hp.selectCity(main.main.elementProp.getProperty("city"));
		
		//step 4:Verify if page has loaded		
    	result=hp.verifyHomePageLoad(main.main.dataProp.getProperty("homepagetext"));
		
    	//Step 5 : Store Result
    	if(result) return true;
		return false;

	}
	

}
