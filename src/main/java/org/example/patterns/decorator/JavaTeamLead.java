package org.example.patterns.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }

    public String sendWeekReport() {
        return "Sending week report";
    }
}
