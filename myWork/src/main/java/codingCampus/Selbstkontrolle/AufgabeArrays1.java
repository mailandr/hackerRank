package codingCampus.Selbstkontrolle;

public class AufgabeArrays1 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(getFirstAndLast(arr));

    }

    public static String getFirstAndLast(int[] num) {
        return "First: " + num[0] + ", last: " + num[num.length - 1];
    }

}
