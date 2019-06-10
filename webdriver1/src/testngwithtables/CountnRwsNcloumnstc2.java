package testngwithtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountnRwsNcloumnstc2 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	@Test
	public void data(){
		//count no.of rows
		List<WebElement>nvalues=driver.findElements(By.tagName("tr"));
		System.out.println(nvalues.size());
		//count no.of rows
		nvalues=driver.findElements(By.tagName("td"));
		System.out.println(nvalues.size());
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	

}
