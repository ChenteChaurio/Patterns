package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + String.join(" ", args[0]) + "!");
        } else {
            System.out.println("Hello World!");
        }
    }
}
