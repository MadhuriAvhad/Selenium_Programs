package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwon_Select_Facebook {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropdown = new Select(day);
		dayDropdown.selectByVisibleText("22");
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropdown = new Select(month);
		monthDropdown.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropdown = new Select(year);
		yearDropdown.selectByIndex(24);
		
	}

}
