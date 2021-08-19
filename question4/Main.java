package question4;

interface Cycle
{
	
	void ride();
}
//creating factories for each type of cycle
interface CycleFactory
{
	Cycle getCycle();
}

class Unicycle implements Cycle
{
	public void ride(){
		System.out.println("Riding Unicycle");
	}
}
class UnicycleFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Unicycle();
	}
}

class Bicycle implements Cycle
{
	public void ride()
	{
		System.out.println("Riding Bicycle");
	}
}
class BicycleFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Bicycle();
	}
}

class Tricycle implements Cycle
{
	public void ride()
	{
		System.out.println("Riding Tricycle");
	}
}
class TricycleFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Tricycle();
	}
}

public class Main
{
	
	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}
	public static void rideCycle(CycleFactory factory)
	{
		Cycle c = factory.getCycle();
		c.ride();
	}
}