package runners;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src\\test\\java\\features",
	glue="com.saucedemo.stepdefinitions",
	plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	monochrome=true)
	public class TestRunner extends AbstractTestNGCucumberTests {
		

	}


