package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateNewAccount_Amazon {
	
	public static void main(String[] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9301185%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D2120210749882810711%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26k%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_e%26tag%3Dgooginhydr1-21%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin_0_1_1_41");
		
		WebElement createAccount = driver.findElement(By.id("createAccountSubmit"));
				   createAccount.click();
		WebElement firstAndLastName = driver.findElement(By.name("customerName"));
			       firstAndLastName.sendKeys("Madhuri Avhad");
	    WebElement phoneNo = driver.findElement(By.id("ap_phone_number"));
	    	       phoneNo.sendKeys("9876543210");       
	    WebElement password = driver.findElement(By.name("password"));
	               password.sendKeys("Madhuri");
	    WebElement verify = driver.findElement(By.id("continue"));
		           verify.click();
	}

}
