package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class AccountHolder_StepDef {


    @Given("the account balance is ${int}")
    public void the_account_balance_is_$(Integer data) {
        System.out.println("The account balance is: "+ data + "" +Thread.currentThread().getId());

    }
    @Given("the card is valid")
    public void the_card_is_valid() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Thread: "+Thread.currentThread().getId());
    }
    @Given("the machine contains enough money")
    public void the_machine_contains_enough_money(DataTable data) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        List<Map<String, String>> credentials = data.asMaps(String.class, String.class);
        for (Map<String, String> cred:credentials ) {
            System.out.println(cred.get("username"));
            System.out.println(cred.get("password"));
            //modulename.verifyData(cred.get("username"),cred.get("password"));
        }

        System.out.println("Thread: "+Thread.currentThread().getId());
    }
    @When("the Account Holder requests ${int}")
    public void the_account_holder_requests_$(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("Thread: "+Thread.currentThread().getId());
    }
    @Then("the ATM should dispense ${int}")
    public void the_atm_should_dispense_$(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("Thread: "+Thread.currentThread().getId());
    }
    @Then("the account balance should be ${int}")
    public void the_account_balance_should_be_$(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("Thread: "+Thread.currentThread().getId());
    }
    @Then("the card should be returned")
    public void the_card_should_be_returned() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("Thread: "+Thread.currentThread().getId());
    }
    @Given("the machine contains {string} enough money {string}")
    public void the_machine_contains_enough_money(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
