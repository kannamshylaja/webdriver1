package webdriverprgrm;

import org.openqa.selenium.safari.SafariDriver;

public class Safaribrowser {

	public static void main(String[] args) {
		SafariDriver driver=new SafariDriver();
		driver.get("http://google.com");

	}

}
