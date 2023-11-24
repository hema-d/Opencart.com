package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage  extends Basepage{

	public Homepage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span")
	WebElement myacc;
	
	@FindBy(linkText="Register")
	WebElement rigers;
	
	public void myaccount() {
		myacc.click();
	}
	
	public void myregister() {
		rigers.click();
	}
	

}
