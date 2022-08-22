
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TO RUN BIKEGAME BikeGme object creation & change in GameRunner = Tight couple
		//more changes = tightly coupled
		//less changes =loosely coupled
		
		//MarioGame game = new MarioGame();
		BikeGame game= new BikeGame();
		GameRunner runner = new GameRunner(game);

		runner.runGame();
	}

}
