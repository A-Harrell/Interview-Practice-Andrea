package com.interview_practice.cthms.runners;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report","json:target/cucumber.json",
		 "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/com/interview_practice/cthms/features", 
		glue = "com.interview_practice.cthms.steps", 
		tags = "@Progression", 
		dryRun = false,
		monochrome = true, 
		strict = true
)


public class RunCTHMSProgressionTest {
    
}
