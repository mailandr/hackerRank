package codingCampus.Selbstkontrolle;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AufgabeDatenstroeme1 {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Mailandr\\IdeaProjects\\Milan\\hackerRank\\assets\\file.txt");

        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}

