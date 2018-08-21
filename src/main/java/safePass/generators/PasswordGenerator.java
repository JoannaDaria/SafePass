package safePass.generators;
import java.util.Random;
interface PasswordGenerator {
    String generate(int length);
    GeneratorType getType();
}


//    public int[] countBound(char type) {    //helps getting proper chars in ascii
//        switch (type) {
//            int b;
//            int p;
//            case 'a':       //all
//                b = 94;
//                p = 33;
//            case 'n':       //numbers
//                b = 9;
//                p = 48;
//            case 'u':       //uppercase letters
//                b = 25;
//                p = 65;
//            case 's':       //lowercase letters
//            default:
//                b = 94;
//                p = 33;
//        }
//        return int[2]={b,p};
//    }

///MOJA WERSJA ALE BARDZO DOBRA NAPRAWDĘ PYSZANAA
/*    public static String passGen(int a) {  //wylosuj ascii n razy
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        char next;
        String pass = "";
        for (int i = 0; i < a; ++i) {
            int something = random.nextInt(94) + 33;
            next = (char) something;
            pass = sb.append(next).toString();
        }
        return pass;
    }*/

//    public static String passGen(int a, char t) {  //wylosuj ascii n razy
//        Random random = new Random();
//        StringBuilder sb = new StringBuilder();
//        char next = 0;
//        String pass = "";
//        int [] typeIndex = countBound(t);
//
//        for (int i = 0; i < a; ++i) {
//            int something = random.nextInt(b) + p;
//            next = (char) something;
//            pass = sb.append(next).toString();
//        }
//        return pass;
//    }
