package pagesWeb;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import webDriverFunctions.WebdriverFunctions;

//Page Object Model for Property Page

public class PropertyPage {
	
	//Verify if Login button has loaded
	public boolean verifyFilterButtonLoad(String objectID, int waitTime){
		
		return WebdriverFunctions.waitForElement(objectID, waitTime);
	}
	
	//Click on Map View
	public void clickonMapView(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Click on Filter Button
	public void clickOnFilterButton(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Click on Filter option
	public void clickOnFilterOption(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Setting the price filter
	public void setPriceFilter(String xpath){
		
		WebdriverFunctions.sliderMoveLeft(xpath);		
	}
	
	//Verifying the price filter values set
	public boolean verifyPriceFilterSet(String xpath, String expectedMinPrice, String expectedMaxPrice){
		
		String actualMinPrice, actualMaxPrice;
		String actuals = WebdriverFunctions.getValueOfElement(xpath);
		
		actualMinPrice = actuals.substring(22,26);
		actualMaxPrice = actuals.substring(32);
		
		if(actualMinPrice.equals(expectedMinPrice) && actualMaxPrice.equals(expectedMaxPrice)) return true;
		
		return false;		
	}
	
	//Select Move in Date
	public void selectMoveinDate(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Navigate to future date
	public void navigateFuture(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Select first date in calendar view
	public void selectFirstDateInCalendarView(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Select first date in calendar view
	public boolean verifyDateSelected(String ObjectID){
		
		return WebdriverFunctions.verifyElementContainsText(ObjectID);
	}
	
	//Wait for Calendar to load
	public void waitForCalendarToLoad(String ObjectID, int time){
		
		WebdriverFunctions.waitForElement(ObjectID, time);
	}
	
	//Select past Date
	public boolean selectPastDate(String dateID, String calWindowID){
		
		return WebdriverFunctions.verifyElementSelected(dateID, calWindowID);
	}
	
	//Close Filter pop up
	public void closeFilter(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Verify properties are shown on Map View
	public boolean verifyMapView(String ObjectID){
		
		return WebdriverFunctions.verifyElementPresent(ObjectID);
	}
	
	//Click on list view	
	public void clickListView(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);	
	}
	
	//Click on sort button
	public void clickOnSortButton(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}

	//select low to hig price radio button
	public void clickonLowToHighPrice(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Apply the sorting changes
	public void applySort(String ObjectID){
		
		WebdriverFunctions.clickXpath(ObjectID);
	}
	
	//Get the sorted price list
	public List<WebElement> getSortedPriceList(String ObjectID){
		
		return WebdriverFunctions.getListOfElements(ObjectID);
	}
	
	//Verify if price list is sorted
	public boolean verifySortedPriceList(String xpath){

		boolean result = true;
		String[] items = new String[200];
		ArrayList<String> itemList = new ArrayList<String>();
		List<WebElement> list;
		boolean x=true;
		
		try {
			Thread.sleep(5000);
			list=WebdriverFunctions.getListOfElements(xpath);

			for (WebElement element : list) {
				items = element.getText().split(" ");
				
				for (int i = 0; i < items.length; i++) {	
					if(i==1){
						if(x){
						itemList.add(items[i]);
						x=!x;
						}else{
							x=!x;
						}	
					}		
				}
			}
			
			for (int i = 1; i < itemList.size();i++) {
				if (itemList.get(i-1).compareTo(itemList.get(i)) > 0) result = false;
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return result;	
	}
	
}
