package webdriverprgrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdowncountsNgetnamesofdropdownTc2 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement>dropdown=driver.findElements(By.tagName("select"));
		System.out.println("no on dropdown"+"   "+dropdown.size());
		for(int i=0;i<dropdown.size();i++){
		System.out.println(dropdown.get(i).getAttribute("name"));
		
		

	}

}}
