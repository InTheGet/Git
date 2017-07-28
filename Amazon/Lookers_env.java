package registeration;

import java.io.IOException;

import org.junit.After;

import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.AfterClass;
import org.junit.Test;

import utility.Util_functions;
//import org.junit.runners.Parameterized.Parameters;



public class Lookers_env extends RegBase{
	
	@Before
	public void BeforeTest() throws IOException{
		intialize();
	System.out.println("intialie the class");
	
	}

	
	
	
	@Test
	public void LoginTest() throws IOException {
	
		//DR.get(CONFIG.getProperty("site"));
			Util_functions.page_load();
		
	}
	
	@After
	public void close(){
		
		System.out.println("Close the browser");
	}
	
	/*
	public static boolean checklogin(){
		return false;//if the login is not successful or true if successful
	}
	@Test
	public void signin(){
		System.out.println("User successfully singed in");
	}
	
	@Test
	public void guestaccess(){
		
	System.out.println("Continuing as a guest");
	}*/
}
