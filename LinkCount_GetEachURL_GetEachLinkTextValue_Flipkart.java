package selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount_GetEachURL_GetEachLinkTextValue_Flipkart {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=EAIaIQobChMI9rnu45nBhgMVRFhIAB0-tAvzEAAYASAAEgKQp_D_BwE");
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
