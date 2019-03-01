//big thanks to https://alvinalexander.com/java/using-java-enum-tostring-tutorial for the code
public class Planet {
	public static void main(String[] args) {
		// loop through the enum values, calling the planets
	    
	    for (Planets Order: Planets.values())
	    {
	      System.out.println(Order); // printing out the order
	    }
	  }
	}

	enum Planets
	{
		Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus,Neptune //planets in our soler system
	}
