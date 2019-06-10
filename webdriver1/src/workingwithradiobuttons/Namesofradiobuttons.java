package workingwithradiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Namesofradiobuttons {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.mercurytravels.co.in");
		List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no.of radio buttions"+" "+radio.size());
for(int i=0;i<radio.size();i++){
	System.out.println(radio.get(i).getAttribute("name"));
}

	}

}
