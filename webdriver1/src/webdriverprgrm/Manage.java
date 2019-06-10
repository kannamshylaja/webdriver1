package webdriverprgrm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Manage {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.get("http://safari.com");
		driver.get("http://opera.com");
		driver.get("http://facebook.com");
		driver.get("http://shaadi.com");
		driver.quit();

	}

}
