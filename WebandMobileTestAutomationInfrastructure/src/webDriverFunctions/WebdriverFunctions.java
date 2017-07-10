package webDriverFunctions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WebdriverFunctions {	
	
	
	public static WebDriver driver;
	public static WebElement element;
	public static Action action;
	
	//Launching browser instance
		public static void lauchBrowser(String browser){
		
		//Method can be developed for all other types of browsers as well
		if(browser.equals("firefox")){
			
			System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");	    	
	    	//driver = new FirefoxDriver();
	    	driver = new FirefoxDriver();
	    	
	    	 driver.manage().window().maximize();	
		}	
	}	
	
	//Opening a praticular URL
	public static void openPage(String url){
		
		driver.get(url);
		
	}
	
	//Typing in a text field
	public static void sendKeys(String id, String input){
		
		driver.findElement(By.xpath(id)).sendKeys(input);
		
	}
		
	//Typing in any field
	public static void type(String id, String input){
		
		driver.findElement(By.xpath(id)).sendKeys(input);
		
	}
	
	//Click on a element
	public static void click(String id){
		
		driver.findElement(By.id(id));
		element.click();
	}
	
	//Click via ID reference
	public static void clickid(String id){
		
		driver.findElement(By.id(id)).click();
	}
	
	//Click on a xpath
	public static void clickXpath(String xpath){
		
		driver.findElement(By.xpath(xpath)).click();

	}
	
	//Click on a link
	public static void clickLink(String link){
			
		driver.findElement(By.linkText(link)).click();

	}
	
	//Hit pagedown button
	public static void pagedown(String input){
		
		driver.findElement(By.xpath(input)).sendKeys(Keys.PAGE_DOWN);

	}
	
	//Hit up button
	public static void up(String input){
		
		driver.findElement(By.xpath(input)).sendKeys(Keys.UP);

	}
	
	//Hit down button
	public static void down(String input){
		
		driver.findElement(By.xpath(input)).sendKeys(Keys.DOWN);
	}
	
	//Hit enter key
	public static void hitEnter(String text){
				
		driver.findElement(By.xpath(text)).sendKeys(Keys.ENTER);
	}
	
	//Hit tab key
	public static void hitTab(String text){
		
		driver.findElement(By.xpath(text)).sendKeys(Keys.TAB);

	}
	
	//Verify text on the page
	public static boolean verifyText(String text){
				
		if(driver.getPageSource().contains(text)) return true;
		
			return false;
			
	}
	
	//Verify text on any element
	public static boolean verifyTextOfElement(String id, String verificationText){
			
		if(driver.findElement(By.xpath(id)).getText().contains(verificationText)) return true;
		
			return false;	
	}
	
	//Verify if there is any text on the element
	public static boolean verifyElementContainsText(String id){
			
		if(!driver.findElement(By.xpath(id)).getAttribute("value").isEmpty()) return true;
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
	
	//Wait for an element to load/appear
	public static boolean waitForElement(String id, int time){
		
		WebDriverWait wait = new WebDriverWait(driver, time);

		try{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(id)));	
		}catch(Exception E){
			
			if(E.toString().contains("Expected condition failed: waiting for element to be clickable")){
				return false;
			}else{
				
				return true;
			}						
		}
		return false;
	}
	
	//verify if xpath is present
	
	public static boolean verifyElementPresent(String xpath)
	{
		driver.findElement(By.xpath(xpath)).isDisplayed();
		return true;
	}
	
	//verify if element is selected
	public static boolean verifyElementSelected(String xpath1, String xpath2)
	{
		driver.findElement(By.xpath(xpath1)).click();
		
		if(driver.findElement(By.xpath(xpath2)).isDisplayed())
			return true;
		return false;
	}
	
	//Get the list of elements under a xpath
	public static List<WebElement> getListOfElements(String xpath){
		
		return driver.findElements(By.xpath(xpath));

	}
	
	//Get text of the element
	public static void getFrames(){
			
		driver.get("http://the-internet.herokuapp.com/iframe");

		// find all your iframes
		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
		        // print your number of frames
		        System.out.println(iframes.size());

		        // you can reach each frame on your site
		        for (WebElement iframe : iframes) {

		            // switch to every frame
		            driver.switchTo().frame(iframe);

		            // now within the frame you can navigate like you are used to
		            System.out.println(driver.findElement(By.id("tinymce")).getText());
		        }
		

	}
	
	//Move the slider to extreme left
	public static void sliderMoveLeft(String xpath)
	{
		int width;
		int currSliderPos;
	    WebElement slider = driver.findElement(By.xpath(xpath));
	    Actions move = new Actions(driver);
	    width =slider.getSize().getWidth();
	    currSliderPos = Integer.parseInt((slider.getAttribute("style")).substring(6,7));
	    move.moveToElement(slider, (-(width*currSliderPos)/100),0).click();
	    move.build().perform();
	}
	
	//Get value of a element
	public static String getValueOfElement(String xpath)
	{
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	//Refresh the browser page
	public static void refreshPage(){
			
		driver.navigate().refresh();
	}
	
	//Close the browser instance
	public static void closeBrowser(){
		
		driver.close();
	}

}
