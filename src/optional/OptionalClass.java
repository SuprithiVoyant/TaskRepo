package optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String value = getValue();

        Optional<String> optionalValue = Optional.ofNullable(value);

        if (optionalValue.isPresent()) {
            System.out.println("Value: " + optionalValue.get());
        } else {
            System.out.println("No value found, using default: " + optionalValue.orElse("Default Value"));
        }
    }

    public static String getValue() {
        //return null;
        return "hello";
    }
}

//Optional class is mainly used for avoiding null pointer exception.
//has methods like isPresent(), isEmpty(), get()
//it's a final class
//it helps in writing clean and null free code
