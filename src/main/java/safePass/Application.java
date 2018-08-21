package safePass;
import org.apache.log4j.Logger;
import safePass.files.FilesFacade;
import safePass.model.PasswordEntry;

import java.io.IOException;
import java.util.List;


class Application {

    final static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        logger.info("Info");
        FilesFacade filesFacade = new FilesFacade();
        List<PasswordEntry> entries = filesFacade.getEntries("test.txt");
        System.out.println(entries);

        filesFacade.writeToFile("test.csv", entries);
    }
}