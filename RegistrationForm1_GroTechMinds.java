package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm1_GroTechMinds {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.cssSelector("#fname"));
		firstName.sendKeys("Madhuri");
		
		WebElement lastName = driver.findElement(By.cssSelector("[type='lname']"));
		lastName.sendKeys("Avhad");
		
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("avhadmadhuri28@gmail.com");
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Madhuri");
		
		WebElement female = driver.findElement(By.cssSelector("input#Female"));
		female.click();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		skills.sendKeys("Automation Testing");
		
		WebElement country = driver.findElement(By.cssSelector("#Country"));
		Select countryDropdown = new Select(country);
		countryDropdown.selectByVisibleText("India ");
		
		WebElement presentAddress = driver.findElement(By.name("Present-Address"));
		presentAddress.sendKeys("Kalyan, Maharashtra");
		
		WebElement permanentAddress = driver.findElement(By.name("Permanent-Address"));
		permanentAddress.sendKeys("Goregaon, Maharashtra");
		
		WebElement pincode = driver.findElement(By.cssSelector("#Pincode"));
		pincode.sendKeys("khfskjh421301");
		
		WebElement religion = driver.findElement(By.cssSelector("#Relegion"));
		Select religionDropdown = new Select(religion);
		religionDropdown.selectByValue("Hindu");
		
		WebElement chooseFile = driver.findElement(By.cssSelector("#file"));
		chooseFile.sendKeys("C:\\Users\\MADHURI AVHAD\\Downloads\\IMG-20240527-WA0004.jpg");
		
		WebElement readyToLocate = driver.findElement(By.cssSelector("#relocate"));
		readyToLocate.click();
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
		
		driver.switchTo().alert().accept();

	}

}
