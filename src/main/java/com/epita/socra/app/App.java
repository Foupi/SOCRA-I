package com.epita.socra.app;

import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public void run(){
        while (true) {
            String input = adapter.read();
            if (input.contentEquals(""))
                return;
            MorseRepresentation representation;
            try {
                int numberToRepresent = Integer.valueOf(input);
                representation = new MorseRepresentation(numberToRepresent);
            }
            catch (NumberFormatException e)
            {
                representation = new MorseRepresentation(input);
            }
            adapter.write(representation.toString());
        }
    }
}
