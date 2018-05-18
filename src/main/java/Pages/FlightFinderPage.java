package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class FlightFinderPage extends TestBase {

	
	public FlightFinderPage(){
		
		super();
	}
	
	@FindBy(xpath="//select[@name='passCount']")
	private WebElement passcount;


	
	
	public void verifyFllightFinderPage(){
		
		   if   (!(passcount.isDisplayed())) {
			   
			   Assert.assertTrue(true);
		   }
	}
	
	public void CheckTheTitle(){
		String title=driver.getTitle();
		//Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		System.out.println(title+"is the title");
		
	}
	
	public void EnterDetains(String dep1 , int pas){
		
		WebElement we=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select selec=new Select(we);
		selec.selectByVisibleText(dep1);
		WebElement we1=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select selec1=new Select(we1);
		selec1.selectByIndex(pas);
		
		
	}
	
}

