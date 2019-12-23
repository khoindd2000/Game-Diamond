
public class Game {
	private Frame frame;
	private int width, height;
	private String title;
	
	public Game(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
	}
	
	private void init() {
		frame = new Frame(title,width,height);
	}
}
