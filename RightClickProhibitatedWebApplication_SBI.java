package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickProhibitatedWebApplication_SBI {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement continueLogin = driver.findElement(By.cssSelector(".login_button"));
		continueLogin.click();
		
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("Madhuri");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Avhad");
		
		WebElement captcha = driver.findElement(By.cssSelector("#loginCaptchaValue"));
		captcha.sendKeys("abcd");
		
	}

}
