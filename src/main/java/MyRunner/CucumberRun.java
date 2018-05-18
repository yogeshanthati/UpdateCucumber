package MyRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



import com.pa.qa.util.Constants;

import Base.TestBase;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= "./src/main/java/FeatureCucumber",
	glue={"StepDefinition"},
	format={"pretty","html:test-outout","json:Json-cucumber/cucumberout.json","junit:Junit-cucumber/junit.xml"},
	dryRun=false,
	monochrome = true
	//strict=true
		)
public class CucumberRun {
@BeforeClass
	public static void  configrepo(){
	TestBase.Cofigurereport();  
}
@AfterClass
public static void  closeRepo(){
	TestBase.closeRepo(); 
}

}
