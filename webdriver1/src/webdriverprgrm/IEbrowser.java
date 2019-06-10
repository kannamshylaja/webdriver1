package webdriverprgrm;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.Ie.driver", "C:\\Users\\DELL\\Downloads\\internet_explorer_1802480853.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
