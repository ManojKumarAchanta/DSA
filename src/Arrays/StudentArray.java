package Arrays;

import java.util.Arrays;

class Student{
    String rollNo;
    String name;
    int marks;
}
public class StudentArray {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        for(int i=0;i<5;i++) students[i] = new Student();
        students[0].name = "Manoj";
        students[0].marks = 98;
        students[0].rollNo = "22K61A1202";
        students[1].name = "Manideep";
        students[1].marks = 94;
        students[1].rollNo = "22K61A1203";
        students[2].name = "chaitu";
        students[2].marks = 91;
        students[2].rollNo = "22K61A1204";
        for(int i=0;i<3;i++)        System.out.println("Name: "+students[i].name+" Marks: "+students[i].marks);
    }
}
