package webdriverprgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Hrmloginbyxpath {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//ChromeDriver driver=new ChromeDriver();
		//ProfilesIni pr=new ProfilesIni();
		//FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/index");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		//driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
