package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_GoogleSearch {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("(//textarea)[1]"));
		search.sendKeys("grotechminds");
		search.sendKeys(Keys.ENTER);

	}

}
