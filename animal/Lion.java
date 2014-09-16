package animal;

public class Lion extends Animal {

	public Lion() {
		drink();
		eat();
		walk();
		setPredator(true);
		setLegs(4);
		setColor("Yellow");
		setAge(1);
	}

	public Lion(String name, String eyesColor) {
		this();
		this.setName(name);
		this.setEyesColor(eyesColor);
	}

	@Override
	public Animal giveABirth() {
		Lion newBaby = new Lion(this.getName() + "Jr.", "Black");

		if (this.getEyesColor().toLowerCase().equals("black")) {
			newBaby.setEyesColor("Red");
			return newBaby;
		}

		return newBaby;
	}

	@Override
	public void roar() {
		System.out.println("i am a lion");
	}

	@Override
	public void eat() {
		System.out.println("Meat eater");
	}

	@Override
	public boolean isPredator() {
		return true;
	}

	@Override
	public void walk() {
		System.out.println("Walk with 4 legs");
	}
}