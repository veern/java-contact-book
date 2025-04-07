package io.github.veern;

public class Menu {

    final static private String HELLO_MESSAGE = "Hello, this is a Simple Console Application - Contact Management!";
    final static private String NEXT_STEP_QUESTION = "What do You want to do now?";
    final static private String POSSIBLE_ACTIONS = "Add - 1, Remove - 2, List all - 3, Search - 4, Close app - 0";

    public static void helloMessage(){
        System.out.println(HELLO_MESSAGE);
    }

    public static void nextStep(){
        System.out.println(NEXT_STEP_QUESTION);
        System.out.println(POSSIBLE_ACTIONS);
    }

}
