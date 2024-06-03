package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select_GroTechMindsQuestions {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
//		1. Write A Code To Select Demo2 Using Select By Visible Text.
		WebElement Choice1 = driver.findElement(By.id("Choice1"));
		Select dropdown1 = new Select(Choice1);
		dropdown1.selectByVisibleText("Demo2");
		
//		2. Write A Code To Select SQL 15 Using Select By Value.
		WebElement Choice9 = driver.findElement(By.id("Choice9"));
		Select dropdown9 = new Select(Choice9);
		dropdown9.selectByValue("SQL15");	

//		3. Explain The Procedure Of Selecting Night 10 Dropdown?
		WebElement Choice6 = driver.findElement(By.id("Choice6")); 	// Find Dropdown WebElement
		Select dropdown6 = new Select(Choice6);						// Create a Select Object and Pass the WebElement as an option
		dropdown6.selectByValue("Night10");							// Use select method to select the dropdown option
		
		WebElement Choice7 = driver.findElement(By.id("Choice7"));
		Select dropdown7 = new Select(Choice7);
		dropdown7.selectByVisibleText("Night10");
		
//		4. Write Codes Separately To Select QTP 10 And Energy 15 Using Select By Visible Text
		WebElement Choice8_4 = driver.findElement(By.id("Choice8"));
		Select dropdown8_4 = new Select(Choice8_4);
		dropdown8_4.selectByVisibleText("QTP10");
		
		WebElement Choice4_4 = driver.findElement(By.id("Choice4"));
		Select dropdown4_4 = new Select(Choice4_4);
		dropdown4_4.selectByVisibleText("Energy15");
		
//		5. Write Codes Separately To Select QTP 9 And Energy 14 Using Select By Visible Text.
		WebElement Choice8_5 = driver.findElement(By.id("Choice8"));
		Select dropdown8_5 = new Select(Choice8_5);
		dropdown8_5.selectByVisibleText("QTP9");
		
		WebElement Choice4_5 = driver.findElement(By.id("Choice4"));
		Select dropdown4_5 = new Select(Choice4_5);
		dropdown4_5.selectByVisibleText("Energy14");
		
//		6. Write Codes Separately To Select QTP 8 And Energy 13 Using Select By Visible Text.
		WebElement Choice8_6 = driver.findElement(By.id("Choice8"));
		Select dropdown8_6 = new Select(Choice8_6);
		dropdown8_6.selectByVisibleText("QTP8");
		
		WebElement Choice4_6 = driver.findElement(By.id("Choice4"));
		Select dropdown4_6 = new Select(Choice4_6);
		dropdown4_6.selectByVisibleText("Energy13");
		
//		7. Write Codes Separately To Select QTP 7 And Energy 12 Using Select By Visible Text.
		WebElement Choice8_7 = driver.findElement(By.id("Choice8"));
		Select dropdown8_7 = new Select(Choice8_7);
		dropdown8_7.selectByVisibleText("QTP7");
		
		WebElement Choice4_7 = driver.findElement(By.id("Choice4"));
		Select dropdown4_7 = new Select(Choice4_7);
		dropdown4_7.selectByVisibleText("Energy12");
		
//		8. Write Codes Separately To Select QTP 6 And Energy 11 Using Select By Visible Text.
		WebElement Choice8_8 = driver.findElement(By.id("Choice8"));
		Select dropdown8_8 = new Select(Choice8_8);
		dropdown8_8.selectByVisibleText("QTP6");
		
		WebElement Choice4_8 = driver.findElement(By.id("Choice4"));
		Select dropdown4_8 = new Select(Choice4_8);
		dropdown4_8.selectByVisibleText("Energy11");

	}

}
