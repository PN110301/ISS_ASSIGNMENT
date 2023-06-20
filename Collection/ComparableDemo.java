package Collection;
import java.util.*;  

//Java Comparable interface is used to order the objects of the user-defined class
class Student implements Comparable<Student> {  
    public String name;  
  public Student(String name) {  
    this.name = name;  
  }  
  public int compareTo(Student person) {  
    return name.compareTo(person.name);   //It is used to compare the current object with the specified object
      
  }   
}  
public class ComparableDemo {  
  public static void main(String[] args) {  
      ArrayList<Student> al=new ArrayList<Student>();  
      al.add(new Student("Ram"));  
      al.add(new Student("Shyam"));  
      al.add(new Student("Aakash"));  
      al.add(new Student("Tina"));  
      
    Collections.sort(al);  
    for (Student s : al) {  
      System.out.println(s.name);  
    }  
  }  
}  
