package workingwithtestNGnpropertyfile;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Newtourslogin {
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
		fso=new FileInputStream("C:\\Users\\DELL\\Desktop\\webdriver1\\Newtourslogin.properties");
		pp=new Properties();
		driver.get("http://newtours.demoaut.com/");
	}
@Test
public void fillinformation() throws IOException{
pp.load(fso);
	driver.findElement(By.linkText(pp.getProperty("rgstr"))).click();
	driver.findElement(By.name(pp.getProperty("fn"))).sendKeys("sos");
	driver.findElement(By.name(pp.getProperty("ln"))).sendKeys("knm");
	driver.findElement(By.name(pp.getProperty("phn"))).sendKeys("1234567890");
	driver.findElement(By.id(pp.getProperty("eml"))).sendKeys("shy123@gmail.com");
	driver.findElement(By.name(pp.getProperty("adrs1"))).sendKeys("3-123");
	driver.findElement(By.name(pp.getProperty("adrs2"))).sendKeys("kphp");
	driver.findElement(By.name(pp.getProperty("cty"))).sendKeys("hyderabad");
	driver.findElement(By.name(pp.getProperty("st"))).sendKeys("telangana");
	driver.findElement(By.name(pp.getProperty("pin"))).sendKeys("505555");
	driver.findElement(By.name(pp.getProperty("cntry"))).sendKeys("india");
	driver.findElement(By.name(pp.getProperty("uname"))).sendKeys("nakenduku");
	driver.findElement(By.name(pp.getProperty("upwd"))).sendKeys("nikenduku123");
	driver.findElement(By.name(pp.getProperty("cnpwd"))).sendKeys("nikenduku123");
	driver.findElement(By.name(pp.getProperty("sbmt"))).click();
	Sleeper.sleepTightInSeconds(5);
}
@Test
public void capturetitle() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String Expected="nakenduku";
	String Actual=driver.findElement(By.id("email")).getText();
	Thread.sleep(5000);
	if(Actual.contains(Expected)){
		System.out.println("pass");
	}
		else{
			System.out.println("fail");
		}
	}
}
