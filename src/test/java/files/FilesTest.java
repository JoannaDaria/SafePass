package files;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import safePass.files.FilesFacade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilesTest {

    @Test
            public void IsReadingPrepreparedFile() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("baza.txt", "UTF-8");
        writer.println("Daria; kot; smiesznosc");
        writer.println("Kalinka; maja; wiersze");
        writer.close();
        Assertions.assertThat(BufferedReader.read("baza.txt").equals

    }
}
