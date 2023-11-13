package dev.skamdem.greetingapp;

/**
 * Created by kamdem
 */
public class Greeter {
    private String message;

    public Greeter(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public String salutationMessage() {
        message = "Hi " + message;
        System.out.println(message);
        return message;
    }
}


