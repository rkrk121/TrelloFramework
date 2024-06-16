package com.qsp.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String readTheDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trellocommondata.properties");
		Properties probj=new Properties(); //constructor overloading
		probj.load(fis); //method overloading
		String value = probj.getProperty(key);
		
		
    return value;		
	}

}
