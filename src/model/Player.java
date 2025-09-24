package model;

public class Player extends Entity{
	Item currentItem;
	int startHp;

	public Player(int hP, int baseDamage) {
		super(hP, baseDamage);
		this.startHp = hP;
		this.currentItem = null;
	}

	public Item getCurrentItem() {
		return currentItem;
	}

	public void setCurrentItem(Item currentItem) {
		this.currentItem = currentItem;
	}
	
	public int getStartHp() {
		return startHp;
	}

	public void setStartHp(int startHp) {
		this.startHp = startHp;
	}

	@Override
	public void attack(Entity e) {
		int totalDamage = this.getBaseDamage();
		if (currentItem != null) {
			if (currentItem instanceof Excalibur) {
				totalDamage += totalDamage * 10 / 100;
			}
		}
		int randomizedDmg = e.takeDamage(totalDamage);
		System.out.println("  You hit the enemy for "+ randomizedDmg + " HP");
	}
}
