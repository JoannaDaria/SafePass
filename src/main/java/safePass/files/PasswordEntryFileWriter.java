package safePass.files;
import safePass.model.PasswordEntry;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static com.opencsv.CSVWriter.DEFAULT_LINE_END;
import static com.opencsv.CSVWriter.DEFAULT_QUOTE_CHARACTER;
import static com.opencsv.CSVWriter.NO_ESCAPE_CHARACTER;

class PasswordEntryFileWriter {

    void writeToFile(String path, List<PasswordEntry> passwordEntries) throws URISyntaxException, IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        CSVWriter csvWriter = new CSVWriter(
                new FileWriter(new File(path), true), ';',
                DEFAULT_QUOTE_CHARACTER,
                NO_ESCAPE_CHARACTER,
                DEFAULT_LINE_END);
        for (PasswordEntry passwordEntry : passwordEntries) {
            csvWriter.writeNext(passwordEntry.toArray());
        }
        csvWriter.close();
    }
}
