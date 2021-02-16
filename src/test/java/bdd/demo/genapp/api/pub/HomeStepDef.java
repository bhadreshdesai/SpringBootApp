package bdd.demo.genapp.api.pub;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef {
    @Given("I set Home->About api endpoint")
    public void i_set_Home_About_api_endpoint() {
    }

    @When("I do a GET request")
    public void i_do_a_GET_request() {
    }

    @Then("I receive a valid response")
    public void i_receive_a_valid_response() {
    }

    @Given("the client calls \\/hello")
    public void the_client_calls_hello() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("the client receives server version hello")
    public void the_client_receives_server_version_hello() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
