package objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testbase.Strings;

class Token_Test extends Strings {

    private Token token;

    @BeforeEach
    void setup() {
        token = new Token(Strings.t);
    }

    @Test
    void getName_IsSet() {
        Assertions.assertEquals(Strings.t, token.getName());
    }

}
