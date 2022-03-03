package GenricUtilities;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;





	public class SampleDataProvider
	{

		@DataProvider(name="TestDataProvider")
		public static Object[][] getExcelData() throws  Throwable
		{
			
			int noofrows =getRowCount(IpathConstant.ExcelFilePath, "Sheet3");
			int noofcolumns= getColoumCount(IpathConstant.ExcelFilePath, "Sheet3");

			Object [][] workflowdata = new Object[noofrows][noofcolumns];

			for (int i = 1; i <= noofrows; i++) 
			{
				String data[] = getRowData(IpathConstant.ExcelFilePath, "Sheet3", i);

				for (int j = 0; j < data.length; j++) {

					workflowdata[i - 1][j] = data[j];
				}

			}
			return workflowdata;
		}


		public static synchronized int getColoumCount(String sPath, String sSheet) {
			int colnum = 0;
			try {
				FileInputStream fis = new FileInputStream(sPath);
				Workbook wb = (Workbook) WorkbookFactory.create(fis);
				Sheet sht = wb.getSheet(sSheet);
				colnum = sht.getRow(0).getPhysicalNumberOfCells();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return colnum;
		}

		public static synchronized int getRowCount(String sPath, String sSheet) {
			int iRowNum = 0;
			try {
				FileInputStream fis = new FileInputStream(sPath);
				Workbook wb = (Workbook) WorkbookFactory.create(fis);
				Sheet sht = wb.getSheet(sSheet);
				iRowNum = sht.getLastRowNum();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return iRowNum;
		}
		public static synchronized  String[] getRowData(String sFilePath, String sSheet, int rowNo) {
			DataFormatter dataFormatter = new DataFormatter();
			String sData[] = null;
			try {
				FileInputStream fis = new FileInputStream(sFilePath);
				Workbook wb = (Workbook) WorkbookFactory.create(fis);
				Sheet sht = wb.getSheet(sSheet);
				int iCellNum = sht.getRow(rowNo).getPhysicalNumberOfCells();
				sData = new String[iCellNum];

				for (int j = 0; j < iCellNum; j++) {
					Cell cell = sht.getRow(rowNo).getCell(j);
					sData[j] = dataFormatter.formatCellValue(cell);
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
			return sData;
		}

	}
