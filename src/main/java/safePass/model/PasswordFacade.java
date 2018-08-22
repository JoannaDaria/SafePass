package safePass.model;

import org.apache.log4j.Logger;
import safePass.generators.GeneratorType;
import safePass.generators.PasswordGeneratorFacade;

public class PasswordFacade {

    final static Logger LOG = Logger.getLogger(PasswordFacade.class);

    private PasswordGeneratorFacade passwordGeneratorFacade;

    public PasswordFacade() {
        this.passwordGeneratorFacade = new PasswordGeneratorFacade();
    }

    public PasswordEntry generatePassword(String website, String login, GeneratorType strategy, int length) {
        String password = passwordGeneratorFacade.getPassword(length, strategy);
        return new PasswordEntry(website, password, login);
    }
}