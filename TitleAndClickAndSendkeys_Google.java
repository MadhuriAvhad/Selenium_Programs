package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndClickAndSendkeys_Google{

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("Title of the Web Application is "+driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("India");
//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

}
