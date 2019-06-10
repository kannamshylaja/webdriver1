package workingwithtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class VerifytexttypeEitherboldornot {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("shylaja");
		FirefoxDriver driver=new FirefoxDriver(fp);
        driver.get("http://www.mercurytravels.co.in");
        WebElement text=driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div/div[2]/div/div[2]/div[1]/ul/li[4]/div/span"));
        String expected="b";
        String actual=text.getTagName();
        if(expected.equals(actual)){
        	System.out.println("bold text");
        }
        else{
        	System.out.println("normal text");
        }
	}
}
