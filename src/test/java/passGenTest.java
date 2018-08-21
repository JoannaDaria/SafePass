import safePass.generators.PasswordGenerator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class passGenTest {

    @Test
    public void passGenGeneratesStringOfGivenLength(){
        Assertions.assertThat(PasswordGenerator.passGen(100).length()).isEqualTo(100);
        Assertions.assertThat(PasswordGenerator.passGen(7).length()).isEqualTo(7);
        Assertions.assertThat(PasswordGenerator.passGen(1).length()).isEqualTo(1);
        Assertions.assertThat(PasswordGenerator.passGen(0).length()).isEqualTo(0);
    }
}
