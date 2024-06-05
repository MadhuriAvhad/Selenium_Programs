package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm2_GroTechMinds {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
		firstName.sendKeys("Madhuri");
		
		WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
		lastName.sendKeys("Avhad");
		
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("avhadmadhuri28@gmail.com");
		
		WebElement phoneNo = driver.findElement(By.cssSelector("#phone"));
		phoneNo.sendKeys("9876543210");
		
		WebElement gender = driver.findElement(By.cssSelector("#gender"));
		Select genderDropdown = new Select(gender);
		genderDropdown.selectByValue("female");
		
		WebElement state = driver.findElement(By.cssSelector("#state"));
		Select stateDropdown = new Select(state);
		stateDropdown.selectByVisibleText("Maharashtra");
		
		WebElement aadhaar = driver.findElement(By.cssSelector("#aadhaar"));
		aadhaar.sendKeys("987654321012");
		
		WebElement pan = driver.findElement(By.cssSelector("#pan"));
		pan.sendKeys("ABCDE1234Z");
		
		WebElement terms = driver.findElement(By.cssSelector("#terms"));
		terms.click();
		
		WebElement submit = driver.findElement(By.cssSelector("[name='Submit']"));
		submit.click();
		
		
	}

}
