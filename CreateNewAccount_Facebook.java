package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccount_Facebook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Madhuri");
		driver.findElement(By.name("lastname")).sendKeys("Avhad");
		driver.findElement(By.name("reg_email__")).sendKeys("avhad@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Madhuri");
		driver.findElement(By.name("websubmit")).click();

	}

}
