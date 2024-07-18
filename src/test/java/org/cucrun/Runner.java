package org.cucrun;

import org.cucustepdef.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Suruthi\\eclipse-workspace\\CucumbProject\\src\\test\\resources\\Featurefiles\\FBlogin.feature",
glue = "org.cucustepdef",monochrome=true,plugin = {"html:HtmlReport\\report1.html","junit:JunitReport\\Jreport.xml",
		"json:JsonReport\\jsonreport.json"})

public class Runner {
@AfterClass
public static void AftClass() {
	JvmReport.generateReprot("C:\\Users\\Suruthi\\eclipse-workspace\\CucumbProject\\JsonReport\\jsonreport.json");

}
}
