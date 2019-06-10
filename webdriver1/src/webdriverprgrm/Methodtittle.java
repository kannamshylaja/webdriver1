package webdriverprgrm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Methodtittle {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String source=driver.getPageSource();
		System.out.println(source);

		

	}

}
