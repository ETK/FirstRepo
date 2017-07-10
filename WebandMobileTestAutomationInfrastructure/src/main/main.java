package main;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import orchestrator.Orchestrate;
import reporting.Log;
import reporting.Report;

public class main {
	
	public static Properties typeProp, configProp, suiteProp, keysProp, dataProp, elementProp;
	public static String type;

	
	public static void main(String[] args) {
		
		//Initializing all properties
		
		typeProp = new Properties();
		InputStream typeInput = null;
		
		configProp = new Properties();
		InputStream configInput = null;
		
		suiteProp = new Properties();
		InputStream suiteInput = null;
		
		keysProp = new Properties();
		InputStream keysInput = null;
		
		dataProp = new Properties();
		InputStream dataInput = null;
		
		elementProp = new Properties();
		InputStream elementInput = null;

		try {			

			//Reading the general property file
			
			typeInput = new FileInputStream("Properties\\General\\type.properties");
			typeProp.load(typeInput);  
			
			//Deciding whether the suite is Web or Mobile
			
			if(typeProp.getProperty("type").equals("web"))type = "Web";
			if(typeProp.getProperty("type").equals("mobile"))type = "Mobile";
			
			//Reading the web/mobile property file
			
			configInput = new FileInputStream("Properties\\"+type+"\\config.properties");
			configProp.load(configInput);
			
			suiteInput = new FileInputStream("Properties\\"+type+"\\suite.properties");
			suiteProp.load(suiteInput);
			
			elementInput = new FileInputStream("Properties\\"+type+"\\element.properties");
			elementProp.load(elementInput);
			
			dataInput = new FileInputStream("Properties\\"+type+"\\data.properties");
			dataProp.load(dataInput);

			if(suiteProp.getProperty("executionType").equals("keyword")){
				
				keysInput = new FileInputStream("Properties\\"+type+"\\keys.properties");
				keysProp.load(keysInput);		
				
				Orchestrate cr = new Orchestrate();
				//Start of Test execution
				cr.executeKeyword();	
				
				//Display logs on console
				Log.displayResult();
				
				//Generating report
				Report.generateReport();
				
			}
			
		} catch (Exception e) {

					e.printStackTrace();
		}
    	
    }

}