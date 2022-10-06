package hackerRank.einfacheAufgaben;

public class JavaStringReverse {

    public static void main(String[] args) {

        //Abfrage ob es sich der String Input um ein Palindrom handelt

        String input = "madam";

        char[] abfrage = input.toCharArray();
        int jaNein = retrunOnOff(abfrage);

        if (jaNein >= abfrage.length / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static int retrunOnOff(char[] abfrage) {
        int count = 0;
        for (int i = 0; i < abfrage.length / 2; i++) {
            if (abfrage[i] == abfrage[abfrage.length - i - 1]) {
                count++;
            }
        }
        return count;
    }
}
