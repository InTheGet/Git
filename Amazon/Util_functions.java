package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.apache.xpath.operations.Or;

//import org.junit.Before;
//import org.junit.Test;

import registeration.RegBase;

public class Util_functions extends RegBase {
	
	

	/* This method can be worked for general loading of a webpage 
	 With maximum browser screen size
	 30 seconds implicit wait for the page to get time to load 
	 */
	public static void page_load() {
		//may be put it on the loop and ask for it open in different browsers or create it in a base class and use the key  
	//	while(CONFIG.getProperty(CBro)) { 
		DR.get(CONFIG.getProperty("Grouptsite"));
		DR.manage().window().maximize();
		DR.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Obj("Gobutton").click();
	}
	
	public static void searchlink() {
		
	}
	
	/*public static void differ_browser() {	
		if(CONFIG.getProperty("FBro").equals("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "//geckodriver");
			 Driver = new FirefoxDriver();
		}
		else if(CONFIG.getProperty("CBro").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Chroomedriver");
			
			 
			 }
		else if(CONFIG.getProperty("IEBro").equals("Internet Explorer")){
			
		}
		else if(CONFIG.getProperty("EdgeBro").equals("Edge")) {
			
		}
		else if(CONFIG.getProperty("SafariBro").equals("Safari")) {
			
		}
	}
	
	*/
}
