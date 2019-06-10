package workingwithjavascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class DpartureNreturnbyusingJS {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.spicejet.com/");
	}
@Test
public void datepicker(){
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='14/05/2019'");
	Sleeper.sleepTightInSeconds(5);
	js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value='16/05/2019'");
}


}
