//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14   
public abstract class Protagonist extends Character{
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
    public abstract void specialize();/*{
        setDefense((int)(getDefense() / 2));
	setAttackRate(getAttackRate() * 2);
	}*/
    public abstract void normalize();//{
	//setDefense(defenseStor);
	//setAttackRate(attackStor);
	//}
    //start of main method
    public abstract String about();
    public static void main(String [] args){
	System.out.println(" This works");
    }//end of the main method
}
