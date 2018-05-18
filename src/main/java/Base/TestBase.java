package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.pa.qa.reportlistener.Log4j;
import com.pa.qa.util.Constants;
import com.pa.qa.util.Log;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;



public class TestBase extends Constants {
	public TestBase(){
	PageFactory.initElements(driver, this);
	}
	public static void Cofigurereport(){

		try {
			Log4j.createLog();
		} catch (Exception e) {
			e.printStackTrace();
		}
		extent = new ExtentReports(System.getProperty("user.dir") + "./TestResults/"+TestResult_Path+"/Extentreports/ExtentReport.html", true,NetworkMode.OFFLINE);
		System.out.println(TestResult_Path);
	}
	public static void closeRepo(){
		 extent.flush();
    	 extent.close();

	}
	public static void intialization(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/resources/testconfig.properties");
			prop.load(ip);
			Log.info("properties Loaded");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","./src/main/java/resources/chromedriver.exe");	
			driver = new ChromeDriver(); 
			Log.info("browser Launched");
			driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "src/main/resources/com/pa/qa/BrowserSpecDrivers/chromedriver.exe");	
			driver = new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));	
		Log.info("URL Entered");
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);	
	}
	
}
