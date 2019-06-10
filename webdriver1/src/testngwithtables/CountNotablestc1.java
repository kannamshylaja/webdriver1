package testngwithtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountNotablestc1 {
ProfilesIni pr;
FirefoxProfile fp;
FirefoxDriver driver;
@BeforeTest
public void open(){
	pr=new ProfilesIni();
	fp=pr.getProfile("shylaja");
	driver=new FirefoxDriver(fp);
	driver.get("https://www.timeanddate.com/worldclock/");
}
@Test
public void data(){
	List<WebElement>tables=driver.findElements(By.tagName("a"));
	System.out.println(tables.size());
}
@AfterTest
public void close(){
	driver.close();
		

}
}
