package navpil.java9ws.core;

import navpil.java9ws.core.internal.GreetingsHelperClass;

import java.util.List;

public class GreetingsList {

    private final GreetingsHelperClass greetingsHelperClass;

    public GreetingsList() {
        greetingsHelperClass = new GreetingsHelperClass();
    }

    public List<String> getGreetings() {
        return greetingsHelperClass.getGreetings();
    }

//    public GreetingsHelperClass get() {
//        return greetingsHelperClass;
//    }
}
