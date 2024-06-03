package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Actions_Google {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement Gmail = driver.findElement(By.linkText("Gmail"));
		Actions action = new Actions(driver);
		action.doubleClick(Gmail).perform();

	}

}
