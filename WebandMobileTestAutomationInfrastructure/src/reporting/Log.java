package reporting;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Log {
	
	public static LinkedHashMap resultMap = new LinkedHashMap();
	static LinkedHashMap resultMapDup = new LinkedHashMap();		
	
	public static void storeResult(String testName, boolean result){
		
		resultMap.put(testName, result);
		
	}
	
	public static void displayResult(){
		
		System.out.print("*************************************\n");
   		System.out.print("*           Test Results            *\n");
   		System.out.print("*************************************\n");
   		System.out.println("Test Name\t\t\t \tResult");
   		System.out.println("---------\t\t\t \t------");
   		
   		resultMapDup = resultMap;
		
		 // Get a set of the entries
	      Set set = resultMapDup.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	    	  
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + "\t:\t");
	         
	         if(me.getValue().toString().equals("true")){
	        	 //Print on the console
	        	 System.out.println("PASS\n");
	        	 //Add data to result map
	        	 resultMap.put(me.getKey(), "PASSED");	    	 
	         }
	        	 	 
	         if(me.getValue().toString().equals("false")){
	        	 //Print on the console
	        	 System.out.println("FAIL\n"); 
	        	 //Add data to result map
	        	 resultMap.put(me.getKey(), "FAILED");
	         }
	         
	      }	     
		
	}
	

}
