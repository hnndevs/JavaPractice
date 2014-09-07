/**
 * @author Hoang
 *
 */
public class Practice {

	public static void main(String[] args) {
		Mage me = new Mage();
		Mage enemy = new Mage("Atula", 1);
		
		me.levelUp();
		System.out.println("level = " + me.level);
		me.castFireBolt();
		
		me.attack(enemy);
		for (int i = 0; i < 10; i++) {
			me.castFireBolt();
			me.attack(enemy);
		}
		int i = 0;
		while (i < 10) {
			me.castFireBolt();
			me.attack(enemy);
			i++;
		}
		me.creatNewMage("new mage",10);
		
	}
	
	
}
