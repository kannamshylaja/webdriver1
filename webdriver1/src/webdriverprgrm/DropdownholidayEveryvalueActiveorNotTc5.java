package webdriverprgrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownholidayEveryvalueActiveorNotTc5 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		WebElement dropdown=driver.findElement(By.id("themes"));
		List<WebElement>values=dropdown.findElements(By.tagName("option"));
		for(int i=0;i<values.size();i++){

			String vname=values.get(i).getText();
			values.get(i).click();
			if(values.get(i).isDisplayed()){
			System.out.println(vname+""+"active");
			}
		else{
				System.out.println(vname+""+"inactive");
			}
		}
		
	}
	

	}


