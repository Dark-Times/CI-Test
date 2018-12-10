package classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testbase.Strings;

class Generator_Test extends Strings {

    private Generator generator;

    private void addToken() {
        generator.addToken(Strings.t);
    }

    private void addMultipleTokens() {
        generator.addToken(Strings.t);
        generator.addToken(Strings.t1);
    }

    @BeforeEach
    void setup() {
        generator = new Generator();
    }

    @Test
    void listTokenNames_initialised() {
        Assertions.assertNotNull(generator.listTokenNames());
    }

    @Test
    void listTokenNames_addToken() {
        addToken();
        Assertions.assertEquals(1, generator.listTokenNames().size());
    }

    @Test
    void listTokenNames_addMultipleTokens() {
        addMultipleTokens();
        Assertions.assertEquals(2, generator.listTokenNames().size());
    }

    @Test
    void listTokenNames_removeToken() {
        addMultipleTokens();
        generator.removeToken(Strings.t);
        Assertions.assertFalse(generator.listTokenNames().stream().anyMatch(token -> token.equals(Strings.t)));
    }

    @Test
    void getCurrentTokens_initialised() {
        Assertions.assertNotNull(generator.getCurrentTokens());
    }

    @Test
    void getCurrentTokens_addToken() {
        addToken();
        Assertions.assertEquals(1, generator.getCurrentTokens().size());
    }

    @Test
    void getCurrentTokens_addMultipleTokens() {
        addMultipleTokens();
        Assertions.assertEquals(2, generator.getCurrentTokens().size());
    }

    @Test
    void getCurrentTokens_removeToken() {
        addMultipleTokens();
        generator.removeToken(Strings.t);
        Assertions.assertFalse(generator.getCurrentTokens().stream().anyMatch(token -> token.getName().equals(Strings.t)));
    }

    @Test
    void removeToken_returnsTrueWhenItemExists() {
        addMultipleTokens();
        Assertions.assertTrue(generator.removeToken(Strings.t));
    }

    @Test
    void removeToken_returnsFalseWhenItemDoesNotExist() {
        addMultipleTokens();
        Assertions.assertFalse(generator.removeToken(Strings.t2));
    }

    @Test
    void doAThing() {
        System.out.println("Hello you");
    }
}