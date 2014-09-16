package animal;

public abstract class Animal {
	private String name;
	private String color;
	private String eyesColor;
	private int legs;
	private int age;
	private boolean isPredator;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			System.out.println("name is not valid");
		} else {
			this.name = name;
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.isEmpty()) {
			System.out.println("color is not valid");
			return;
		}

		this.color = color;

	}

	public String getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(String eyesColor) {
		if (eyesColor.isEmpty()) {
			System.out.println("eyes color is not valid");
			return;
		}
		this.eyesColor = eyesColor;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		if (legs < 0) {
			System.out.println("Cannot have lower than 0");
			return;
		}
		this.legs = legs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 10) {
			System.out.println("the age is not valid");
			return;
		}
		this.age = age;
	}

	public boolean isPredator() {
		return isPredator;
	}

	public void setPredator(boolean isPredator) {
		this.isPredator = isPredator;
	}

	public void walk() {
		System.out.println("Is walking");
	}

	public void eat() {
		System.out.println("is eating");
	}

	public void drink() {
		System.out.println("is drinking");
	}

	public void roar() {
		System.out.println("ROAAARRR");
	}

	public abstract Animal giveABirth();

}
