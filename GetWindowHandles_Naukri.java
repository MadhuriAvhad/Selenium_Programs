package selenium_Basic_Programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_Naukri {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		WebElement googleHyperText = driver.findElement(By.cssSelector(".google-text"));
		googleHyperText.click();
		
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
		
	}

}
