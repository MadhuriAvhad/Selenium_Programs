package selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount_GetEachURL_GetEachLinkTextValue_Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=1678934651630936651&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007785&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
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
