package codingCampus.Random;

import java.util.*;

public class VectorAufgabe {
    public static void main(String[] args) {

        Vector<Integer> vectorA = createVectorWithRandom(3);
        Vector<Integer> vectorB = createVectorWithRandom(3);
        //System.out.println(vectorA + "\n" + vectorB);
        Vector<Integer> vectorAsorted = sortVectorDescending(vectorA);
        Vector<Integer> vectorBsorted = sortVectorDescending(vectorB);
        System.out.println(vectorAsorted + "\n" + vectorBsorted);
        Vector<Integer> newVector = new Vector<>();


        int indexA = 0;
        int indexB = 0;

        while (indexA < vectorAsorted.size() && indexB < vectorBsorted.size()) {
            if (vectorAsorted.get(indexA) > vectorBsorted.get(indexB)) {
                newVector.add(vectorAsorted.get(indexA));
                ++indexA;
            } else {
                newVector.add(vectorBsorted.get(indexB));
                ++indexB;
            }
        }
        while (indexA < vectorAsorted.size()){
            newVector.add(vectorAsorted.get(indexA));
            ++indexA;
        }
        while (indexB < vectorBsorted.size()){
            newVector.add(vectorBsorted.get(indexB));
            ++indexB;
        }
        System.out.println(newVector);
    }


    public static Vector sortVectorDescending(Vector<Integer> zahlen) {
        Comparator<Object> comparator = Collections.reverseOrder();
        Collections.sort(zahlen, comparator);


        return zahlen;
    }

    public static Vector createVectorWithRandom(int size) {
        Random random = new Random();
        Vector<Integer> vt = new Vector<>();
        for (int i = 0; i < size; i++) {
            vt.add(random.nextInt(100));
        }
        return vt;
    }
}

