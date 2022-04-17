package species;

public class Bat extends Mammal {

	public Bat()
	{
		super(300);
	}
	public void fly()
	{
		System.out.println("Soaring through the night sky");
		energyLevel -= 50;
		displayEnergy();
	}
	public void eatHumans()
	{
		System.out.println("Bat eats Human");
		energyLevel += 25;
		displayEnergy();
	}
	public void attackTown()
	{
		System.out.println("Town in chaos, total destruction");
		energyLevel -= 100;
		displayEnergy();
	}
}
