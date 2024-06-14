package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/adactin.feature"},
                 glue = {"adactin"},
                 plugin = {"pretty",
                		    "html:C:\\maven\\adactin1\\target\\report.html",
                            "json:C:\\maven\\adactin1\\target\\report.json",
                            "junit:C:\\maven\\adactin1\\target\\report.xml",
                            "rerun:C:\\maven\\adactin1\\target\\rerun.txt"},
                	 
                 
                  dryRun = false,
                  monochrome = true,
                   snippets = SnippetType.CAMELCASE
		                                                         )
public class runner {

}
