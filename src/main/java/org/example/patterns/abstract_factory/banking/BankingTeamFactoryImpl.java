package org.example.patterns.abstract_factory.banking;

import org.example.patterns.abstract_factory.Developer;
import org.example.patterns.abstract_factory.ProjectManager;
import org.example.patterns.abstract_factory.ProjectTeamFactory;
import org.example.patterns.abstract_factory.Tester;

public class BankingTeamFactoryImpl implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
