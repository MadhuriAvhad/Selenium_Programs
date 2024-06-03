package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Actions_Amazon {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=2934517917360272309&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302181&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		
		WebElement accountAndList = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions action = new Actions(driver);
		action.moveToElement(accountAndList).perform();
		
		WebElement signIn = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signIn.click();
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
