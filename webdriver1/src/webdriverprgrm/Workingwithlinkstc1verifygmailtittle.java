package webdriverprgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Workingwithlinkstc1verifygmailtittle {

	public static void main(String[] args) {
		//open browser navigate to google
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		//click on GMAIL link
		driver.findElement(By.linkText("Gmail")).click();
		//verify title of next page
		String expected="Gmail";
		String actual=driver.getTitle();
		if(actual.contains(expected)){
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
	}

}
