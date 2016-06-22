package NullObjectPatterns.Sample7;

public class Main {

    public static void main(String[] args) {

        AbstractKeyboard kb1 = KeyboardFactory.getKeyboardType("steelseries");
        AbstractKeyboard kb2 = KeyboardFactory.getKeyboardType("BTO");
        AbstractKeyboard kb3 = KeyboardFactory.getKeyboardType("Chinese OEM");
        System.out.println(kb1.getName());
        System.out.println(kb2.getName());
        System.out.println(kb3.getName());



    }
}
