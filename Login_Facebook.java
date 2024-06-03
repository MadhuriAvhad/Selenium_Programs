package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_Facebook {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("avhad@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Madhuri");
		driver.findElement(By.name("login")).click();
		

	}

}
