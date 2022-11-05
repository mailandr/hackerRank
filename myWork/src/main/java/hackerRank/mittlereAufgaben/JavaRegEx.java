package hackerRank.mittlereAufgaben;

public class JavaRegEx {
    public static void main(String[] args) {

        String sc = "000.12.12.034";
        String sc1 = "121.234.12.12";
        String sc2 = "23.45.12.56";
        String sc3 = "000.12.234.23.23";
        String sc4 = "666.666.23.23";
        String sc5 = ".213.123.23.32";
        String sc6 = "23.45.22.32.";
        String sc7 = "I.Am.not.an.ip";

        if (sc4.matches("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}")) {
            System.out.println("true");

        } else{
            System.out.println("false");
        }

    }
}
