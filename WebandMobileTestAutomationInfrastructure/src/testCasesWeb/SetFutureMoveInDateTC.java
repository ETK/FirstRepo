package testCasesWeb;

import pagesWeb.PropertyPage;

//Set appropriate filters
public class SetFutureMoveInDateTC {
	
	PropertyPage pp = new PropertyPage();
	boolean result;
	
	public boolean execute(){
		
		//Step1 : Click on Filter button
		pp.clickOnFilterButton(main.main.elementProp.getProperty("filterButton"));
				
		//Step2 : Select Calendar
		pp.waitForCalendarToLoad(main.main.elementProp.getProperty("calendar"), 20);
		pp.selectMoveinDate(main.main.elementProp.getProperty("calendar"));
		
		//Step3 : Navigate to future date
		pp.navigateFuture(main.main.elementProp.getProperty("calendarnext"));
		
		//Step4 : Navigate to future date
		pp.selectFirstDateInCalendarView(main.main.elementProp.getProperty("firstdate"));
				
		//Step5 : Select Past Date from calendar
		result = pp.verifyDateSelected(main.main.elementProp.getProperty("calendar"));
				
		//Step6 : Close filter
		pp.closeFilter(main.main.elementProp.getProperty("closefilter"));
		
		//Step7 : Store Result
    	if(result) return true;
		return false;
		
	}

}
