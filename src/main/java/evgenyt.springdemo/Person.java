package evgenyt.springdemo;

import org.springframework.stereotype.Component;

/**
 * Bean that we pass to web app via context
 */

@Component
public class Person {
    private String name;

    public Person() {name = "John Doe";}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
