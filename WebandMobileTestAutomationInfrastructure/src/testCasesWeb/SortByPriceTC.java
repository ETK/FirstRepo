package testCasesWeb;

import java.util.List;
import org.openqa.selenium.WebElement;
import pagesWeb.PropertyPage;

//Sort Results by price
public class SortByPriceTC {
	
	PropertyPage pp = new PropertyPage();
	List<WebElement> list;
	boolean result;
	
	public boolean execute(){
	
		//Step1 : Click on Filter button
		pp.clickOnFilterButton(main.main.elementProp.getProperty("filterButton"));
		
		//Step2 : Click on Sort option
		pp.clickOnSortButton(main.main.elementProp.getProperty("sort"));
		
		//Step3 : select price low to high
		pp.clickonLowToHighPrice(main.main.elementProp.getProperty("sortprice"));
		
		//Step4 : Apply the sort
		pp.applySort(main.main.elementProp.getProperty("applyfilter"));
					
		//Step5 : Verify if the list is sorted
		result = pp.verifySortedPriceList(main.main.elementProp.getProperty("rentalprice"));
		
		//Step7 : Store Result
    	if(result) return true;
		return false;
	}
	
}
