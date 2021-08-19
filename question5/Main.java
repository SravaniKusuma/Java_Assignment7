package question5;

class FirstOuter
{
	FirstOuter()
	{
		System.out.println("In the first  outer class constructor");
	}
	class FirstInner
	{
		FirstInner(int a,int b)
		{
			System.out.println("The value of a is : "+a+" and the value of b is : "+b);
			System.out.println("In the first inner class constructor");
		}
	}
}
class SecondOuter extends FirstOuter
{
	SecondOuter()
	{
		System.out.println("In the second outer class constructor");
	}
	class SecondInner extends FirstInner
	{
		SecondInner()
		{
			super(10,20);
			System.out.println("In the second inner class constructor");
		}
	}
}
public class Main{

	public static void main(String[] args) {
		
		SecondOuter so = new SecondOuter();
		SecondOuter.SecondInner si = so.new SecondInner();
		

	}

}
