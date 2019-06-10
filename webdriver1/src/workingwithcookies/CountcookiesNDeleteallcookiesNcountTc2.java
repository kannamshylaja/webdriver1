package workingwithcookies;
import java.util.Set;

//import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountcookiesNDeleteallcookiesNcountTc2 {

	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.goibibo.com/");
		}
	@Test
	public void data(){
		Set<Cookie>mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		//delete all cookies
		driver.manage().deleteAllCookies();
		Set<Cookie>mycoockies=driver.manage().getCookies();
		System.out.println(mycoockies.size());
	}



}
