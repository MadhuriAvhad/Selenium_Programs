package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Alert_GrowTechMinds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();

		WebElement click = driver.findElement(By.cssSelector(".btnjs"));
		click.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
