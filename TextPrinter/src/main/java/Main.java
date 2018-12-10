import classes.Generator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generator generator = args.length > 0 ? addTokens(args) : helloWorld();
        generator.listTokenNames().forEach(System.out::println);
    }

    private static Generator addTokens(String[] args) {
        var generator = new Generator();
        Arrays.stream(args).forEach(generator::addToken);
        return generator;
    }

    private static Generator helloWorld() {
        var generator = new Generator();
        generator.addToken("Hello");
        generator.addToken("World");
        return generator;
    }
}
