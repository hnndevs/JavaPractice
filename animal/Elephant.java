package animal;

public class Elephant extends Animal {

	public Elephant() {
		drink();
		eat();
		walk();
		setPredator(false);
		setLegs(2);
		setColor("Grey");
		setAge(1);
	}

	public Elephant(String name, String eyesColor) {
		this();
		this.setName(name);
		this.setEyesColor(eyesColor);
	}

	@Override
	public Animal giveABirth() {
		Elephant babyElephant = new Elephant(this.getName() + "Woolly", "Grey");

		babyElephant.setName(this.getName() + "Woolly");

		if (this.getEyesColor().toLowerCase().equals("grey")) {
			babyElephant.setEyesColor("White");
		}

		return babyElephant;
	}

	@Override
	public void roar() {
		System.out.println("i am a Elephant");
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
		System.out.println("Walk with 4 legs");
	}

}
