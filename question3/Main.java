package question3;
interface A
{
	public void printA();
	public void showA();
}
interface B
{
	public void printB();
	public void showB();
}
interface C
{
	public void printC();
	public void showC();
	
}
interface D extends A,B,C
{ 
	public void showD();
}
class Concrete
{
	public void printConcrete()
	{
		System.out.println("In the concrete class print method");
	}
}
class E extends Concrete implements D 
{
	public void printA()
	{
		System.out.println("It is the interafce A print method");
	}
	public void showA()
	{
		System.out.println("It is the interface A show method");
	}
	public void printB()
	{
		System.out.println("It is the interafce B print method");
	}
	public void showB()
	{
		System.out.println("It is the interface B show method");
	}
	public void printC()
	{
		System.out.println("It is the interafce C print method");
	}
	public void showC()
	{
		System.out.println("It is the interface C show method");
	}
	public void showD()
	{
		System.out.println("It is the interface D show method");
	}
	
	void method1(A a)
	{
		a.printA();
		a.showA();
		System.out.println("This method takes A interafce as argument");
	}
	void method2(B b)
	{
		b.printB();
		b.showB();
		System.out.println("This method takes B interafce as argument");
	}
	void method3(C c)
	{
		c.printC();
		c.showC();
		System.out.println("This method takes C interafce as argument");
	}
	void method4(D d)
	{
		d.showD();
		System.out.println("This method takes D interafce as argument");
	}
}
public class Main {

	public static void main(String[] args) {
		
		E obj =new E();
		obj.method1(new E());
		obj.method2(obj);
		obj.method3(obj);
		obj.method4(obj);
		obj.printConcrete();
		
	}

}
