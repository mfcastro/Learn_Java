
public class Player {
	String PlayerName;
	int PlayerHealth = 100;
	int IQ = 100;

	public Player(String playerName){
		PlayerName = playerName;
	}

	
	public int Read(int number) {
		return IQ += number;
	}
	
	public int Eat(int number){
		return PlayerHealth += number;
	}

}
