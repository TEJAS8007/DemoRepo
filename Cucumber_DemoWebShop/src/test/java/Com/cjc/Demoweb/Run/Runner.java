package Com.cjc.Demoweb.Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//features"},glue = {"Com.cjc.DemoWe.Step"}
,tags = {"@Register,@Continue,@AddToCart,@AddressDetails"}
,format = {"pretty","html:target/Destination"})


public class Runner {

}
