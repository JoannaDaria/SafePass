package safePass.generators;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import java.util.Random;

public class PasswordGeneratorFacadeTest {
    @Test
    public void givenGeneratorTypes_WhenGeneratingPasswordWithTypeAndLength_ThenPasswordIsGenerated() {
        GeneratorType[] generatorTypes = GeneratorType.values();
        PasswordGeneratorFacade passwordGeneratorFacade = new PasswordGeneratorFacade();
        Random random = new Random();
        for (GeneratorType generatorType : generatorTypes) {
            int len = random.nextInt(100) + 1;
            String password = passwordGeneratorFacade.getPassword(len, generatorType);
            Assertions.assertThat(password).isNotNull().isNotBlank();
            Assertions.assertThat(password.length()).isEqualTo(len);
        }
    }
}
