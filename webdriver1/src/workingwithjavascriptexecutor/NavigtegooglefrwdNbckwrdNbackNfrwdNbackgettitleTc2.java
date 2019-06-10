package workingwithjavascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NavigtegooglefrwdNbckwrdNbackNfrwdNbackgettitleTc2 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.google.com/");
	}
	@Test
	public void login() throws InterruptedException{
		driver.navigate().to("https://www.facebook.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.history.back()");
	Thread.sleep(5000);
	js.executeScript("window.history.forward()");
	Thread.sleep(5000);
	String title=js.executeScript("return document.title").toString();
	System.out.println(title);
	
	




}}




