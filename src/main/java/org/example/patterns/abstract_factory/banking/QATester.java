package org.example.patterns.abstract_factory.banking;

import org.example.patterns.abstract_factory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code");
    }
}
