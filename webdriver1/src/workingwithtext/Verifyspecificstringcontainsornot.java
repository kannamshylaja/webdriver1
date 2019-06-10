package workingwithtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Verifyspecificstringcontainsornot {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("http://www.mercurytravels.co.in");
WebElement text=driver.findElement(By.xpath("//*[@id='cookieconsent:desc']"));
String Expected="shylja";
String Actual=text.getText();
if(Actual.contains(Expected)){
	System.out.println("pass");
}
else{
	System.out.println("fail");
}
	}

}