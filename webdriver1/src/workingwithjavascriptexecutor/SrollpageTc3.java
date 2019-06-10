package workingwithjavascriptexecutor;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SrollpageTc3 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://in.yahoo.com/?p=us");
	}
@Test
public void scrollpage()throws IOException{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//sroll upto 50%
	js.executeScript("window.scrollBy(0,5000)");
	//scroll upto end
	js.executeScript("window.scrollBy(0,document.body.srollHeight)");
	//sroll upto specific element
	js.executeScript("document.getElementById('pass').scrollIntoView()");
}


}
