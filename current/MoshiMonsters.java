//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game, Extended
//2017-11-13

public class MoshiMonsters extends Monster {

    public MoshiMonsters() {
	super();
	defense += 25;
    }

    public MoshiMonsters(String newName){
	this();
	name = newName;
    }

    public static String about(){
	return "Moshi Monsters are affectionate, cute, and love to sing and dance with everyone they find. But like the sirens that sing to sailors, at their core, they are evil. They use their outward appearance to convince innocent humans to follow them into their forest, where they torture them. Every person who's fallen into the clutches of Moshis show up dead, weeks after they've been captured, their bodies decorated with flowers.";
}
