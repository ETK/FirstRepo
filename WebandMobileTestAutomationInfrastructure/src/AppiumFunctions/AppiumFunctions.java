package AppiumFunctions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumFunctions {	
	
	
	public static RemoteWebDriver driver;
	public static WebElement element;
	public static Action action;
	public static AppiumDriverLocalService service;
	public static File appDir;
	public static File app;
	public static DesiredCapabilities capabilities;
	
		//Setup Appium rest API service
		public static void setupAppium(int port, String appiumnodepath, String appiumjspath){
			
		     service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(port).
		        		usingDriverExecutable(new File(appiumnodepath)).
		        		withAppiumJS(new File(appiumjspath)));
		}	
		
		//Start Appium rest API service background process
		public static void startAppium(){		     

		     service.start();
		}	
		
		//Stop Appium rest API service background process
		public static void stopAppium(){		     

			 service.stop();
		}
		
		//Initialize app properties
		public static void initializeApp(String apkName){		     

			appDir = new File("apk");
			app = new File(appDir, apkName);
		}
		
		//Set Desired Capabilities
		public static void initializeDevice(String device, String deviceName, String platformName, String app){		     
			
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("device",device);
			capabilities.setCapability("deviceName",deviceName);
			capabilities.setCapability("platformName",platformName);
			capabilities.setCapability("app", AppiumFunctions.app.getAbsolutePath());
			capabilities.setCapability("noReset","true");
			capabilities.setCapability("fullReset","false");
			capabilities.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
			capabilities.setCapability("appWaitActivity", "com.linkedin.android.growth.login.LoginActivity");
		}
	
		//Initialize Remote Driver
		public static void initializeDriver(String ip, String port){		     

			try {		
				driver = new RemoteWebDriver(new URL("http://"+ip+":"+port+"/wd/hub"), capabilities);		
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}	
		}
		
		//Close Remote Driver
		public static void closeDriver(){		     
						
				driver.quit();
		}
		
		
		//Wait for an element to load/appear
		public static boolean waitForElement(String id, int time){
						
			WebDriverWait wait = new WebDriverWait(driver, time);

			try{
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
				
			}catch(Exception E){
				
				if(E.toString().contains("Expected condition failed: waiting for visibility of element")){
					return false;
				}else{
					
					return true;
				}						
			}
			return true;
		}
		
		//Wait for an element to load/appear
		public static boolean explicitWaitForElement(String id, int time){
			
			for(int i=0; i < time ;i++){
				
				try{
				Thread.sleep(1000);
				}catch(Exception e){	
					System.out.println(e);
				}
				if(driver.findElementsById(id).size() != 0){	
					return true;
				}else{
					continue;
				}		
			}
			
			return false;			
		}
		
		//Wait for name to load/appear
		public static boolean explicitWaitForElementName(String name, int time){
			
			for(int i=0; i < time ;i++){
				
				try{
				Thread.sleep(1000);
				}catch(Exception e){	
					System.out.println(e);
				}
				if(driver.findElementsByName(name).size() != 0){	
					return true;
				}else{
					continue;
				}		
			}
			
			return false;			
		}
		
		//verify if element is present		
		public static boolean verifyElementPresent(String id)
		{
			return driver.findElement(By.id(id)).isDisplayed();			
		}
		
		//verify if element is abscent		
		public static boolean verifyElementAbscent(String id)
		{ 
			try{
				driver.findElement(By.id(id)).isDisplayed();	
			}catch(NoSuchElementException e){
				System.out.println(e);
				return true;
			}
			 
			return false;
		}
		
		//Click via ID reference
		public static void clickid(String id){
			
			driver.findElement(By.id(id)).click();
		}
		
		//Click via name reference
		public static void clickName(String name){
			
			driver.findElementByName(name).click();
		}
		
		//Click via bounds reference
		public static void clickBounds(String bounds){
					
			driver.findElement(By.xpath(bounds)).click();
		}
		
		//Click via class name reference
		public static void clickClassName(String className,int index){
							
			List<WebElement> editText = driver.findElements(By.className(className));
//			System.out.println(editText.size());
//			System.out.println(editText.get(0).getText());
//			System.out.println(editText.get(1).getText());
//			System.out.println(editText.get(2).getText());
			editText.get(index).click();
		}
		
		//Click via class name reference
		public static void clickClass(String className,int index){
									
			List<WebElement> editText = driver.findElements(By.className(className));
			editText.get(index).click();
		}
		
		//Select All
		public static void selectAll(String id){
			
			driver.findElement(By.id(id)).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		}
		
		//Clear a field
		public static void clearField(String id){
					
			WebElement nam = driver.findElement(By.id(id));
			nam.click();
			nam.clear();
		}
		
		//Typing in a text field
		public static void sendKeys(String id, String input){
			
			driver.findElement(By.id(id)).sendKeys(input);	
		}
		
		//Verify text on any element
		public static boolean verifyTextOfElementbyId(String id, String verificationText){
				
			if(driver.findElement(By.id(id)).getText().contains(verificationText)) return true;
			
				return false;	
		}
		
		//Verify text on any element by name
		public static boolean verifyTextOfElementbyName(String name, String verificationText){
			
			if(driver.findElementByName(name).getText().contains(verificationText)) return true;
			
				return false;	
		}
		
		//Verify text on any element by class
		public static boolean verifyTextOfElementbyClass(String name, String verificationText){
					
			if(driver.findElementByClassName(name).getText().contains(verificationText)) return true;
			
				return false;	
		}
		
		//Verify text on the page
		public static boolean verifyTextOnPage(String text){
			
			System.out.println(driver.getPageSource());
					
			if(driver.getPageSource().contains(text)) return true;
			
				return false;		
		}		
		
		//Wait for a specified time period
		public static void waitPeriod(long time){
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		//Hit back key
		public static void hitBack(){
			
			driver.navigate().back();
		}
		
		//Hit pagedown button
		public static void pagedown(String name){
			
			driver.findElement(By.name(name)).sendKeys(Keys.PAGE_DOWN);

		}
		
}
