package model;

import java.util.Random;

public abstract class Entity {
	int HP;
	int baseDamage;
	public Entity(int hP, int baseDamage) {
		super();
		HP = hP;
		this.baseDamage = baseDamage;
	}
	
	public abstract void attack(Entity e);
	
	public int takeDamage(int damage) {
		Random rand = new Random();
		int dmg = (int) (damage * rand.nextFloat());
		this.HP -= dmg;
		return dmg;
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getBaseDamage() {
		return baseDamage;
	}
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
}
