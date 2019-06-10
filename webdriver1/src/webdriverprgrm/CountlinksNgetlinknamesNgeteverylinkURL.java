package webdriverprgrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CountlinksNgetlinknamesNgeteverylinkURL {

	public static void main(String[] args) {
ProfilesIni pr=new ProfilesIni();
FirefoxProfile fp=pr.getProfile("shylaja");
FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("http://www.google.com");
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println(links.size());
for(int i=0;i<links.size();i++){
	if(links.get(i).isDisplayed());

String name=links.get(i).getText();
links.get(i).click();
	String url=driver.getCurrentUrl();
	System.out.println(name+" "+url);
driver.navigate().back();
	links=driver.findElements(By.tagName("a"));
	Sleeper.sleepTightInSeconds(5);
	
}
	}

	
}
