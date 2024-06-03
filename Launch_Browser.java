package selenium_Basic_Programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) throws InterruptedException
	{	
//		EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
	}
}
