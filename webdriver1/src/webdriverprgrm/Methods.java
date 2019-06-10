package webdriverprgrm;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Methods {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		//driver.navigate().to("http://yahoo.co.in");
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(2);
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	System.out.println(url);
		System.out.println(title);
		

	}

}














