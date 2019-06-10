package testngwithtables;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DtfrmallrowsNclumnsTc6 {
ProfilesIni pr;
FirefoxProfile fp;
FirefoxDriver driver;
@BeforeTest
public void open(){
	pr=new ProfilesIni();
	fp=pr.getProfile("shylaja");
	driver=new FirefoxDriver(fp);
	driver.get("https://www.timeanddate.com/worldclock/");
Sleeper.sleepTightInSeconds(2);
}
@Test
public void data() throws InterruptedException{
	Thread.sleep(5000);
	String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String part2="]/td[";
	String part3="]";
	
	for(int i=1;i<=37;i++){
		for(int j=1;j<=8;j++){
			String value=driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();
			//Sleeper.sleepTightInSeconds(2);
			System.out.print(value+" ");
		}
		System.out.println();
	}}
/*@AfterTest
public void close(){
	driver.close();*/
}


