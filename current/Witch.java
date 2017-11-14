//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game, Extended
//2017-11-13

public class Witch extends Protaganist{

    public Witch(){
	super();
	defense += 25;
    }

    public Witch(String newName){
	this();
	name = newName;
    }

    public static String about(){
	return "She was hanged for her crimes of \"existing\" and \"being annoying\", but she somehow managed to survive. She talks to herself and animals, and she says she's never been happier, attributing her power to those who tried to kill her. When asked if she felt bad about worshipping the devil for her power, she claimed that Earth during her trials was already Hell enough for her.";
    }

    public static void main(String [] args){
    }
}
