package leetCode.notSolved;

public class Problem0014 {
    public static void main(String[] args) {

        String[] strs = {"flower", "flower", "flower", "flower"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder text = new StringBuilder();
        int count = 0;
        //String tmp = strs[0];
        try {
            if (strs.length <= 1) {
                text.append(strs[0].charAt(0));
                return text.toString();
            }
//            while (strs[0].charAt(count) == strs[1].charAt(count)) {
//                text.append(strs[0].charAt(count));
//                ++count;
//            }
            while (strs[0].charAt(count) == strs[count + 1].charAt(count) && count < strs.length +1) {
                text.append(strs[0].charAt(count));
                ++count;
            }

        } catch (StringIndexOutOfBoundsException sioobe) {
            if (text.length() > 0) {
                return text.toString();
            } else {
                return "";
            }
        }
        return text.toString();
    }
}


