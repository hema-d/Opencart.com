package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRigistratationpage;
import pageObjects.Homepage;

public class TC__001_AccountRistarationtest extends Baseclass {

	@Test
	public void test_registartion() {
		
		logger.debug("application logs");
		logger.info("logs started");
		
		try {
		Homepage p=new Homepage(driver);
		p.myaccount();
		p.myregister();
		
		AccountRigistratationpage ap=new AccountRigistratationpage(driver);
		ap.firstname("Hema");
		ap.Lastname("Sajjanapu");
		ap.Email(randomgenerated()+"@gmail.com");
		ap.Password("Qwert@79");
		ap.Privacy();
		ap.Continue();
	String str=	ap.getConfirmationMsg();
	
	Assert.assertEquals(str, "Your acc has been created");
	}
	catch(Exception e) {
		Assert.fail();
		logger.info("test failed");
	}
}
}
