package org.example.patterns.chain_of_responsibility;

public class SMSnotifier extends Notifier {
    public SMSnotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to Manager: " + message);
    }
}
