package registeration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class RegBase {
	
	//intialzing 

	public static Properties config = null;
	public static Properties OR = null;
	public static WebDriver Driver;
	public static EventFiringWebDriver DR;
	
	public void intialize() throws IOException{
		//Intializing property files  
		config = new Properties();
		FileInputStream fn = new FileInputStream(System.getProperty("User.dir")+"src//config//config.properties");
		config.load(fn);
		OR = new Properties();
		fn = new FileInputStream(System.getProperty("User.dir")+"src//config//OR.properties");
		OR.load(fn);
		
		
		//Intializing webdrivers
		
		//if(config.getProperty("Browser").equals("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", ("User.dir")+"//Users//pradumanmehta//Downloads//geckodriver.exe");
			WebDriver Driver = new FirefoxDriver();

		
		DR = new EventFiringWebDriver(Driver); 
		DR.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}

