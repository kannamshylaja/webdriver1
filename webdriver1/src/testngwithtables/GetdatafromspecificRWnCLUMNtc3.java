package testngwithtables;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetdatafromspecificRWnCLUMNtc3 {
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
	String value1=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
System.out.println(value1);
String value2=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[34]/td[3]")).getText();
System.out.println(value2);
String value3=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[21]/td[3]")).getText();
System.out.println(value3);
}
@AfterTest
public void close(){
	driver.close();
}
}
