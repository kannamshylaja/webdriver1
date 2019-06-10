package webdriverprgrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CountvissiblelinksNhiddenlinksTc6 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.bing.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<links.size();i++){
			if(links.get(i).isDisplayed()){
				count++;
				System.out.println(count);
				System.out.println(links.size()-count);
			}
		}
			
	}

}
