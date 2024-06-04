package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_GroTechMinds {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement chooseFile = driver.findElement(By.cssSelector("#file"));
		chooseFile.sendKeys("C:\\Users\\MADHURI AVHAD\\Downloads\\MadhuriAvhadResume_23_05_2024_11_12_51_am.pdf");
		

	}

}

