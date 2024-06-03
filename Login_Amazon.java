package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Amazon {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D155259813513%26gad_source%3D1%26hvadid%3D674893540019%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301185%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D12429084398478918583%26hvtargid%3Dkwd-365295376496%26hydadcr%3D5620_2359471%26ref%3Dpd_sl_3lda0bxyzj_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin_0_1_1_41");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.name("email"));
				   email.sendKeys("avhadmadhuri28@gmail.com");
		WebElement continueEmail = driver.findElement(By.id("continue"));
		           continueEmail.click();
		WebElement password = driver.findElement(By.name("password"));
				   password.sendKeys("Madhuri");
		WebElement signIN = driver.findElement(By.id("signInSubmit"));
				   signIN.click();

	}

}
