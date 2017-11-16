//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW33 -- Ye Olde Role Playing Game, Realized
//2017-11-15
/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;   //Is it man or woman?
  private Monster smaug; //Friendly generic monster name?

  private int moveCount;
  private boolean gameOver;
  private int difficulty;
  private int chara;
    private String chargeBar;
    private int counter = 0;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG()
  {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:  
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame()
  {
    String s;
    String name = "";
    String about = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    }
    catch ( IOException e ) { }
    
   

    s = "\nWhat form of warrior shall you take on this grueling fight aganist unknown and unseen foes? A cruel Mafia, a powerful Witch, or an all-knowing Plague Doctor?  \n";
    s += "\t1: Mafia\n";
    s += "\t2: Plague Doctor\n";
    s += "\t3: Witch\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    chara = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    //instantiate the player's character
    //pat = new Protagonist( name );
    if (chara == 1) {
	pat = new Mafia(name);
	//about = Mafia.about();
    } else {if (chara == 2) {
	pat = new PlagueDoctor(name);
	//about = PlagueDoctor.about();
    } else {
	pat = new Witch(name);
	//about = Witch.about();
    }}

    about = pat.about();

    System.out.println(about);
    
  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2;
    int rand = (int) (Math.random() * 3);
    String monsterType = ""; 

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    if (rand == 0) {
		smaug = new MoshiMonsters();
		monsterType = "Moshi Monster";
	    } else if (rand == 1) {
		smaug = new PocketMonsters();
		monsterType = "Pocket Monster";
	    } else {
		smaug = new DigitalMonsters();
		monsterType = "Digital Monster";
	    }

	    System.out.println("\nIt is a "+monsterType+".");

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
	  if ((counter%3 == 0) && (counter != 0)) {
	      System.out.println( "\t3: Or you can use your Special Attack!");
	  }
	  i = Integer.parseInt( in.readLine() );
	  
        }
        catch ( IOException e ) { }

        if ( i == 2 ) {
	    pat.specialize();
	}
        else if ( i == 4 ){
	    smaug.instantKill();
	    System.out.println("You have found the power from the heavens and killed the monster with one blow.");
	    return false;
	}
	else if ((i == 3) && ((counter%3 == 0) && (counter != 0))){
	    pat.specialAttack();
	}
	else {
	    pat.normalize();
	}

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");
	counter += 1;
	
	if ((counter%3 == 0) && (counter != 0)){
	    chargeBar = "full! \t Next round you will have the chance for a special attack!";
	}
	else {
	    chargeBar = "" + (counter%3) + "/3 " + "full";
	System.out.println("\n" + "Your special attack is " + chargeBar + "!" );
	}
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args )
  {
    //As usual, move the begin-comment bar down as you progressively 
    //test each new bit of functionality...

    
    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
		break;
    encounters++;
    System.out.println();
    }

    System.out.println( "Thy game doth be over." );
/*================================================
    ================================================*/
  }//end main

}//end class YoRPG


