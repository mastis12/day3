package day3;

class Parent1{
	int a=10;
	void m1()
	{
	System.out.println("parent method,not overridden");
	}
	void m11()
	{
	System.out.println("m11  overridden-parent");
	}
}


public class Child extends Parent {
	int b=20;
	void m2()
	{
	System.out.println("child class specific method");
	}
	void m11()//overriding method
	{
	System.out.println("m11 overriding method-child");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1=new Parent();
		//parent reference variable referring parent class object
		p1.m1();//parent  method,not overridden
		System.out.println(p1.a);//10
		
		//p1.m2(); CE
		//System.out.println(p1.b); CE
		
		Child  c1=new Child();
		c1.m1();//valid - parent  method,not overridden
		c1.m2();//child class specific method
		System.out.println(c1.a);//valid- 10
		System.out.println(c1.b);//20
		
		Parent p2=new Child();//now overriding comes into picture.
		//parent class reference variable(p2) can be used 
		//to refer child class object
		p2.m1();//parent method,not overridden
		p2.m11();//m11 overriding method-child
		//p2.m2();  CE because m2() is not available in the parent
		
		
		//Child c2=new Parent(); CE
		//child class reference variable(c2) cannot be used
		//to refer parent class object
		}

}
