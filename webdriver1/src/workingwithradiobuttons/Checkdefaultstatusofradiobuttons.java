package workingwithradiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Checkdefaultstatusofradiobuttons {

	public static void main(String[] args) {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("shylaja");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://mercurytravels.co.in");
	List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("no.of radio buttons"+" "+radio.size());
	for(int i=0;i<radio.size();i++){
	String name=radio.get(i).getAttribute("name");
	if(radio.get(i).isSelected()){
		System.out.println(name+" "+"Active");
	}
	else{
		System.out.println(name+" "+"Inactive");
	}

	}


}}