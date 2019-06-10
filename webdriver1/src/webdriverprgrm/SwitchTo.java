package webdriverprgrm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("http://www.google.com");
    
    driver.switchTo().window("arg0");
    driver.switchTo().alert();
    driver.switchTo().frame("arg0");

	}

}
