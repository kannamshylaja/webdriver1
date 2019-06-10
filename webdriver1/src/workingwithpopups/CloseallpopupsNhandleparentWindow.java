package workingwithpopups;
import java.util.Iterator;
import java.util.Set;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CloseallpopupsNhandleparentWindow {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://2movierulz.mx/");
	}
	@Test
	public void handleparent(){
		String parent=driver.getWindowHandle();
		Set<String>pops=driver.getWindowHandles();
		Iterator<String>it=pops.iterator();
		while(it.hasNext()){
		String popupshandle=it.next();
		if(!popupshandle.contains(parent)){
			driver.switchTo().window(popupshandle);
			Sleeper.sleepTightInSeconds(5);
			driver.close();
		}
		
	}}}
	



