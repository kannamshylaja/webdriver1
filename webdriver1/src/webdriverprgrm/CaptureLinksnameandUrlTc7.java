package webdriverprgrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CaptureLinksnameandUrlTc7 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.bing.com");
		
		/*driver.navigate().to("http://www.yahoo.co.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
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
		}
		
		

	}

}