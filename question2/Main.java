package question2;
class Cycle
{
	public void moneyRequired()
	{
		System.out.println("The amount required for purchasing a particular type of cycle is maximum of 5000");
	}
}
class Unicycle extends Cycle
{
	public void moneyRequired()
	{
		System.out.println("The amount required for purchasing unicycle is  700");
	}
}
class Bicycle extends Cycle
{
	public void moneyRequired()
	{
		System.out.println("The amount required for purcahsing bicycle is 3000");
	}
	
}
class Tricycle extends Cycle
{
	/*As Tricycle class extends cycle class if we do not override those methods when we create
	 * object of Tricycle and call balance() method then it calls parent class Cycle() method
	 */
}
public class Main {

	public static void main(String[] args) {
		Cycle[] cycle = new Cycle[3];
		//upcasting
		cycle[0] =new Unicycle();
		cycle[0].moneyRequired();
		cycle[1]= new Bicycle();
		cycle[1].moneyRequired();
		cycle [2]= new Tricycle();
		//As tricycle class does not have balance method then when we call that method then it invokes parent class method
		cycle[2].moneyRequired();
		//Downcasting implicitly gives error like the below statement
		//Bicycle b = new Cycle();
		//Downcating explicitly compiles successfully but class cast exception willbe thrown at run time.
		//Bicycle b =(Bicycle) new Cycle();
		
		

	}

}
