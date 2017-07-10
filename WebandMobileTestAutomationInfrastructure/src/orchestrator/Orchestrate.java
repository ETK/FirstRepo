package orchestrator;

import reporting.Log;
import testCasesMobile.CloseApp;
import testCasesMobile.CommentPostTC;
import testCasesMobile.DeletePostTC;
import testCasesMobile.EditPostTC;
import testCasesMobile.FollowCompanyTC;
import testCasesMobile.LoginTC;
import testCasesMobile.LogoutTC;
import testCasesMobile.NavigateToHomePageTC;
import testCasesMobile.InitializeDevice;
import testCasesMobile.LikePostTC;
import testCasesMobile.LoadCompanyTC;
import testCasesMobile.OpenAppTC;
import testCasesMobile.PostTC;
import testCasesMobile.SearchCompanyTC;
import testCasesMobile.StartAppium;
import testCasesMobile.StopAppium;
import testCasesMobile.UnfollowCompanyTC;
import testCasesWeb.CleanUp;
import testCasesWeb.OpenNestAwayTC;
import testCasesWeb.SortByPriceTC;
import testCasesWeb.SelectMapViewTC;
import testCasesWeb.SearchLocationTC;
import testCasesWeb.SetFutureMoveInDateTC;
import testCasesWeb.SearchWithinPriceRangeTC;

public class Orchestrate {
		
	public void executeKeyword(){
			
		String seq = main.main.keysProp.getProperty("sequence");
		
		String [] seqArr = seq.split(",");
		
		System.out.println("*****************************BEGIN TEST EXECUION*****************************\n");
		
		for(int i = 0; i < seqArr.length; i++){
			
			System.out.println("---Executing Test Case \t:\t "+seqArr[i]+"");
			
			if(main.main.type.equals("Web")) executeWeb(seqArr[i]);
			if(main.main.type.equals("Mobile")) executeMobile(seqArr[i]);
						
		 }
		
		System.out.println("\n*****************************END TEST EXECUION*****************************\n");
		
	}
	
	public void executeWeb(String key){
			
		//Switch Statement to execute the test cases mentioned in the web keys.properties
		
			 switch(key){  
			 
			    case "OpenNestAway": 			    			    	
			    	OpenNestAwayTC on = new OpenNestAwayTC();				    	
			    	Log.storeResult("Open Nestaway App\t", on.execute());
			    	break; 
			    	
			    case "SearchLocation": 			    			    	
			    	SearchLocationTC sl = new SearchLocationTC();				    	
			    	Log.storeResult("Search Location\t", sl.execute());
			    	break;
			    	
			    case "SetMoveInDateFuture": 			    			    	
			    	SetFutureMoveInDateTC smf = new SetFutureMoveInDateTC();				    	
			    	Log.storeResult("Set MoveIn date to Future", smf.execute());
			    	break;
			    	
			    case "SelectMapView": 
			    	SelectMapViewTC smv = new SelectMapViewTC();
			    	Log.storeResult("View results in Map view", smv.execute());
			    	break; 
			    	
			    case "SearchWithinPriceRange": 
			    	SearchWithinPriceRangeTC spr = new SearchWithinPriceRangeTC();
			    	Log.storeResult("Set price range\t", spr.execute());
			    	break; 
			    	
			    case "SortByPrice":
			    	SortByPriceTC sp = new SortByPriceTC();
			    	Log.storeResult("Sort Properties By Price", sp.execute());
			    	break;
			    			    			    	
			    case "CleanUp":			    	
			    	CleanUp cu= new CleanUp();
			    	cu.execute();
			    	break;
			    	
			 }	
		
		}
	
	public void executeMobile(String key){
		
		//Switch Statement to execute the test cases mentioned in the mobile keys.properties
		
		 switch(key){  
		 
		    case "Start": 			    			    	
		    	StartAppium st = new StartAppium();				    	
		    	st.execute();
		    	break;  
		    	
		    case "InitializeDevice": 			    			    	
		    	InitializeDevice id = new InitializeDevice();				    	
		    	id.execute();
		    	break;
		    	
		    case "OpenApp": 			    			    	
		    	OpenAppTC oa = new OpenAppTC();				    	
		    	Log.storeResult("Open Application\t\t", oa.execute());
		    	break;
		    	
		    case "Login": 			    			    	
		    	LoginTC lg = new LoginTC();				    	
		    	Log.storeResult("Login to LinkedIn\t\t", lg.execute());
		    	break;		
		    	
		    case "SearchCompany": 			    			    	
		    	SearchCompanyTC sc = new SearchCompanyTC();				    	
		    	Log.storeResult("Search For Artoo\t\t", sc.execute());
		    	break;	
		    	
		    case "FollowCompany": 			    			    	
		    	FollowCompanyTC fc = new FollowCompanyTC();				    	
		    	Log.storeResult("Follow Artoo\t\t", fc.execute());
		    	break;	
		    	
		    case "OpenCompanyPage": 			    			    	
		    	LoadCompanyTC lc = new LoadCompanyTC();				    	
		    	Log.storeResult("Open Artoo page\t\t", lc.execute());
		    	break;
		    	
		    case "UnfollowCompany": 			    			    	
		    	UnfollowCompanyTC ufc = new UnfollowCompanyTC();				    	
		    	Log.storeResult("Unfollow Artoo\t\t", ufc.execute());
		    	break;
		    	
		    case "NavigateToHomePage": 			    			    	
		    	NavigateToHomePageTC nhp = new NavigateToHomePageTC();				    	
		    	nhp.execute();
		    	break;
		    	
		    case "Post": 			    			    	
		    	PostTC pst = new PostTC();				    	
		    	Log.storeResult("Post\t\t\t", pst.execute());
		    	break;
		    	
		    case "LikePost": 			    			    	
		    	LikePostTC lpst = new LikePostTC();				    	
		    	Log.storeResult("Like the Post\t\t", lpst.execute());
		    	break;
		    	
	    	case "CommentPost": 			    			    	
		    	CommentPostTC cpst = new CommentPostTC();				    	
		    	Log.storeResult("Comment on the Post\t\t", cpst.execute());
		    	break;
		    	
	    	case "EditPost": 			    			    	
		    	EditPostTC epst = new EditPostTC();				    	
		    	Log.storeResult("Edit the Post\t\t", epst.execute());
		    	break;
		    
	    	case "DeletePost": 			    			    	
	    		DeletePostTC dpst = new DeletePostTC();				    	
		    	Log.storeResult("Delete the Post\t\t", dpst.execute());
		    	break;
		    	
		    case "Logout": 			    			    	
		    	LogoutTC lgt = new LogoutTC();				    	
		    	Log.storeResult("Logout\t\t\t", lgt.execute());
		    	break;
		    	
		    case "CloseApp":			    	
		    	CloseApp ca = new CloseApp();				    	
		    	ca.execute();
		    	break;
		    	    			    	
		    case "Stop":			    	
		    	StopAppium stp = new StopAppium();				    	
		    	stp.execute();
		    	break; 
		    	
		 }	
	
	}
	
}
