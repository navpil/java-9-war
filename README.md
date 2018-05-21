# Java 9 and .war

Try Java 9 on a server

## Gotchas

If to uncomment

    //    public GreetingsHelperClass get() {
    //        return greetingsHelperClass;
    //    }

Then `javac` will not complain, but it will fail on Tomcat
