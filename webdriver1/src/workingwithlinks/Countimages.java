package workingwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countimages {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe" );
	//ChromeDriver driver=new ChromeDriver();
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("shylaja");
	FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.flipkart.com/");
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());

	}

}
