package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Amazon {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement text = driver.findElement(By.partialLinkText("Best"));
		text.click();
	}

}
