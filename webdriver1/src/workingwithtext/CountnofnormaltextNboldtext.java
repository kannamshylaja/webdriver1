package workingwithtext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CountnofnormaltextNboldtext {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.newtours.demoout.com");
		List<WebElement>ntext=driver.findElements(By.tagName("P"));
		System.out.println("no.of normal text"+" "+ntext.size());
		List<WebElement>Btext=driver.findElements(By.tagName("B"));
		System.out.println("no.of bold text"+" "+Btext.size());
	}

}
