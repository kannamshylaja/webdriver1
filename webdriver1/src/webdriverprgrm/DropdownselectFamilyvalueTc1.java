package webdriverprgrm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;



public class DropdownselectFamilyvalueTc1 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		WebElement dropdown=driver.findElement(By.id("themes"));
		//dropdown.sendKeys("family");
	  Select obj=new Select(dropdown);
	  obj.selectByIndex(5);
	  Sleeper.sleepTightInSeconds(3);
	  obj.selectByVisibleText("Nature");

	}


}