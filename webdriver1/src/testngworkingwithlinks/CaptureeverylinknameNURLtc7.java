package testngworkingwithlinks;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptureeverylinknameNURLtc7 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.bing.com/");
		}
	@Test
	public void data(){
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++){
			if(links.get(i).isDisplayed()){
				
			String lname=links.get(i).getText();
			links.get(i).click();
		    String url=driver.getCurrentUrl();
			System.out.println(lname+" "+url);
			
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			}
		}}
	
		/*@AfterTest
		public void close(){
			driver.close();*/
		}
	




