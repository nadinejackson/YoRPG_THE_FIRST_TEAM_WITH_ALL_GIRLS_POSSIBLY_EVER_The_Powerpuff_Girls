//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14
public class Character{
    //////////////
    //Attributes//
    //////////////
    protected String name;
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRate;

    public Character() {
	HP = 150;
	strength = (int) (Math.random() * 45) + 20;
	defense = 20;
	attackRate = 1;
	name = "Monster";
    }

    public Character(String newName, int newHP, int newStrength, int newDefense, double newAttackRate) {
	this();
	name = newName;
	HP = newHP;
        strength = newStrength;
	defense = newDefense;
	attackRate = newAttackRate;
    }


    //////////////
    //Methods//
    ///////////
    public boolean isAlive() {
	return HP > 0;
    }

    public int getDefense() {
	return defense;
    }

    public String getName() {
	return name;
    }

    public double getAttackRate() {
	return attackRate;
    }

    public void lowerHP(int lostHP) {
	if (HP < lostHP){
	    HP = 0;
	}
	else{
	    HP -= lostHP;
	}
    }

    public void setDefense(int newDefense) {
	defense = newDefense;
    }

    public void setAttackRate(double newAttackRate) {
	attackRate = newAttackRate;
    }
    
    public int attack(Character propro) {
	int damage = (int)(strength * attackRate) - propro.getDefense();
	propro.lowerHP(damage);
	return damage;
    }

    //main method
    public static void main (String [] args){
	
    }
}
