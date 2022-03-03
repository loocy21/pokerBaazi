package GenricUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileReader.*;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class JsonFileUtility 
{
	public String readDataFromJSon(String key) throws Throwable
	{
		FileReader file= new FileReader("./CommonData6.json");
		
		JSONParser jsonobj = new JSONParser();
		 Object jobj = jsonobj.parse(file);
		 
		HashMap map = (HashMap)jobj;
		 String value = map.get(key).toString();
		return value;
		
		
		
		
		
		
		
		
	}

}
