package workingwithscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SpecificlinkpresentornotifpresentclickElsecapturescreenshot {

	public static void main(String[] args) throws IOException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://business.mapsofindia.com/");
		List<WebElement>links=driver.findElements(By.linkText("BKFS"));
		for(int i=0;i<links.size();i++){
			if(links.get(i).isDisplayed()){
			//if(links.size()==0){
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile, new File("C:\\Users\\DELL\\Desktop\\shylu\\proof.png"));
			}
			else{
	driver.close();
			}
		}
		

	}
}
