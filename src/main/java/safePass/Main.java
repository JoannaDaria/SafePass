package safePass;

import safePass.generators.PasswordGenerator;

public class Main {

    public static void main(String[] args) {

        String p= PasswordGenerator.passGen(15);
        System.out.println(p);
    }
}
