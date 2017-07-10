package testCasesWeb;

import pagesWeb.PropertyPage;

//View search results on map
public class SelectMapViewTC {
	
	PropertyPage pp = new PropertyPage();
	boolean result;
	
	public boolean execute(){
			
		//Step1 : Click on Map View
		pp.clickonMapView(main.main.elementProp.getProperty("mapbutton"));
		
		//Step2 : Verify Map View Load
		result = pp.verifyMapView(main.main.elementProp.getProperty("map"));
		
		//Step3 : Go back to List View
		pp.clickListView(main.main.elementProp.getProperty("listbutton"));
		
		//Step4 : Store Result
    	if(result) return true;
		return false;
	
	}
	

}
