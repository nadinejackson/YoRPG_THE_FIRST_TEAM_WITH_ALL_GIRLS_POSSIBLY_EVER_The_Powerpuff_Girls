//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14  

public class Monster extends Character {
    //////////////
    //Attributes//
    //////////////

    
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
    

    //start of main method
    public static void main (String [] args){
	System.out.println("THis works");
    }//end of main method
}
