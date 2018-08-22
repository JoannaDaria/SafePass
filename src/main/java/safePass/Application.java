package safePass;

import org.apache.log4j.Logger;
import safePass.files.FilesFacade;
import safePass.generators.GeneratorType;
import safePass.model.PasswordEntry;
import safePass.model.PasswordFacade;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Application {
    final static Logger logger = Logger.getLogger(Application.class);
    final static Logger LOG = Logger.getLogger(Application.class);
    public static void main(String[] args) throws IOException {
        logger.info("Info");
//        LOG.trace("Trace level");
//        LOG.debug("Debug level");
//        LOG.info("Info level");
//        LOG.warn("Warn level");
//        LOG.error("Error level");
        FilesFacade filesFacade = new FilesFacade();
        List<PasswordEntry> entries = filesFacade.getEntries("test.txt");
        System.out.println(entries);
        PasswordFacade passwordFacade = new PasswordFacade();
        entries = new ArrayList<>();
        entries.add(passwordFacade.generatePassword("facebook", "10:53", GeneratorType.UUID, 10));
        //        System.out.println(entries);
        filesFacade.writeToFile("test.csv", entries);
    }
}