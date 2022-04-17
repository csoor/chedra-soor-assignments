package species;

public class Mammal {
	int energyLevel = 300;
	public int displayEnergy()
	{
		System.out.printf("Energy Level: ", energyLevel);
		return energyLevel;
	}
	public Mammal(int energyLevel)
	{
		this.energyLevel = energyLevel;
	}
}
