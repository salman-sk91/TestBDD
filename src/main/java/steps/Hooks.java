package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks{

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("In Before All...");
    }

    @Before
    public static void before(Scenario scenario) {
        System.out.println("In Before ..."+scenario.getName());

    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("In After All...");

    }











/*
    public steps.Hooks(){
        Before((Scenario scenario) -> {
            System.out.println("In Before..."+scenario.getName());
        });

    }*/






}
