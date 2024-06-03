package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Gmail {
	
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		
}

}
