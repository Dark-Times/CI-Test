package classes;

import objects.Token;

import java.util.LinkedList;
import java.util.List;

public class Generator {

    private List<Token> CurrentTokens;

    public Generator() {
        CurrentTokens = new LinkedList<>();
    }

    public void addToken(String name) {
        CurrentTokens.add(new Token(name));
    }

    List<Token> getCurrentTokens() {
        return CurrentTokens;
    }

    public List<String> listTokenNames() {
        List<String> list = new LinkedList<>();
        CurrentTokens.forEach(t -> list.add(t.getName()));
        return list;
    }

    boolean removeToken(String name) {
        if (CurrentTokens.stream().noneMatch(token -> token.getName().equals(name))) return false;
        CurrentTokens.removeIf(token -> token.getName().equals(name));
        return CurrentTokens.stream().noneMatch(token -> token.getName().equals(name));
    }
}
