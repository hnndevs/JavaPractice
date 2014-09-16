package demo;

import animal.Animal;
import animal.Elephant;
import animal.Lion;
import animal.Monkey;

public class Demo {
	public static void main(String[] args) {
		Animal[] cage = new Animal[9];
		cage[0] = new Lion("Simba", "Red");
		cage[1] = new Monkey("Wukong", "Yellow");
		cage[2] = new Elephant("Manny", "Grey");
		
		for (int i = 3; i < cage.length; i++) {
			cage[i] = cage[i - 3].giveABirth();
		}
		for (int i = 0; i < cage.length; i++) {
			System.out.println(cage[i].getName() + " " + cage[i].getEyesColor());
		}
	}
	
}
