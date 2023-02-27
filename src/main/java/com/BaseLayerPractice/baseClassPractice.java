package com.BaseLayerPractice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClassPractice {

	public static WebDriver driver; 
	public static Properties prop ;
	
	public baseClassPractice() {
		prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin.DESKTOP-31QM75N\\eclipse-workspaceNew\\ZpracticeBBDCucumber\\src\\main\\java\\com\\ConfigPractice\\demo.properties"); //load the file
			prop.load(fis);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initilisation () {
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get(prop.getProperty("url"));
	}
}
