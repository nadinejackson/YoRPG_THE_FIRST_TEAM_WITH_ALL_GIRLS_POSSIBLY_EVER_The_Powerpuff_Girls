//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game
//2017-11-08   
public class Protagonist extends Character{
    //Attributes
    protected int defenseStor;
    protected double attackStor;
	
    //Constructors
    public Protagonist(){
	HP = 100;
	strength = 50;
	defense = 50;
	attackRate = 0.5;
	name = "Pat";        
    }
    public Protagonist (String newName){
	name = newName;
    }
	
    //Methods
    public void specialize(){
        setDefense((int)(getDefense() / 2));
	setAttackRate(getAttackRate() * 2);
    }
    public void normalize(){
	setDefense(defenseStor);
	setAttackRate(attackStor);
    }
    //start of main method
    public static void main(String [] args){
	System.out.println(" This works");
    }//end of the main method
}
