package codingCampus.Random;

import java.util.Arrays;

public class CaesarKey {
    public static void main(String[] args) {
        String text = "Dies ist ein Beispieltext der mit einem Klick verschlüsselt werden kann. Hier kann auch " +
                "ein eigenen Text herein geschrieben, oder ein Geheimcode zum Entschlüsseln herein " +
                "kopiert werden.";
        int schluessel = 3;

        System.out.println("Original Text:");
        System.out.println(text);
        System.out.println("Verschlüsselter Text:");
        String encrypted = encrypt(text, schluessel);
        System.out.println(encrypted);
        System.out.println("Entschlüsselter Text:");
        String decrypted = decrypt(encrypted, schluessel);
        System.out.println(decrypted);

    }

    public static String decrypt(String text, int key) {
        char[] arr = text.toCharArray();
        int[] text2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ' && arr[i] != '.' && arr[i] != ',' && arr[i] > 65 + key && arr[i] != 'ü' && arr[i] != 'ä' && arr[i] != 'ö') {
                text2[i] = arr[i] - key;
            } else if (arr[i] > 64 && arr[i] < 66 + key) {
                text2[i] = (arr[i] - key) + 58;
            } else {
                text2[i] = arr[i];
            }
        }
        StringBuilder key2 = new StringBuilder();
        for (int x : text2) {
            key2.append((char) x);
        }
        return key2.toString();
    }

    public static String encrypt(String text, int key) {
        char[] arr = text.toCharArray();
        int[] text2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ' && arr[i] != '.' && arr[i] != ',' && arr[i] < 123 - key) {
                text2[i] = arr[i] + key;
            } else if (arr[i] > 122 - key && arr[i] != 'ü' && arr[i] != 'ä' && arr[i] != 'ö') {
                text2[i] = (arr[i] + key) - 58;
            } else {
                text2[i] = arr[i];
            }
        }

        StringBuilder key2 = new StringBuilder();
        for (int x : text2) {
            key2.append((char) x);
        }
        return key2.toString();
    }
}
