package cucumberreport;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class cucumberreport {
	public static void main(String[] args) {
		
	
	
	 File f = new File("C:\\Users\\parip\\Desktop\\report\\adactreport");
	 
	                  List<String> list  = new LinkedList<String>();
	                  list.add("C:\\maven\\adactin1\\target\\report.json");
	                  
	                 String  projectname ="adactin";
	                  
	                  Configuration con = new Configuration(f,projectname);
	                  con.addClassifications("Environment", "Production");
	                  con.addClassifications("Browser", "Chrome");
	                  con.addClassifications("OS", "Windows 10");
	                  con.addClassifications("Team", "QA Team");
	                  con.addClassifications("Execution Mode", "Headless");
	                  con.addClassifications("Database", "MySQL");
	                  con.addClassifications("Test Type", "Regression");
	                  con.addClassifications("Locale", "en_US");
	                  con.setBuildNumber("1");
	                  
	                  ReportBuilder rb = new ReportBuilder(list, con);
	                  rb.generateReports();
	                  
	                  System.out.println("reported is generated for "+projectname);
	                  
	                

	 

}
}