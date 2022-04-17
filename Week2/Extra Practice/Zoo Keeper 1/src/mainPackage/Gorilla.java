package mainPackage;

public class Gorilla extends Mammal{
	
	public int throwSomething()
	{
		System.out.println("Gorilla threw banana's at you" );
		super.energyLevel -= 5;
		return super.energyLevel;
	}
	public int eatBananas()
	{
		System.out.println("Banana Yummy in my Tummy");
		super.energyLevel += 10;
		return super.energyLevel;
	}
	public int climb()
	{
		System.out.println("Gorilla climbed tree");
		super.energyLevel -= 10;
		return super.energyLevel;
	}
}
