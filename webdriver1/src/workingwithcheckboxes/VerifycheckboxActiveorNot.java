package workingwithcheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class VerifycheckboxActiveorNot {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.spicejet.com");
		WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		student.click();
		if(student.isSelected()){
			System.out.println("working successfully");
		}
		else{
			System.out.println("fail");
		}
		

	}

}
