package hackerRank.hackerRank;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        if (N >= 2 && N <= 5 && N % 2 == 0) {
            System.out.println("Not Weird");
        } else if (N >= 21 && N % 2 == 0) {
            System.out.println("Not Weird");
        } else
            System.out.println("Weird");
    }

}
