package pagesWeb;

import webDriverFunctions.WebdriverFunctions;

//Launch and close browser

public class Launch {
	
	//Launch Browser
	public void lauchBrowser(String browser){
		
    	WebdriverFunctions.lauchBrowser(browser); 
	}
	
	//Close Browser
	public void closeBrowser(){
		
    	WebdriverFunctions.closeBrowser();
	}	

}
