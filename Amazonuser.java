package registeration;

import java.io.IOException;

import org.junit.After;

import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.AfterClass;
import org.junit.Test;
//import org.junit.runners.Parameterized.Parameters;



public class Amazonuser extends RegBase{
	
	@Before
	public void BeforeTest() throws IOException{
		intialize();
	System.out.println("intialie the class");
	
	}

	
	@After
	public void close(){
		System.out.println("Close the browser");
	}
	
	@Test
	public void LoginTest(){
		//System.out.println("The user successfully logged in ");
		//Assume.assumeTrue(checklogin());
//write the java code when you know it to actually log in to the site 	
		DR.get(config.getProperty("site"));
		
		
		
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
