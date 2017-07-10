package testCasesWeb;

import pagesWeb.Launch;

//Close the browser instance
public class CleanUp {
	
	public void execute(){
		
		Launch l = new Launch();
		
		//Step 1 : Exit the browser		
		l.closeBrowser();
		

	}
	

}
