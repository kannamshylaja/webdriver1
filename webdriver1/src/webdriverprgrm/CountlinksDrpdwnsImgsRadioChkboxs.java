package webdriverprgrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CountlinksDrpdwnsImgsRadioChkboxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://spicejet.com");
		//links
		List<WebElement>elements=driver.findElements(By.tagName("a")); 
		System.out.println(elements.size());
		//images
		elements=driver.findElements(By.tagName("img"));
		System.out.println(elements.size());
		//drop down
		elements=driver.findElements(By.tagName("select"));
		System.out.println(elements.size());
		//radio button
		elements=driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println(elements.size());
		//check boxes
		elements=driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(elements.size());

	}

}
