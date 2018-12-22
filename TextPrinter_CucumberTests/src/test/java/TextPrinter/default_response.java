package TextPrinter;

import cucumber.api.java.en.*;

public class default_response {

    @Given("That it's best to be polite")
    public void that_it_s_best_to_be_polite() {
        System.out.println("1");
    }

    @When("I smile and wave")
    public void i_smile_and_wave() {
        System.out.println("2");
    }

    @Then("I should receive Hello")
    public void i_should_receive_Hello() {
        System.out.println("3");
    }



}
