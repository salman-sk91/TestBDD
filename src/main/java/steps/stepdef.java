package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class stepdef {

    @Given("User has the cpability to navigate")
    public void user_has_the_cpability_to_navigate() {
        System.out.println("User has the capability to navigate");
    }
    @When("User navigates to flipkart home page")
    public void user_navigates_to_flipkart_home_page() {

    }
    @Then("User is able to view flipkart landing page")
    public void user_is_able_to_view_flipkart_landing_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

       /* public stepdef() {

            Given("I have {int} cukes in my bellyz", (int1) -> {
                System.out.println("Passed.....Finally");
            });

            Given("User navigates to home page", () -> {
                // Write code here that turns the phrase above into concrete actions
                //throw new io.cucumber.java8.PendingException();
            });
            When("User enters username {string}", (String string) -> {
                // Write code here that turns the phrase above into concrete actions
                //throw new io.cucumber.java8.PendingException();
            });
            Then("User enters password {string} and {string}", (String string, String string2) -> {
                // Write code here that turns the phrase above into concrete actions
                //throw new io.cucumber.java8.PendingException();
            });


        }*/

    @Given("I have {int} cukes in my bellyz")
    public void i_have_cukes_in_my_bellyz(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();

    }

    @Given("User has the cpability to navigate {int}")
    public void user_has_the_cpability_to_navigate(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("User navigates to flipkart home page {int}")
    public void user_navigates_to_flipkart_home_page(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Given("User navigates to home page")
    public void user_navigates_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enters username {string}")
    public void user_enters_username(String string) {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("User enters password {string} and {string}")
    public void user_enters_password_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("User enters username")
    public void user_enters_username_text(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<String> text= dataTable.asList();
        for (String tex:text) {
            System.out.println("Text: "+tex);
        }

        List<Map<String, String>> mp = dataTable.asMaps(String.class, String.class);
        System.out.println("Salman: "+mp.get(0).get("text"));
        System.out.println("Salman: "+mp.get(1).get("text"));



    }

}

