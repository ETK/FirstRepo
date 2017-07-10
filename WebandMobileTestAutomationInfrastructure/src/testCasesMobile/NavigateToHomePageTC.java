package testCasesMobile;

import pagesMobile.HomePage;

//Navigate to HomePage from Company Page
public class NavigateToHomePageTC {

	HomePage hp = new HomePage();
	
	boolean result;
	
	public void execute(){

		//Step 1 : Navigate to HomePage
		hp.navigateToPreviousPage();
		hp.navigateToPreviousPage();
		hp.navigateToPreviousPage();
		hp.navigateToPreviousPage();
	}
}
