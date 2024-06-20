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
import org.openqa.selenium.support.ui.Select;

public class DDT_FetchingValuesFromExcelSheet_RegistrationForm2_GroTechMinds {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		FileInputStream excelPath = new FileInputStream("C:\\Users\\MADHURI AVHAD\\eclipse-workspace\\SeleniumByMKT\\testData\\dataFile.xlsx");
		Workbook openExcel = WorkbookFactory.create(excelPath);
		
		String firstNameValue = openExcel.getSheet("firstSheet").getRow(2).getCell(1).getStringCellValue();
		WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
		firstName.sendKeys(firstNameValue);
		
		String lastNameValue = openExcel.getSheet("firstSheet").getRow(2).getCell(2).getStringCellValue();
		WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
		lastName.sendKeys(lastNameValue);
		
		String emailValue = openExcel.getSheet("firstSheet").getRow(2).getCell(5).getStringCellValue();
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys(emailValue);
		
		String phoneNumValue = NumberToTextConverter.toText(openExcel.getSheet("firstSheet").getRow(2).getCell(4).getNumericCellValue());
		WebElement phoneNum = driver.findElement(By.cssSelector("#phone"));
		phoneNum.sendKeys(phoneNumValue);
		
		WebElement gender = driver.findElement(By.cssSelector("#gender"));
		Select genderDropdown = new Select(gender);
		genderDropdown.selectByValue("female");
		
		WebElement state = driver.findElement(By.cssSelector("#state"));
		Select stateDropdown = new Select(state);
		stateDropdown.selectByVisibleText("Maharashtra");
		
		String aadhaarValue = NumberToTextConverter.toText(openExcel.getSheet("firstSheet").getRow(2).getCell(6).getNumericCellValue());
		WebElement aadhaar = driver.findElement(By.cssSelector("#aadhaar"));
		aadhaar.sendKeys(aadhaarValue);
		
		String panValue = openExcel.getSheet("firstSheet").getRow(2).getCell(7).getStringCellValue();
		WebElement pan = driver.findElement(By.cssSelector("#pan"));
		pan.sendKeys(panValue);
		
		WebElement terms = driver.findElement(By.cssSelector("#terms"));
		terms.click();
		
		WebElement submit = driver.findElement(By.cssSelector("[name='Submit']"));
		submit.click();

	}

}
