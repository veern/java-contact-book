package io.github.veern;

import java.util.Scanner;

public class App
{
    private Scanner scnr = new Scanner(System.in);
    private int status = 0;

    public static void main( String[] args )
    {
        App app = new App();
        app.loop();
    }

    private int loop(){
        Menu.helloMessage();
        Menu.nextStep();
        return status;
    }
}
