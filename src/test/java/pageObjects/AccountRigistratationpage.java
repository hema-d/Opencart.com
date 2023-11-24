package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRigistratationpage extends Basepage{

	public AccountRigistratationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement Lname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement paswrd;
	
	@FindBy(name="agree")
	WebElement privacy;
	
	@FindBy(xpath="//*[@id=\"form-register\"]/div/div/button")
	WebElement conbtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	

	public void firstname(String name) {
		fname.sendKeys(name);
		
	}
	
	
	public void Lastname(String name1) {
		Lname.sendKeys(name1);
		
	}
	
	public void Email(String ename) {
		email.sendKeys(ename);
		
	}
	
	public void Password(String pname) {
		paswrd.sendKeys(pname);
		
	}
	
	public void Privacy() {
		
		privacy.click();
	}
	
   public void Continue() {
		
		conbtn.click();
	}
	
   public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
	
	
	
}
