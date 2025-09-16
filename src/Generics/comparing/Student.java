package Generics.comparing;

 public class Student implements GenericInterface<Student> {
   int rollNo;
   float marks;
   public Student(int rollNo, float marks){
       this.rollNo = rollNo;
       this.marks = marks;
   }
    @Override
    public String toString(){
       return "Student rollNo: "+rollNo+" marks: "+marks;
    }
     @Override
     public void display(Student val) {

     }

     @Override
   public int compareTo(Student o){
       return (int)((int)this.marks-o.marks);
   }

}
