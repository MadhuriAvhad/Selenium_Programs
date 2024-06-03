package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Actions_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		WebElement MenTshirt = driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
		action.moveToElement(fashion).perform();
		Thread.sleep(2000);
		action.moveToElement(MenTshirt).click().perform();
		

	}

}
