package workingwithmultiplewindows;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CliklnkNcaptureTitleNcountlinksTc2 {

	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	@Test
	public void handleparent() throws IOException,InterruptedException{
		List<WebElement>frames=driver.findElements(By.tagName("frame"));
		for(int i=0;i<frames.size();i++){
			driver.switchTo().frame(i);
			try {
				driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
			break;	
			} catch(Exception x) {
				
				driver.switchTo().defaultContent();
				System.out.println(frames.size());
			}
		}
	

		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("//*[@id='topMnucreditcards']")).click();
		//driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		Set<String>pops=driver.getWindowHandles();
		Iterator<String>it=pops.iterator();
		while(it.hasNext()){
		String popupshandle=it.next();
		if(!popupshandle.contains(parent)){
			driver.switchTo().window(popupshandle);
			String title=driver.getTitle();
			System.out.println(title);
			/*String Expected="EarthLink® - Page Not Found";
			 Actual=driver.getTitle();
			if(Actual.contains(Expected)){
				System.out.println("pass");
			}
			else{
				System.out.println("fail");
			}
		
			//Assert.assertEquals(Expected,  Actual);*/
			List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());


}}}}
