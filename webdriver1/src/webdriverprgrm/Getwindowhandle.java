package webdriverprgrm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Getwindowhandle {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		String id=driver.getWindowHandle();
		System.out.println(id);

	}

}
