package workingwithcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Checkdefaultstatusofcheckboxes {

	public static void main(String[] args) {
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.spicejet.com");
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<checkbox.size();i++){
			String name=checkbox.get(i).getAttribute("name");
			if(checkbox.get(i).isSelected()){
				System.out.println(name+" "+"Active");
			}
				else{
					System.out.println(name+" "+"Inactive");
				}
			}
		}
		

	}


