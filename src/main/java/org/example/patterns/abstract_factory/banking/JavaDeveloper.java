package org.example.patterns.abstract_factory.banking;

import org.example.patterns.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
