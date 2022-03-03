package GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	/**
	 * Description: this method is to get common data from .properties file
	 * @author prashun
	 * @param key
	 * @return
	 * @throws Throwable 
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream file = new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}
}
