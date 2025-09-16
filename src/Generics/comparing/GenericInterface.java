package Generics.comparing;

public interface GenericInterface<T> extends Comparable<T> {
    public void display(T val);

    int compareTo(Student o);
}
