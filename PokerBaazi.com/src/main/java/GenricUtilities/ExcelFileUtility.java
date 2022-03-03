package GenricUtilities;



import java.io.FileInputStream;




import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Shobha
 *
 */

public class ExcelFileUtility {
	/**
	 * @return 
	 * @throws Throwable 
	 * 
	 */
	public String getExcelData(String sheetName,int rownum,int cellnum ) throws Throwable
	{
		 FileInputStream fis = new FileInputStream(IpathConstant.ExcelFilePath);
		 
		 Workbook wb =  WorkbookFactory.create(fis);
		 
		// DataFormatter format =new DataFormatter();
		 
		Sheet sheet= wb.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		
		
		
		return value;
		
	}
	/**
	 * 
	 * @return 
	 * @throws Throwable
	 */
	public Object[][] getxcelData(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant.ExcelFilePath);
		Workbook wb =  WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		 int lastRow= sheet.getLastRowNum();
		 int LastCell = sheet.getRow(0).getLastCellNum();
		 
		 Object [] [] data=new Object[lastRow] [LastCell];
		 for(int i=0;i<lastRow;i++)
		 {
			 for(int j=0;j<LastCell;j++)
			 {
				 data [i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
			 }
		 }
		
		return data;
	
		
		
		 
	}

}



