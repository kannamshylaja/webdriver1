package workingwithcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Getnamesofcheckboxes {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.spicejet.com");
List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("no.ofcheck boxes"+" "+checkbox.size());
for(int i=0;i<checkbox.size();i++){
	System.out.println(checkbox.get(i).getAttribute("name"));
}

}
}