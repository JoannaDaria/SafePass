package safePass.model;

import safePass.generators.GeneratorType;
import safePass.generators.PasswordGeneratorFacade;

public class PasswordFacade {

    private PasswordGeneratorFacade passwordGeneratorFacade;

    public PasswordFacade() {
        this.passwordGeneratorFacade = new PasswordGeneratorFacade();
    }

    public PasswordEntry generatePassword(String website, String login, GeneratorType strategy, int length) {
        String password = passwordGeneratorFacade.getPassword(length, strategy);
        return new PasswordEntry(website, password, login);
    }
}
