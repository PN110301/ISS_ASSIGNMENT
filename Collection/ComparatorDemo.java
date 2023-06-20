package Collection;
import java.util.*;
class Child{  
	int rollno,age;  
	String name;    
	//parameterized constructor
	Child(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
}  

class AgeComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
		Child s1=(Child)o1;  
		Child s2=(Child)o2;  
  
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}  
}  

class NameComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
		Child s1=(Child)o1;  
		Child s2=(Child)o2;  
  
		return s1.name.compareTo(s2.name);  
	}  
}  

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();  
		al.add(new Child(101,"Vijay",23));  
		al.add(new Child(106,"Ajay",27));  
		al.add(new Child(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Child st=(Child)itr.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Child st=(Child)itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

	}

}
