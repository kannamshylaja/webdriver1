package testngworkingwithlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickgmailcpturtTitlofGmailTc1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.google.com");
	}
	@Test
	public void click(){
		driver.findElement(By.linkText("Gmail")).click();
		
	}
	@Test
	public void captureTitle(){
		String Expected="Gmail";
		String Actual=driver.getTitle();
		if(Actual.contains(Expected)){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}
	@AfterTest
	public void close(){
		driver.close();
	}

}
