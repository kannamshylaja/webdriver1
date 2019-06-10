package webdriverprgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HrmloginTc2 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/index");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
}