import generators.PasswordGenerator;

public class Main {

    public static void main(String[] args) {

        String p= PasswordGenerator.passGen(15,55,11);
        System.out.println(p);
    }
}
