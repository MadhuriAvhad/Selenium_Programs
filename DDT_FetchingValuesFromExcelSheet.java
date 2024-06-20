package selenium_Basic_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_FetchingValuesFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream excelPath = new FileInputStream("C:\\Users\\MADHURI AVHAD\\eclipse-workspace\\SeleniumByMKT\\testData\\dataFile.xlsx"); 
		Workbook openExcel =WorkbookFactory.create(excelPath);
		Sheet pointSheet = openExcel.getSheet("firstSheet");
		Row rowNum = pointSheet.getRow(1);
		Cell cellNum = rowNum.getCell(0);
		String uName1 = cellNum.getStringCellValue();
		
		System.out.println("UserName: "+uName1);
		
		String pass = pointSheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println("Password: "+pass);
		
		String phoneNum = NumberToTextConverter.toText(pointSheet.getRow(1).getCell(2).getNumericCellValue());
		System.out.println(phoneNum);
		
		
	}

}