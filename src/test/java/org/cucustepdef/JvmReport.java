package org.cucustepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateReprot(String jsonpath) {
	//Step1
	File f= new File("C:\\Users\\Suruthi\\eclipse-workspace\\CucumbProject\\JVMReport");
	//step2
	 Configuration c=new Configuration(f, "Facebook");
	 c.addClassifications("OSname", "Windows 10");
	 c.addClassifications("Browser Name","EdgeBrowser");
	 c.addClassifications("Browser version","4.125");
	 
	 List<String> l1=new ArrayList<String>();
	 l1.add(jsonpath);
	 
	 ReportBuilder r= new ReportBuilder(l1, c);
	 r.generateReports();
	 
}
}
