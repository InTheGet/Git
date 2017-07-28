package registeration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

//HAs it got the changes pushed 
public class RegBase {
	
	//intialzing 

	public static Properties CONFIG = null;
	public static Properties or = null;
	public static WebDriver Driver=null;
	public static EventFiringWebDriver DR;
	
	public void intialize() throws IOException{
		//Intializing property files  
		CONFIG = new Properties();
		FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"//src//config//config.properties");
			CONFIG.load(fn);
		or = new Properties();
		fn = new FileInputStream(System.getProperty("user.dir")+"//src//config//OR.properties");
			or.load(fn);
		
		
		//Intializing webdrivers
		
		//if(config.getProperty("Browser").equals("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "//geckodriver");
			 Driver = new FirefoxDriver();

		
		DR = new EventFiringWebDriver(Driver); 
		DR.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public static WebElement Obj(String xapthkey) {
		try {
		return Driver.findElement(By.xpath(or.getProperty(xapthkey)));
		}catch(Throwable t) {
			
		}
		return null;
}

}