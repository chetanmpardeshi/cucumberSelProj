package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\GitSpace\\CucumberSelProject\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		
	prop.load(fis);

	
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Essentials\\Software\\driver\\chromedriver_win32\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	 
  	driver.get(prop.getProperty("url"));
   	 return driver;
		
	}
	
}
