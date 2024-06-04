package selenium_Basic_Programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_AddToCart_Flipkart {

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
		
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		String parentID =  it.next();
		String childID = it.next();
		System.out.println(windowIDs);
		System.out.println(parentID);
		System.out.println(childID);
		
// 		driver.close(); 
/* This will close parent window because control is still on parent window 
 * even if parent window is close it does not mean it will move to the child window 
*/
		driver.switchTo().window(childID);
		
// 		driver.close(); 
/* This will close child window because control is moved on child window 
*/		
		WebElement addToCart = driver.findElement(By.cssSelector("[class = 'QqFHMw vslbG+ In9uk2']"));
		addToCart.click();
		
	}

}
