package codingCampus.Selbstkontrolle;

import java.io.*;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class AufgabeDatenstroeme2 {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Mailandr\\IdeaProjects\\Milan\\hackerRank\\assets\\file.txt");
//        String line = "a";
//        try {
//            Scanner sc = new Scanner(f);
//            while (sc.hasNextLine()) {
//                line = sc.nextLine();
//            }
//            sc.close();
//        } catch (FileNotFoundException fnfe) {
//            fnfe.printStackTrace();
//        }
        String line = inputText(f);
        String[] newarr = line.split("\\s+");
        System.out.println(Arrays.toString(newarr));

        int counter = newarr.length;
        System.out.println(counter);
    }
    public static String inputText(File f){
        StringBuilder content = new StringBuilder();
        try{
            Reader reader =  new InputStreamReader(new FileInputStream("hackerRank/assets/file.txt"));
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()){
                String line = br.readLine();
                content.append(line);
                content.append('\n');
            }
            br.close();
        }catch (IOException ieo){
            ieo.printStackTrace();
        }
        return content.toString();
    }
}
