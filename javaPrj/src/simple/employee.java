package simple;
public class employee {
	String name = aishu;
	String designation = teacher;
	int age;
	double salary;
	
	
	void input(String n1,String n2)
	{
name=n1;
designation=n2;
System.out.println("name is aishu"); 
System.out.println("designation is teacher");
}
void input(int a1) {
	age=a1;
	System.out.println("age is:" +age);
}
void input(double s1) {
	salary=s1;
System.out.println("salary is:" +salary);
}
public static void main(String args[]) {
	employee emp=new employee();
	emp.inputString();
	emp.input(23);
	emp.input(40000.0);
}
	
}
