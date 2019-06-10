package workingwithmultiplewindows;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiplewindowsTC1 {

	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.online.citibank.co.in/");
	}
	@Test
	public void handleparent() throws IOException,InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='topMnucreditcards']")).click();
		driver.findElement(By.linkText("Apply for a Credit Card")).click();
		String parent=driver.getWindowHandle();
		Set<String>pops=driver.getWindowHandles();
		Iterator<String>it=pops.iterator();
		while(it.hasNext()){
		String popupshandle=it.next();
		if(!popupshandle.contains(parent)){
			driver.switchTo().window(popupshandle);
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath("//*[@id='tabs-wrapper']/div[2]/div[2]/a")).click();
		}
		
	}}}



