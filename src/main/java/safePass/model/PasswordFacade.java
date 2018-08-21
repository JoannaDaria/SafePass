package safePass.model;

import safePass.generators.GeneratorType;
import safePass.generators.PasswordGeneratorFacade;
import safePass.model.PasswordEntry;

public class PasswordFacade {
    private PasswordGeneratorFacade passwordGeneratorFacade;
    public PasswordEntry generatePassword(String website, String login, GeneratorType strategy, int length) {
        String password = passwordGeneratorFacade.getPassword(length, strategy);
        return new PasswordEntry(website, password, login);
    }
}