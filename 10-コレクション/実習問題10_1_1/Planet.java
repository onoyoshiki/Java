import java.util.ArrayList;

public class Planet {
	public static void main(String[] args) {
		String[] solarSystem = {
				"Sun", "Mercury", "Venus", "Mars", "Jupiter",
				"Saturn", "Uranus", "Neptune", "Pluto"};

		ArrayList<String> planet = new ArrayList<String>();
		
		for(int i=0; i<solarSystem.length; i++) {
			planet.add(solarSystem[i]);
		}
		
		planet.remove(8);
		planet.add(3, "Earth");
		
		for(String str : planet)
			System.out.println(str);
	}
}