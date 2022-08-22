
public class GameRunner {
//to run bikegame tightly coupled
	// private MarioGame game;
	private BikeGame game;

	// public GameRunner(MarioGame game)
	public GameRunner(BikeGame game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
