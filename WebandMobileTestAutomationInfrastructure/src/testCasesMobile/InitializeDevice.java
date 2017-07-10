package testCasesMobile;

import pagesMobile.StartUp;

//Initialize the device
public class InitializeDevice {
	
	public void execute(){

		//Step 1:Initilaize the App under test	
		StartUp.InitializeApp(main.main.dataProp.getProperty("apkname"));

		//Step 2:Initilaize the Device on which App is to be tested			
		StartUp.InitializeDevice(main.main.dataProp.getProperty("device"), main.main.dataProp.getProperty("deviceName"), main.main.dataProp.getProperty("platformName"), main.main.dataProp.getProperty("app")); 
	}	
}
