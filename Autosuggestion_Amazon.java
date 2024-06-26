package selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/stores/page/D6F3B015-763C-48D9-978C-A34E653BCA0A/?_encoding=UTF8&store_ref=SB_A0701941ILZ4NAI5HAJ9-A064219839STD63KICTEF&pd_rd_plhdr=t&aaxitk=249fa55cc6c07d49a637ca5b9c74d696&hsa_cr_id=0&lp_asins=B0CMCQ8GJV%2CB01MTQ5M7B%2CB09RX5V6TK&lp_query=shoe&lp_slot=auto-sparkle-hsa-tetris&ref_=sbx_be_s_sparkle_lsi4d_bkgd&pd_rd_w=UfcTq&content-id=amzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d%3Aamzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d&pf_rd_p=df9fe057-524b-4172-ac34-9a1b3c4e647d&pf_rd_r=SWBYAZYF093KXJK1YBX1&pd_rd_wg=Fvk6M&pd_rd_r=26e35c44-47d2-423e-b6a6-f4afcc1ac850");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> search_results = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int search_count = search_results.size();
		System.out.println(search_count);
		search_results.get(5).click();
	}

}
