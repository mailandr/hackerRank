package codingCampus.Selbstkontrolle;

public class AufgabeStringManipulation2 {
    public static void main(String[] args) {

        String[] text = {"abc100A", "Abc100A", "luke010A", "test101ABCDE", "test1ABCDE" };

        for (int i = 0; i < text.length; i++) {
            if (text[i].matches("[a-z]{3,}[1-9]{1}[0-9]{2}[A-Z]{1,}")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
