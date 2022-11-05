package hackerRank.einfacheAufgaben;

public class JavaSubstringComparisonV2 {
    public static void main(String[] args) {

        String S = "welcometojava";
        int start = 3;
        String result = getSmallestAndLargest(S,start);

        System.out.println(result);

    }
    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String str, result;

        for (int i = 0; i <= s.length() - k; i++) {

            str = s.substring(i, k + i);
            if (str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if (str.compareTo(largest) > 0) {
                largest = str;
            }
        }
        result = smallest + "\n" + largest;
        return result;
    }

}
