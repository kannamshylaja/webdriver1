package webdriverprgrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropadowncountvaluesNvaluenamesTc3 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mer");
		WebElement dropdown=driver.findElement(By.id("themes"));
		List<WebElement>value=dropdown.findElements(By.tagName("option"));
		System.out.println(value.size());
		for(int i=0;i<value.size();i++){
			System.out.println(value.get(i).getText());
		}
		

	}

}
