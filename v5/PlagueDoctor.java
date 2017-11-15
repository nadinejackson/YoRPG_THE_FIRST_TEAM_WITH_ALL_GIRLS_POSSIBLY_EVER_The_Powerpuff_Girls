//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14  

public class PlagueDoctor extends Protagonist{
    
    public PlagueDoctor(){
	super();
	HP += 25;
    }

    public PlagueDoctor(String newName){
	this();
	name = newName;
    }
    public void specialize(){
	defense = defense / 2;
	attackRate = attackRate * 2;
    }
    public void normalize(){
	defense = defenseStor;
	attackRate = attackStor;
    }
    public String about(){
	return "In his/her fashionable beak mask, totally legit medical degree in hand, the Plague Doctor is ready to battle both disease and monsters. To be a Plague Doctor, one must have a strong sense of...humor. Armed with leeches and the unearned trust of the public, the Plague Doctor has such maxims to live by as: \"Don't hang around corpses, you idiot\" and \"Ew, don't drink that water. It's gross.\""; 
    }

    public static void main(String[] args){
    }
}
