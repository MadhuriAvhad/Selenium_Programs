package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* TagName(TN), 
 * ClassValue(CV), 
 * AttributeName(AN),
 * AttributeValue(AV)
 */

public class CSSselector_Types {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		#ID_value
		WebElement searchBox = driver.findElement(By.cssSelector("#APjFqb"));	
		searchBox.sendKeys("Amazon");
		searchBox.sendKeys(Keys.ENTER);
		
//		TN[AN='AV']
		Thread.sleep(2000);
		WebElement amazon = driver.findElement(By.cssSelector("div[class = 'CCgQ5 vCa9Yd QfkTvb N8QANc Va3FIb EE3Upf']"));
		amazon.click();
		
//		 .CV
		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.cssSelector(".nav-line-1-container"));
		signIn.click();
		
//		[AN='AV']
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.cssSelector("[name='email']"));
		email.sendKeys("avhadmadhuri28@gmail.com");
		
//		TN#ID
		WebElement continue_SignIn = driver.findElement(By.cssSelector("input#continue"));
		continue_SignIn.click();
		
//		TN[AN^=’SubString of the AV’]
		WebElement pass = driver.findElement(By.cssSelector("input[name^='pass']"));
		pass.sendKeys("Madhuri");
		
//		TN.CV
		WebElement finalSignIn = driver.findElement(By.cssSelector("input.a-button-input"));
		finalSignIn.click();
		
//		TN.CV[AN='AV']
		WebElement changeEmail = driver.findElement(By.cssSelector("a.a-link-normal[id ='ap_change_login_claim']"));
		changeEmail.click();
			
	}

}
