package selenium_Basic_Programs;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_FileHandler_Google {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Screenshot_FileHandler_Google name = new Screenshot_FileHandler_Google();
		String className = name.getClass().getName();
		String dateTimeStamp = dateTimeStamp();
		
		TakesScreenshot ss = driver;
		File source1 = ss.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\MADHURI AVHAD\\Pictures\\TestingScreenshots\\MKT.jpg");
		FileHandler.copy(source1, destination1);
		
		WebElement search = driver.findElement(By.cssSelector("[name='q']"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		
		File source2 = ss.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\MADHURI AVHAD\\Pictures\\TestingScreenshots\\MadhuriAvhad".concat(dateTimeStamp)+".jpg");
		FileHandler.copy(source2, destination2);
		
		List<WebElement> googleMenu = driver.findElements(By.cssSelector("[class='YmvwI']"));
		System.out.println(googleMenu.size());
		googleMenu.get(1).click();
		
		File source3 = ss.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("C:\\Users\\MADHURI AVHAD\\Pictures\\TestingScreenshots\\"+className+".jpg");
		FileHandler.copy(source3, destination3);
		
		List<WebElement> newsMenu = driver.findElements(By.cssSelector("[class='kMGqad']"));
		System.out.println(newsMenu.size());
		newsMenu.get(0).click();
		
		File source4 = ss.getScreenshotAs(OutputType.FILE);
		File destination4 = new File("C:\\Users\\MADHURIAVHAD\\Pictures\\TestingScreenshots\\invalid.jpg");
		FileHandler.copy(source4, destination4);
		
	}
	
	public static String dateTimeStamp()
	{
		Date d = new Date();
		String dt = d.toString();
//		Wed Jun 05 14:21:58 IST 2024
		String date = dt.substring(8, 10);
		String month = dt.substring(4, 7);
		String year = dt.substring(24, dt.length());
		String hr = dt.substring(11, 13);
		String mt = dt.substring(14, 16);
		String sec = dt.substring(17, 19);
		
		return date+month+year+hr+mt+sec;
	}

}
