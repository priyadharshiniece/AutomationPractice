package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	


	public static void initConfig() {

		if (Constants.browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
		} else if (Constants.browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get(Constants.url);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.MILLISECONDS);
		
	}
	

	/*
	 * public static void quit() { driver.quit(); }
	 */
}
