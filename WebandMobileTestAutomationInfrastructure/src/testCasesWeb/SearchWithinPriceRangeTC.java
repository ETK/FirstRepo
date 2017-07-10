package testCasesWeb;

import pagesWeb.PropertyPage;

//Set Price range
public class SearchWithinPriceRangeTC {
	
	boolean result;
	
	public boolean execute(){
	
		PropertyPage pp = new PropertyPage();
		
		//Step1 : Click On Filter Button
		pp.clickOnFilterButton(main.main.elementProp.getProperty("filterButton"));
		
		//Step2 : Click on filter option
		pp.clickOnFilterOption(main.main.elementProp.getProperty("filterOption"));
		
		//Step3 : Set price filter starting from minimum price
		pp.setPriceFilter(main.main.elementProp.getProperty("slider"));
		
		//Step4 : Verify if the filter values are set accordingly
		result = pp.verifyPriceFilterSet(main.main.elementProp.getProperty("pricevalue"),main.main.dataProp.getProperty("minprice"),main.main.dataProp.getProperty("maxprice"));
		
		//Step4 : Close the filter button
		pp.closeFilter(main.main.elementProp.getProperty("closefilter"));
				
		//Step5 : Store Result
    	if(result) return true;
		return false;

}
}
