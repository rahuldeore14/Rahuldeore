package com.BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	// global
	public static WebDriver driver;
	public static Properties prop;

	// this is constructor and start with only class name not used static 
	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Rahul\\eclipse-workspace\\OrangeHRMTestNG\\src\\main\\java\\com\\Config\\config.properties");
					
			prop.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void intialization() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "C:\\Users\\Rahul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWait"))));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("pageLoadtime"))));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}
}
