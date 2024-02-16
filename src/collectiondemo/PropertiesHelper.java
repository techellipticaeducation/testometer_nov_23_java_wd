package collectiondemo;

import java.util.Properties;

public class PropertiesHelper {
	public static void main(String[] args) {
		String propFilePath = System.getProperty("user.dir")+"\\prop\\config.properties";
		Properties config = PropertiesUtils.getProperties(propFilePath);
		String executingEnv = config.getProperty("env");

		String envFilePath = System.getProperty("user.dir")+"\\prop\\"+executingEnv+".properties";
		Properties envConfig = PropertiesUtils.getProperties(envFilePath);
		System.out.println(envConfig.getProperty("url"));
		System.out.println(envConfig.getProperty("username"));
		System.out.println(envConfig.getProperty("password"));


	}
}
