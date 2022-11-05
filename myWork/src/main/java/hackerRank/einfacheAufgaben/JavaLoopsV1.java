package hackerRank.einfacheAufgaben;

public class JavaLoopsV1 {
    public static void main(String[] args) {

        int N = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = N * i;


            System.out.print(N + " x " + i + " = " + result);
            System.out.println();

        }
    }
}
