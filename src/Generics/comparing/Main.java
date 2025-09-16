package Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main  {
    public static void main(String[] args) {

        Student kunal = new Student(12, 99.85F);
        Student manoj = new Student(13, 99.85F);
        Student rahul = new Student(14, 93.85F);
        Student arpith = new Student(15, 79.85F);
        Student sachin = new Student(16, 76.85F);
        Student karan = new Student(17, 89.85F);

        Student[] students = new Student[] {kunal, manoj, arpith, rahul, sachin, karan};
        Arrays.sort(students,(Student o1, Student o2)-> {
            return (int) ((int) o1.marks - (int) o2.marks);
        });
        System.out.println(Arrays.toString(students));
        if(kunal.compareTo(manoj)==0){
            System.out.println("Kunal and Manoj has scored same marks");
        }

    }
}
