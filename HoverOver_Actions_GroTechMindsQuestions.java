package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Actions_GroTechMindsQuestions {

	public static void main(String[] args) {

//		1. Write A Code To Hoverover Demo 1 And Click On Practice 3
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://grotechminds.com/hoverover/");
		driver1.manage().window().maximize();
		Actions action1 = new Actions(driver1);
		WebElement demo1 = driver1.findElement(By.xpath("(//div[@class='toolrip4'])[1]"));
		WebElement practice3 = driver1.findElement(By.xpath("(//div[@class='popup4'])[3]"));
		action1.moveToElement(demo1).perform();
		action1.moveToElement(practice3).click().perform();
		
//		2. Write A Program To Hoverover Demo 4 And Click On Practice 10
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://grotechminds.com/hoverover/");
		driver2.manage().window().maximize();
		Actions action2 = new Actions(driver2);
		WebElement demo4 = driver2.findElement(By.xpath("//div[@class='toolrip6']"));
		WebElement practice10 = driver2.findElement(By.xpath("(//div[@class='popup6'])[10]"));
		action2.moveToElement(demo4).perform();
		action2.moveToElement(practice10).click().perform();
		
//		3. Write A Program To Hoverover Demo 5 And Click On Practice 1
		ChromeDriver driver3 = new ChromeDriver();
		driver3.get("https://grotechminds.com/hoverover/");
		driver3.manage().window().maximize();
		Actions action3 = new Actions(driver3);
		WebElement demo5 = driver3.findElement(By.xpath("//div[@class='toolrip7']"));
		WebElement practice1 = driver3.findElement(By.xpath("(//div[@class='popup7'])[1]"));
		action3.moveToElement(demo5).perform();
		action3.moveToElement(practice1).click().perform();
		
//		4. Write A Program To Hoverover Demo 2 And Click On Practice 6
		ChromeDriver driver4 = new ChromeDriver();
		driver4.get("https://grotechminds.com/hoverover/");
		driver4.manage().window().maximize();
		Actions action4 = new Actions(driver4);
		WebElement demo2_4 = driver4.findElement(By.xpath("(//div[@class='toolrip4'])[2]"));
		WebElement practice6 = driver4.findElement(By.xpath("(//div[@class='popup4'])[16]"));
		action4.moveToElement(demo2_4).perform();
		action4.moveToElement(practice6).click().perform();
		
//		6. Write A Program To Hoverover Demo 2 And Click On Practice 8
		ChromeDriver driver6 = new ChromeDriver();
		driver6.get("https://grotechminds.com/hoverover/");
		driver6.manage().window().maximize();
		Actions action6 = new Actions(driver6);
		WebElement demo2_6 = driver6.findElement(By.xpath("(//div[@class='toolrip4'])[2]"));
		WebElement practice8 = driver6.findElement(By.xpath("(//div[@class='popup4'])[18]"));
		action6.moveToElement(demo2_6).perform();
		action6.moveToElement(practice8).click().perform();
			
//		7. Write A Program To Hoverover Demo 2 And Click On Practice 9
		ChromeDriver driver7 = new ChromeDriver();
		driver7.get("https://grotechminds.com/hoverover/");
		driver7.manage().window().maximize();
		Actions action7 = new Actions(driver7);
		WebElement demo2_7 = driver7.findElement(By.xpath("(//div[@class='toolrip4'])[2]"));
		WebElement practice9 = driver7.findElement(By.xpath("(//div[@class='popup4'])[19]"));
		action7.moveToElement(demo2_7).perform();
		action7.moveToElement(practice9).click().perform();

	}

}
