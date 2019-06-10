package webdriverprgrm;

import org.openqa.selenium.opera.OperaDriver;

public class Operabrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "C:\\Program Files (x86)\\Opera\\launcher.exe");
	OperaDriver driver=new OperaDriver();
	driver.get("http://opera.com");

	}

}