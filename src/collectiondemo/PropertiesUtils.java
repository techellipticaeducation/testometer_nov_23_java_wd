package collectiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {
	
	public static Properties getProperties(String propPath) {
		return getProperties(new File(propPath));	
	}
	
	
	public static Properties getProperties(File propPath) {
		Properties config = new Properties();
		try {
			config.load(new FileInputStream(propPath));
		}catch(Exception e) {
			
		}
		return config;	
	}
	
}
