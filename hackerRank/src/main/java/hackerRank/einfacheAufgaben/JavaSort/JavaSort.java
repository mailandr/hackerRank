package hackerRank.einfacheAufgaben.JavaSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaSort {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
        List<Student> studentList = new ArrayList<Student>();
//        while (testCases > 0) {
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }
        Student a = new Student(33, "Rumpa", 3.68);
        Student a1 = new Student(85, "Ashis", 3.85);
        Student a2 = new Student(56, "Samiha", 3.75);
        Student a3 = new Student(19, "Samara", 3.75);
        Student a4 = new Student(22, "Fahim", 3.76);
        Student a5 = new Student(13, "Aahim", 3.75);

        studentList.add(a);
        studentList.add(a1);
        studentList.add(a2);
        studentList.add(a3);
        studentList.add(a4);
        studentList.add(a5);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
        System.out.println("-------------------------------");
        sortList(studentList);
    }

    public static void sortList(List<Student> liste) {

        liste.sort((o1, o2) -> (int) ((o2.getCgpa() * 1000) - (o1.getCgpa() * 1000)));

        Student tmp = new Student(0, "", 0);
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.size() - 1; j++) {
                if (liste.get(j).getCgpa() == liste.get(j + 1).getCgpa()
                        && liste.get(j).getFname().compareTo(liste.get(j + 1).getFname()) >= 0) {
                    tmp = liste.get(j + 1);
                    liste.set(j + 1, liste.get(j));
                    liste.set(j, tmp);
                } else if (liste.get(j).getCgpa() == liste.get(j + 1).getCgpa()
                        && liste.get(j).getFname().compareTo(liste.get(j + 1).getFname()) == 0
                        && liste.get(j).getId() < liste.get(j + 1).getId()) {
                    tmp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, tmp);
                }
            }
        }

        for (Student st : liste) {
            System.out.println(st.getFname());
        }


    }
}
