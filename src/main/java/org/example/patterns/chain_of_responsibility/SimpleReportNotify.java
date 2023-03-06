package org.example.patterns.chain_of_responsibility;

public class SimpleReportNotify extends Notifier {
    public SimpleReportNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
