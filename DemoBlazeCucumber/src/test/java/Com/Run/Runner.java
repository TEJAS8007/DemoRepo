package Com.Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//features"},glue = {"Com.cjc.mt.Def"}
,tags = {"@SignUpAction,@LoginAction"},
format = {"html:target/Destination"})



public class Runner {

	
}
