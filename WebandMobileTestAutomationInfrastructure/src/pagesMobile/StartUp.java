package pagesMobile;

import AppiumFunctions.AppiumFunctions;

//Appium setup related functions

public class StartUp {
	
	//Setup Appium server
	public static void SetupAppium(String port, String appiumnodepath, String appiumjspath){

    	AppiumFunctions.setupAppium(Integer.parseInt(port), appiumnodepath, appiumjspath); 

	}
	
	//Start Appium Server
	public static void StartAppium(){
		
		AppiumFunctions.startAppium(); 

	}
	
	//Stop Appium Server
	public static void StopAppium(){
		
		AppiumFunctions.stopAppium(); 

	}
	
	//Initialize App
	public static void InitializeApp(String apkName){
			
		AppiumFunctions.initializeApp(apkName); 

	}
	
	//Initialize Device
	public static void InitializeDevice(String device, String deviceName, String platformName, String app){
				
		AppiumFunctions.initializeDevice(device, deviceName, platformName, app); 

	}
	
	//Initialize Driver
	public static void InitializeDriver(String ip, String port){
				
		AppiumFunctions.initializeDriver(ip, port); 

	}
	
	//Close App
	public static void closeApp(){
					
		AppiumFunctions.closeDriver();

	}
	

}
