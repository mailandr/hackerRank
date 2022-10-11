package hackerRank.einfacheAufgaben;

public class JavaSubstringComparisonV1 {

    public static void main(String[] args) {

        String s = "welcometojava";
        int k = 3;
        String[] arr = getSmallestAndLargest(s, k);
        String largest = sortArrLargest(arr);
        String smallest = sortArrSmallest(arr);
        System.out.printf(smallest + "\n" + largest);
    }

    public static String [] getSmallestAndLargest(String s, int k) {
        String[] arr = new String[s.length() + 1 - k];
        for (int i = 0; i < s.length() - k + 1; i++) {
            arr[i] = s.substring(i, i + k);
        }
        return arr;
    }

    public static String sortArrLargest(String[] arr) {
        String largest = "";
        for (int h = 0; h < arr.length; h++) {
            for (int pos = 0; pos < arr.length - 1; pos++) {
                if (arr[pos].compareTo(arr[pos + 1]) < 0) {
                    largest = arr[pos];
                    arr[pos] = arr[pos + 1];
                    arr[pos + 1] = largest;
                }
            }
        }
        return arr[0];
    }

    public static String sortArrSmallest(String[] arr) {
        String smallest = "";
        for (int h = 0; h < arr.length; h++) {
            for (int pos = 0; pos < arr.length - 1; pos++) {
                if (arr[pos].compareTo(arr[pos + 1]) > 0) {
                    smallest = arr[pos + 1];
                    arr[pos + 1] = arr[pos];
                    arr[pos] = smallest;
                }
            }
        }
        return arr[0];
    }
}
