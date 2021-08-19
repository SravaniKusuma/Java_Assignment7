package question1;

abstract class Rodent{
	
	Rodent()
	{
		System.out.println("It is the rodent constructor");
	}
	abstract void eat();
	abstract void gnaw();
	
}
class Mouse extends Rodent
{
	Mouse()
	{
		System.out.println("It is the mouse contructor");
	}
	void eat()
	{
		System.out.println("Mouse can eat grains,fruits and seeds");
	}
	void gnaw()
	{
		System.out.println("Mouse have specialized teeth for gnawing");
	}
}
class Gerbil extends Rodent
{
	Gerbil()
	{
		System.out.println("It is the Gerbil contructor");
	}
	void eat()
	{
		System.out.println("Gerbil can eat seeds of various grases");
	}
	void gnaw()
	{
		System.out.println("Gerbils have strong and sharp teeth for gnawing");
	}
}
class Hamster extends Rodent
{
	Hamster()
	{
		System.out.println("It is the Hamster contructor");
	}
	void eat()
	{
		System.out.println("Hamster can eat chees,aplles and carrot");
	}
	void gnaw()
	{
		System.out.println("Hamster have rough teeth for tackling tough food");
	}
}
public class Main
{
	public static void main(String args[])
	{
		Rodent[] rodent  = new Rodent[3];
		Mouse m =new Mouse();
		rodent[0]=m;
		rodent[0].eat();
		rodent[0].gnaw();
		Gerbil g =new Gerbil();
		rodent[1]=g;
		rodent[1].eat();
		rodent[1].gnaw();
		Hamster h = new Hamster();
		rodent[2]=h;
		rodent[2].eat();
		rodent[2].gnaw();
		
	}
}
