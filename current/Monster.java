//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13  

public class Monster {
    //////////////
    //Attributes//
    //////////////
    protected String name;
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRate;

    ///////////////
    //Constructor//
    ///////////////
    public Monster() {
	HP = 150;
	strength = (int) (Math.random() * 45) + 20;
	defense = 20;
	attackRate = 1;
	name = "Monster";
    }

    ///////////
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

    public void lowerHP(int lostHP) {
	if (HP < lostHP){
	    HP = 0;
	}
	else{
	    HP -= lostHP;
	}
    }

    public int attack(Protagonist propro) {
	int damage = (int)(strength * attackRate) - propro.getDefense();
	propro.lowerHP(damage);
	return damage;
    }

    //start of main method
    public static void main (String [] args){
	System.out.println("THis works");
    }//end of main method
}
