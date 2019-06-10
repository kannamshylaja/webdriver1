package testngworkingwithlinks;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GetnamesoflinkfromheaderpartTc5 {
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
	WebElement header=driver.findElement(By.id("sc_hdu"));
	List<WebElement>links=header.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<links.size();i++){
		System.out.println(links.get(i).getText());
	}}
	@AfterTest
	public void close(){
		driver.close();
	}
}



