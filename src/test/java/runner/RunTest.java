package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
     (
       features="src/test/resources/BUSINESS_LIGIC", 
       glue="mapping", 
        plugin="pretty"
            	 	 
            		 
      )


public class RunTest extends AbstractTestNGCucumberTests
{

	
}
