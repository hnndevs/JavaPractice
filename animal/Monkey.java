package animal;

public class Monkey extends Animal {
	public Monkey() {
		drink();
		eat();
		walk();
		setPredator(false);
		setLegs(2);
		setColor("black");
		setAge(1);
	}

	public Monkey(String name, String eyesColor) {
		this();
		this.setName(name);
		this.setEyesColor(eyesColor);
	}

	@Override
	public Animal giveABirth() {
		Monkey babyMonkey = new Monkey(this.getName() + "Goku", "black");
		babyMonkey.setName(this.getName() + "Goku");

		if (this.getEyesColor().toLowerCase().equals("black")) {
			babyMonkey.setEyesColor("Yellow");
		}
		return babyMonkey;
	}

	@Override
	public void roar() {
		System.out.println("i am a monkey");
	}

	@Override
	public void eat() {
		System.out.println("vegetable, fruit eater");
	}

	@Override
	public boolean isPredator() {
		return false;
	}

	@Override
	public void walk() {
		System.out.println("Walk with 2 legs(also can climb)");
	}

}
