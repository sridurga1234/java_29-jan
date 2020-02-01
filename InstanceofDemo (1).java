class Parent{}
class Child1 extends Parent{}
class Child2 extends Parent{}
class InstanceofDemo
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		System.out.println(c1 instanceof Parent); //true child c1=new Parent();
		System.out.println(c2 instanceof Parent); //true child c2=new Parent();
		System.out.println(p instanceof Child1); //false Parent p=new Child1();
		System.out.println(p instanceof Child2); //false Parent c1=new Child2();
		p=c1;
		System.out.println(p instanceof Child1); //true child c1=new Child1();
		System.out.println(p instanceof Child2); //false child c1=new Child2();
		p=c2;
		System.out.println(p instanceof Child1); //false child c1=new Child1();
		System.out.println(p instanceof Child2); //true child c1=new Child2();
	}
}