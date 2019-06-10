package workingwithtestNGnpropertyfile;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Hrmlogin {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	Properties pp;
	@BeforeTest 
	public void open() throws IOException {
		pr=new ProfilesIni();
		fp=pr.getProfile("shylaja");
		driver=new FirefoxDriver(fp);
		fso=new FileInputStream("C:\\Users\\DELL\\Desktop\\webdriver1\\Hrmlogin.properties");
		pp=new Properties();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@Test
public void propertyfileHrmlogin() throws IOException{
	pp.load(fso);
	driver.findElement(By.id(pp.getProperty("usr"))).sendKeys("Admin");
	driver.findElement(By.id(pp.getProperty("pwd"))).sendKeys("admin123");
	driver.findElement(By.id(pp.getProperty("btn"))).click();
	Sleeper.sleepTightInSeconds(5);
	
	
	
}

}
