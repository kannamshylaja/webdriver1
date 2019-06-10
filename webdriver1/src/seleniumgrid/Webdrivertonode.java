package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Webdrivertonode {
	@Test
	public void login() throws MalformedURLException{
		DesiredCapabilities cap=null;
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		
		
	}

}
