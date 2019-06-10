package workingwithscreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Clickongmailcapturescreenshotofgmail {

	public static void main(String[] args) throws IOException {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("shylaja");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://www.google.com");
	String title=driver.getTitle();
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("C:\\Users\\DELL\\Desktop\\shylu"+title+".png"));
	driver.findElement(By.linkText("Gmail")).click();
	String title1=driver.getTitle();
	File srcFile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile1, new File("C:\\Users\\DELL\\Desktop\\shylu"+title1+".png"));

	}

}
