package stepdefs;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;

public class Test1 {
    @When("^I am on (.*?) page$")
    public void i_am_on_x_page(int arg1) throws Throwable {
        System.out.println("----> I am on {arg1} page");
    }

    @Then("^I see that element$")
    public void i_see_that_element() throws Throwable {
        System.out.println("----> I see that element");

    }
}
