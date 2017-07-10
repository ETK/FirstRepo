package testCasesMobile;

import pagesMobile.StartUp;

//Start Appium
public class StartAppium {
	
	public void execute(){
		
		//Step 1 : Setup Appium Server
		StartUp.SetupAppium(main.main.dataProp.getProperty("port"),main.main.configProp.getProperty("appiumnodepath"),main.main.configProp.getProperty("appiumjspath"));

		//Step 2 : Start Appium Server
		StartUp.StartAppium();

	}
	

}
