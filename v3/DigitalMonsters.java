//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW31 -- Ye Olde Role Playing Game, Expanded 
//2017-11-13

public class DigitalMonsters extends Monster{

    public DigitalMonsters(){
	super();
	strength += 25;
    }

    public DigitalMonsters(String newName){
	this();
	name = newName;
    }

    public static String about (){
	return "In the world of Digital Monsters, there are four evil lords, who control all four corners of the Digital World. They brainwashed all the digimon, turning once friendly digimon into blood thirsty demons that seek to eliminate all of humanity for sport. They have been known to count their 'rankings' in terms of human kills amongst each other. Their nature may once have been kind, but now, they are merely zombies, following the commands of their overlords, and as such, deserve little, if any, mercy. If any mercy is to be shown, it would be a quick death.";
    }

    public static void main(String [] args){

    }
}
