package dev.skamdem.greetingapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by kamdem
 * test to validate that the message is displayed
 */
public class TestGreeter {
    String message = "Raoul";
    Greeter greeter = new Greeter(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, greeter.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi " + "Raoul";
        assertEquals(message, greeter.salutationMessage());
    }
}
