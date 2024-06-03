package selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_PharmEasy {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pharmeasy.in/#searchPopoverOpened");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("(//span[@class='c-kkmdlQ c-kkmdlQ-gatHuX-structure-captionRegular c-kkmdlQ-dYJjti-weight-regular c-kkmdlQ-euWHqW-structure-inputValue c-kkmdlQ-iftOpAg-css'])[2]"));
		search.click();
		Thread.sleep(2000);
		List<WebElement> searchOptions = driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iflNgTE-css']/div/a"));
		int optionsCount = searchOptions.size();
		System.out.println(optionsCount);
		searchOptions.get(5).click();

	}

}
