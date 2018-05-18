package navpil.java9ws.core.internal;

import java.util.List;

public class GreetingsHelperClass {

    private final List<String> greetings;

    public GreetingsHelperClass() {
        greetings = List.of("hola", "hello");
    }

    public List<String> getGreetings() {
        return greetings;
    }

}
