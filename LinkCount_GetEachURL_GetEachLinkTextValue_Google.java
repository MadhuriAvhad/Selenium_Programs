package selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount_GetEachURL_GetEachLinkTextValue_Google {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int links_Count = links.size();
		System.out.println(links_Count);
		
		for(int i = 0; i<links_Count; i++)
		{
			WebElement eachLink = links.get(i);
			String url = eachLink.getAttribute("href");
			String urlName = eachLink.getText();
			System.out.println(urlName + " -> " +url);
			System.out.println();
		}

	}

}
