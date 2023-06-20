package OOPS;
//super class
class Student  
{  
int reg_no;  
void getNo(int no)  
{  
reg_no=no;  
}  
void putNo()  
{  
System.out.println("registration number= "+reg_no);  
}  
}  
//intermediate sub class  
class Marks extends Student  
{  
float marks;  
void getMarks(float m)  
{  
marks=m;  
}  
void putMarks()  
{  
System.out.println("marks= "+marks);  
}  
}  
//derived class  
class Sports extends Marks  
{  
float score;  
void getScore(float scr)  
{  
score=scr;  
}  
void putScore()  
{  
System.out.println("score= "+score);  
}  
}  
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports sp = new Sports();
		sp.getNo(20);
		sp.putNo();
		sp.getMarks(50);
		sp.putMarks();
		sp.getScore(100);
		sp.putScore();

	}

}
