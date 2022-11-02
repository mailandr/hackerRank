package codingCampus.Selbstkontrolle;

public class AufgabenSchleifen {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
        for (int i = -30; i <= 30; i = i + 3) {
            System.out.println(i);

        }
        System.out.println("------------------------------");

        int x = 0;

        while (x <= 10) {
            System.out.println(x);
            ++x;
            if (x > 6 && x <= 10) {
                System.out.println();
            }
        }
        System.out.println("------------------------------");
    }
}
