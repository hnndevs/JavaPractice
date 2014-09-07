public class Mage {
	int health;
	int mana;
	long exp;
	String name;
	int level;
	boolean isDead;

	public Mage(String name, int level) {
		this.name = name;
		health = 100;
		mana = 50;
		exp = 0;
		this.level = level;
	}

	public Mage() {
		name = "Oni";
		health = 100;
		mana = 50;
		exp = 0;
		level = 10;
	}

	void levelUp() {
		level += 1;
	}

	void castFireBolt() {
		if (mana < 10) {
			System.out.println("not enough mana");
		} else {
			mana -= 10;
		}

	}

	void drinkPotion(int health, int mana) {
		this.health += health;
		this.mana += mana;
		if (this.health > 100) {
			this.health = 100;
		}
		if (this.mana > 50) {
			this.mana = 50;
		}
	}

	void drinkPotion(long exp) {
		this.exp += exp;
	}

	void attack(Mage enemy) {
		castFireBolt();
		enemy.health -= 30;
		if (enemy.health <= 0) {
			enemy = null;
			levelUp();
		} else if (enemy.health <= 10) {
			enemy.drinkPotion(30, 0);
		}

	}

	void creatNewMage(String name, int level) {
		Mage mageCreator = new Mage(name, level);
		// mageCreator.name = name;
		mageCreator.castFireBolt();

	}
}
