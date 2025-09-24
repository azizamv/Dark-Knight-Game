package model;

public class Goblin extends Entity{

	public Goblin(int hP, int baseDamage) {
		super(hP, baseDamage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Entity e) {
		int totalDamage = this.getBaseDamage();
		int randomizedDmg = e.takeDamage(totalDamage);
		System.out.println("  Thief attack you for "+ randomizedDmg + " HP");
	}

}
