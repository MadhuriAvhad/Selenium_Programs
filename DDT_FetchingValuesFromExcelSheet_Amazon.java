package selenium_Basic_Programs;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DDT_FetchingValuesFromExcelSheet_Amazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D453630397977240177%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301185%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		FileInputStream excelPath = new FileInputStream("C:\\Users\\MADHURI AVHAD\\eclipse-workspace\\SeleniumByMKT\\testData\\dataFile.xlsx");
		Workbook openExcel = WorkbookFactory.create(excelPath);
		            
		String emailValue = openExcel.getSheet("firstSheet").getRow(1).getCell(5).getStringCellValue();
		WebElement email = driver.findElement(By.cssSelector("#ap_email"));
		email.sendKeys(emailValue);

		WebElement continueToLogin = driver.findElement(By.cssSelector("#continue"));
		continueToLogin.click();
		
		String passwordValue = openExcel.getSheet("firstSheet").getRow(1).getCell(3).getStringCellValue();
		WebElement password = driver.findElement(By.cssSelector("#ap_password"));
		password.sendKeys(passwordValue);
		
		WebElement signIN = driver.findElement(By.cssSelector("#signInSubmit"));
		signIN.click();
		
		WebElement AccounAndList = driver.findElement(By.cssSelector(".nav-line-1-container"));
		Actions actions = new Actions(driver);
		actions.moveToElement(AccounAndList).perform();
		
		WebElement signOut = driver.findElement(By.cssSelector("#nav-item-signout"));
		actions.moveToElement(signOut).click().perform();
		
		WebElement createNewAccount = driver.findElement(By.cssSelector("#createAccountSubmit"));
		createNewAccount.click();
		
		String nameValue = openExcel.getSheet("firstSheet").getRow(1).getCell(0).getStringCellValue();
		WebElement firstLastName = driver.findElement(By.cssSelector("#ap_customer_name"));
		firstLastName.sendKeys(nameValue);
		
		String phoneNumValue = NumberToTextConverter.toText(openExcel.getSheet("firstSheet").getRow(1).getCell(2).getNumericCellValue());
		WebElement phoneNum = driver.findElement(By.cssSelector("#ap_phone_number"));
		phoneNum.sendKeys(phoneNumValue);
		
		WebElement passwordNewAccount = driver.findElement(By.cssSelector("#ap_password"));
		passwordNewAccount.sendKeys(passwordValue);
		
		
	}

}
