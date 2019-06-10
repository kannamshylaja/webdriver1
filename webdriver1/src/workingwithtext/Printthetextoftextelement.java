package workingwithtext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Printthetextoftextelement {

	public static void main(String[] args) {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("shylaja");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://www.mercurytravels.co.in");
	List<WebElement>ntext=driver.findElements(By.tagName("p"));
	for(int i=0;i<ntext.size();i++){
		System.out.println(ntext.get(i).getText());
	}

	}

}
