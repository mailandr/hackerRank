package hackerRank.hackerRank;

public class JavaLoopsV2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 2;
        int n = 10;
        int j = 1;
        int result2 = 0;
        int result3 = 0;


        for (int k = 0; k < n; k++) {
            int result = j * b;
            j = j * 2;
            result2 = result + result3;
            result3 = result2;
            System.out.print(result2 + a + " ");
        }
        System.out.println();


        int x = 5;
        int y = 3;
        int z = 5;
        int l = 1;
        int result4 = 0;
        int result5 = 0;

        for (int k = 0; k < z; k++) {
            int result = l * y;
            l = l * 2;
            result4 = result + result5;
            result5 = result4;
            System.out.print(result4 + x + " ");
        }

    }
}
