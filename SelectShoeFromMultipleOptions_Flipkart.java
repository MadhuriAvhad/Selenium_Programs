package selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectShoeFromMultipleOptions_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> searchOptions = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int searchCount = searchOptions.size();
		System.out.println(searchCount);
		searchOptions.get(5).click();
		
		List<WebElement> result_options = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		int result_count = result_options.size();
		System.out.println(result_count);
		result_options.get(0).click();
	}

}
