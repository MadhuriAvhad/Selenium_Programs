package selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Actions_GroTechMindsQuestions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();

		WebElement blankSpot = driver.findElement(By.xpath("//div[@id = 'div2']"));
		Actions action = new Actions(driver);
		
//		1. Write a code to drag and drop JSON      
		WebElement jsonImg = driver.findElement(By.id("drag11"));
		WebElement container11 = driver.findElement(By.xpath("(//div[@id = 'container'])[11]"));
		action.dragAndDrop(jsonImg, blankSpot).perform();
		action.dragAndDrop(jsonImg,container11).perform();
	
//		2. Write a code to return GitHub to original position after drag and drop    
		WebElement gitHubImg = driver.findElement(By.id("drag5"));
		WebElement container5 = driver.findElement(By.xpath("(//div[@id = 'container'])[5]"));
		action.dragAndDrop(gitHubImg, blankSpot).perform();
		action.dragAndDrop(gitHubImg,container5).perform();
		
//		3 Write a code to drag and drop Selenium  
		WebElement seleniumImg = driver.findElement(By.id("drag6"));
		WebElement container6 = driver.findElement(By.xpath("(//div[@id = 'container'])[6]"));
		action.dragAndDrop(seleniumImg, blankSpot).perform();
		action.dragAndDrop(seleniumImg,container6).perform();
		
//		4 Write a code to drag and drop Cucumber 
		WebElement cucumberImg = driver.findElement(By.id("drag1"));
		WebElement container1 = driver.findElement(By.xpath("(//div[@id = 'container'])[1]"));
		action.dragAndDrop(cucumberImg, blankSpot).perform();
		action.dragAndDrop(cucumberImg,container1).perform();
		
//		5 Write a code to drag and drop Eclipse  
		WebElement eclipseImg = driver.findElement(By.id("drag4"));
		WebElement container4 = driver.findElement(By.xpath("(//div[@id = 'container'])[4]"));
		action.dragAndDrop(eclipseImg, blankSpot).perform();
		action.dragAndDrop(eclipseImg,container4).perform();
		
//		6 Write a code to drag and drop Jenkins  
		WebElement jekinsImg = driver.findElement(By.id("drag3"));
		WebElement container3 = driver.findElement(By.xpath("(//div[@id = 'container'])[3]"));
		action.dragAndDrop(jekinsImg, blankSpot).perform();
		action.dragAndDrop(jekinsImg,container3).perform();
		
//		7 Write a code to drag and drop Spring Boot  
		WebElement springBootImg = driver.findElement(By.id("drag10"));
		WebElement container10 = driver.findElement(By.xpath("(//div[@id = 'container'])[10]"));
		action.dragAndDrop(springBootImg, blankSpot).perform();
		action.dragAndDrop(springBootImg,container10).perform();
		
//		8 Write a code to drag and drop SQL 
		WebElement sqlImg = driver.findElement(By.id("drag9"));
		WebElement container9 = driver.findElement(By.xpath("(//div[@id = 'container'])[9]"));
		action.dragAndDrop(sqlImg, blankSpot).perform();
		action.dragAndDrop(sqlImg,container9).perform();

	}

}
