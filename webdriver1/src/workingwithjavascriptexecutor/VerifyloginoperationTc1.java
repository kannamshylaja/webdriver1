package workingwithjavascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class VerifyloginoperationTc1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void login(){
		Sleeper.sleepTightInSeconds(5);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getelementBy id('email').value='nakenduku@gmail.com'");
	js.executeScript("document.getelementBy id('pass').value='nikenduku123'");
	js.executeScript("document.getelementBy id('loginbutton').click()");
	
	




}}
