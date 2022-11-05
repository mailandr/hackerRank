package codingCampus.Selbstkontrolle;

public class AufgabenMethoden {
    public static void main(String[] args) {

        String sign = "x";
        int amount = 10;
        int amount2 = 3;
        printLineStipple(sign, amount);
        System.out.println();
        System.out.println("------------------------------");
        printRowStipple(sign, amount2);
        System.out.println("------------------------------");
        printStippleL(sign, amount2);
        System.out.println("------------------------------");

    }

    public static void printLineStipple(String sign, int amount) {

        for (int i = 0; i < amount; i++) {
            System.out.print(sign + " ");
        }
    }

    public static void printRowStipple(String sign, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(sign + "\n");
        }
    }
    public static void printStippleL(String sign, int amount){
        printLineStipple(sign, amount);
        System.out.println();
        printRowStipple(sign, amount);
    }
}
